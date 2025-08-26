package dsa.recursion.theory;

public class _01_Message {
    public static void main(String[] args) {
        //write a function that print 'hello world' five times
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");
        message5();
    }
    static void message5(){
        System.out.println("Hello world");
    }
}
