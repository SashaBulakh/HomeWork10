import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class CountRepeatWords {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream fis = new FileInputStream("words.txt");
        Scanner scanner = new Scanner(fis);
        Map<String, Integer> result = new HashMap<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] array = s.split(" ");
            for (String item : array) {
                if (result.containsKey(item)) {
                    result.put(item, result.get(item) + 1);
                } else {
                    result.put(item, 1);
                }
            }
        }
        System.out.println(result);
    }
}