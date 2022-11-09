import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ValidPhoneNumber {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        InputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            if (s.matches("(\\d){3}[\\\\-](\\d){3}[\\\\-](\\d){4}$")){
                System.out.println(s);
            }
            if(s.matches("^[\\\\(](\\d){3}[\\\\)](\\s)(\\d){3}[\\\\-](\\d){4}$")){
                System.out.println(s);
            }
        }
    }
}