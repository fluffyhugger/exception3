package exception3;

public class LAB2 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("Index 10 is " + list[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This is out of bound");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("I cant find");
        }
    }

}