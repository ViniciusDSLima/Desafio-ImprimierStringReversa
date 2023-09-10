import java.util.Scanner;

public class Main {
    public static String FirstReverse(String str) {
        StringBuilder builder = new StringBuilder();

        for(int i = str.length() -1; i >= 0; i--){
            builder.append(str.charAt(i));
        }

        return builder.toString();

//        poderia ser tambem:
//        StringBuilder builder = new StringBuilder(str);
//        return builder.reverse().toString();

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(FirstReverse(s.nextLine()));

    }
}