package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        try (FileInputStream fos = new FileInputStream("test2.txt")) {
            for(char ch = 'A'; ch<='Z'; ch++){
                fos.Write(ch);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
