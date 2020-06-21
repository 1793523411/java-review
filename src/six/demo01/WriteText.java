package six.demo01;

import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
    public static void main ( String[] args ) throws IOException {
        //main方法中声明抛出IO异常
        String fileName = "/home/ygj/IdeaProjects/review2/src/six/demo01/Hello.txt";
        FileWriter writer = new FileWriter( fileName );
        writer.write( "Hello!\n");
        writer.write( "This is my first text file,\n"  );
        writer.write( "You can see how this is done.\n" );
        writer.write("输入一行中文也可以\n");
        writer.close();
    }

}
