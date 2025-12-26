import java.util.Scanner;
public class Day1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int disck = 50;

        while(sc.hasNextLine()){
            String command = sc.nextLine().trim();
            
            if(command.isEmpty()) break;

            char direction = command.charAt(0);
            int number = Integer.parseInt(command.substring(1));

            switch(direction){
                case 'L':
                    disck = ((disck - number) % 100 + 100) % 100;
                    break;
                case 'R':
                    disck = (disck + number) % 100;
                    break;
            }

            if(disck == 0) result++;
        }

        System.out.println(result);
    }
}