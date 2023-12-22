package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test1.txt")){
            char ch = (char)fis.read(); // 1 바이트 읽기 char(2,3) - 양의 정수
            System.out.println(ch);

            ch = (char)fis.read(); // 1바이트 읽기
            System.out.println(ch);

            ch = (char)fis.read();
            System.out.println(ch);

            ch = (char)fis.read();
            System.out.println(ch);

            ch = (char)fis.read();
            System.out.println(ch);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
