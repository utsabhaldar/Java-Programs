

public class try_catch {
    public static void main(String[] args){

        int[] Sub_marks = {91,92,93,94,95};

        try{
            System.out.println(Sub_marks[1]);
            System.out.println(Sub_marks[2]);
            System.out.println(Sub_marks[5]);
        }catch(Exception exception){
            System.out.println("SORRY!!! This is an exception.");
        }
        System.out.println("You are so good");
    }
}
