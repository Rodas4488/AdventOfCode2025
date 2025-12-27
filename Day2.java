import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result = 0;
        String[] inputString = sc.nextLine().trim().split(",");
        for (String range : inputString) {
            String[] bounds = range.trim().split("-");
            long lower = Long.parseLong(bounds[0]);
            long upper = Long.parseLong(bounds[1]);
            for (long i = lower; i <= upper; i++) {
                String iStr = Long.toString(i);
                if (iStr.substring(0, iStr.length()/2).equals(iStr.substring(iStr.length()/2, iStr.length()))) {
                    result += i;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }   
}
