import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.*;

public class Json {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line;
        int num = 0;
        List<User> list = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            num++;
            if(num>1) {
                String[] array = line.split(" ");
                User user = new User();
                user.setName(array[0]);
                user.setAge(array[1]);
                list.add(user);
            }
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String g = gson.toJson(list);
        System.out.println(g);
        OutputStream fos  = new FileOutputStream("user.json");
        fos.write(g.getBytes());
    }
}


class User {
    private String name;
    private String age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}




