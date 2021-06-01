import java.util.*;

class Java_String_Tokens {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            str = str.trim();
            // System.out.println(str);
            if (str.equals("") || str.equals(null)) {
                System.out.println(0);
                return;
            }
            String delimiter = "[!,?._'@\\s]+";

            String[] sArray = str.trim().split(delimiter);
            System.out.println(sArray.length);

            for (String item : sArray) {
                if (!(item.equals("")))
                    System.out.println(item);

            }
        } catch (Exception e) {
            System.out.println(0);
        }

    }
}