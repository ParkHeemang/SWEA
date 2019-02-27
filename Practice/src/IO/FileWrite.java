package IO;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileWrite {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("c:/Users/user/out4.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            pw.write(data);
        }
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/Users/user/out4.txt", true));
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            pw2.write(data);
        }
        pw2.close();

	}

}
