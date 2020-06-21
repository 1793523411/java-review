package six.demo02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main ( String[] args ) {
        String fileName = "/home/ygj/IdeaProjects/review2/src/six/demo02/newHello.txt" , line;
        try {
            BufferedReader in = new BufferedReader(
                    new FileReader( fileName  ) );
            line = in.readLine();   //读取一行内容
            while ( line != null ) {
                System.out.println( line );
                line = in.readLine();
            }
            in.close();
        }
        catch ( IOException iox ) {
            System.out.println("Problem reading " + fileName );
        }
    }

}
