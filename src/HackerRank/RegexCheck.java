package HackerRank;
import java.util.*;
import java.util.regex.*;

public class RegexCheck {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for(int counter = 0; counter< testCases; counter++){

            String pattern = "";
            if (!in.hasNext(pattern)) pattern = in.nextLine();

            try{
                Pattern complied = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e){
                System.out.println("Invalid");

            }

        }
        in.close();

    }
}

