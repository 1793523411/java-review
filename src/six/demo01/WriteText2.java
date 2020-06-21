package six.demo01;

import java.io.FileWriter;
import java.io.IOException;

public class WriteText2 {
    public static void main ( String[] args ) {
        String fileName = "/home/ygj/IdeaProjects/review2/src/six/demo01/Hello2.txt" ;
        try {  //将所有IO操作放入try块中
            FileWriter writer = new FileWriter( fileName ,true );
            writer.write( "Hello!\n");
            writer.write( "This is my first text file,\n"  );
            writer.write( "You can see how this is done. \n" );
            writer.write("输入一行中文也可以\n");
            writer.close();
        }
        catch ( IOException iox) {
            System.out.println("Problem writing" + fileName ); }
    }
}
