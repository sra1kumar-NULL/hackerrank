import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class Pattern_Syntax_Checker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t;
        t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String regex = sc.nextLine();
            try {
                Pattern.compile(regex);
                // System.out.println(p);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            t--;
        }

    }

};