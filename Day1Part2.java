import java.util.Scanner;
public class Day1Part2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int disck = 50;

        while(sc.hasNextLine()){
            String command = sc.nextLine().trim();

            if(command.isEmpty()) break;

            char direction = command.charAt(0);
            int number = Integer.parseInt(command.substring(1));
            int initialDisck = disck;

            result += number / 100;   
            int remaining = number % 100;

            switch(direction){
                case 'L':
                    if(remaining > disck && disck > 0) {
                        result++;
                    }
                    
                    disck = ((disck - number) % 100 + 100) % 100;
                    break;
                    
                case 'R':
                    if(disck + remaining > 100) {
                        result++;
                    }
                    
                    disck = (disck + number) % 100;
                    break;
            }

            if(disck == 0 && initialDisck != 0) result++;
        }

        System.out.println(result);
    }
}