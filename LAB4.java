package exception3;

public class LAB4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
        }
        catch(ArithmeticException e){
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("ArrayIndexOutOfBounds");
            throw new RuntimeException();
        }
        finally{
            System.out.println("statement 4 ");
        }
        System.out.println("Statement 5 ");
    }
}
