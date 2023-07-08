import java.util.Scanner;

public class num_finder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int userNum = 0;

        do{
            System.out.println("Guess my number:");
            userNum = sc.nextInt();

            if(userNum == myNum){
                System.out.println("Yes, you are correct.");
                break;
            }
            
            else if(userNum > myNum){
                System.out.println("Your number is larger");
            }    
            else{
                System.out.println("Your number is smaller");
            }

        }while(userNum >= 0);

        System.out.println("My number was:");
        System.out.println(myNum);
    }
}
