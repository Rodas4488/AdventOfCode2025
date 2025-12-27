import java.util.Scanner;

public class Day2Part2 {
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
                if (isInvalidID(iStr)) {
                    result += i;
                }
            }
        }
        System.out.println(result);
        sc.close();
    }

    private static boolean isInvalidID(String str) {
        String repeString = str.substring(0,1);
        int max = 1;
        int count = 0;
        while (count < str.length()) {
            if (max > str.length()/2) {
                break;
            }
            
            if(str.length()% max == 0 && repeString.equals(str.substring(count, count + max))) {
                count += max;
                continue;
            } 
            max ++;
            repeString = str.substring(0, max);
            count = 0;
        }
        return max <= str.length()/2;
    }
}
