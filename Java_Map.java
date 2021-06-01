import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
import java.lang.*;

class Java_Map {
    public static void main(String[] args) {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        try {
            Map<String, Integer> map = new HashMap<>();
            int t = Integer.valueOf(sc.readLine());
            while (t > 0) {

                String key = sc.readLine();
                Integer value;
                try {
                    value = Integer.valueOf(sc.readLine());
                    map.put(key, value);
                } catch (NumberFormatException x) {
                    System.out.println("Not found");

                }

                t--;

            }
            String s;
            while ((s = sc.readLine()) != null) {
                if (map.containsKey(s)) {
                    System.out.println(s + "=" + map.get(s));
                } else {
                    System.out.println("Not found");
                }
            }
        } catch (IOException e) {
            System.out.println("Not found");
        }

    }
}