package six.demo02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {
    public static void main ( String[] args ) throws IOException {
        String fileName = "/home/ygj/IdeaProjects/review2/src/six/demo02//newHello.txt" ;
        BufferedWriter out = new BufferedWriter(
                new FileWriter( fileName ) );
        out.write( "Hello!"  );
        out.newLine() ;
        out.write( "This is another text file using BufferedWriter,"  );
        out.newLine(); ;
        out.write( "So I can use a common way to start a newline" );
        out.close();
    }
}
