package six.demo04;

import java.io.*;

public class NewCopyBytes {
    public static void main(String[] args) {
        DataInputStream instr;
        DataOutputStream outstr;
        if (args.length != 2) {
            System.out.println("Please Enter file names!");
            return;
        }
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
        if (outFile.exists()) {
            System.out.println(args[1] + " already exists");
            return;
        }
        if (!inFile.exists()) {
            System.out.println(args[0] + " does not exist");
            return;
        }
        try {
            instr = new DataInputStream(new BufferedInputStream(
                    new FileInputStream( inFile )));
            outstr = new DataOutputStream(new BufferedOutputStream(
                    new FileOutputStream( outFile  )));

            try {
                int data;
                while (true) {
                    data = instr.readUnsignedByte();
                    outstr.writeByte(data);
                }
            } catch (EOFException eof) {
                outstr.close();
                instr.close();
                return;
            }
        } catch (FileNotFoundException nfx) {
            System.out.println("Problem opening files");
        } catch (IOException iox) {
            System.out.println("IO Problems");
        }
    }
}

