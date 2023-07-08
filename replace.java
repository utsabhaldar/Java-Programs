public class replace {
    public static void main(String[] args){
        String name = "Utsab Haldar";

        String name2 = name.replace('U', 'a');
        String name3 = name2.replace('t','b');
        String name4 = name3.replace('s', 'c');
        String name5 = name4.replace('a','d');
        String name6 = name5.replace('b', 'e');

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);
        
        
    }
}
