package zuoye;

import java.io.*;

public class IoStreamTest {
    public static void main(String[] args) throws IOException {
        File fl= new File("/Users/tomas/Downloads/a.txt");
        FileOutputStream fop= new FileOutputStream(fl);
        OutputStreamWriter writer= new OutputStreamWriter(fop,"UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();
        FileInputStream fis=new FileInputStream(fl);
        InputStreamReader reader= new InputStreamReader(fis,"UTF-8");
        StringBuffer sb= new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();



    }
}
