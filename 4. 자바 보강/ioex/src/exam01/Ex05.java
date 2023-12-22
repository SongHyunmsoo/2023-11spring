package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        byte[] buffer = new byte[5];

        try (
                FileInputStream fis = new FileInputStream("test2.txt")){

                while (fis.available()> 0) {
                    int ch = fis.read(buffer);
                    for (int i = 0; i< buffer.length; i++){
                        System.out.println((char)buffer[i]);
                    }
                }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
