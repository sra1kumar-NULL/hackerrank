import java.util.*;
import java.util.regex.*;

class Java_Regex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String IP = sc.nextLine();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}

class MyRegex {
    public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))\\b";
}
