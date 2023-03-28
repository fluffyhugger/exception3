package exception3;

import java.util.Scanner;
public class LAB5 {
    public static void main(String[] args) {
        System.out.println("Main Method call method");
        try{
            doThis();
        }catch (Exception e){
            System.out.println("Main method receive exception" + e.getMessage());
        }
    }
    public static void doThis() throws Exception{
        System.out.println("Method doThis() Call ");
        doThat();
    }
    public static void doThat() throws Exception{
        System.out.println(1/0);
    }
}
