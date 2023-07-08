import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){

        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age);

        if(age>=18)
        System.out.println("You can vote");
        else
        System.out.println("You should be at least 18 to vote");
    
    }
}
