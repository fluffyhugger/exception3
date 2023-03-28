package exception3;

public class LAB6 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try {
            System.out.println("List[10] is " + list[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            StackTraceElement[] s = e.getStackTrace();

            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i].getClassName());
                System.out.println(s[i].getMethodName());
                System.out.println(s[i].getFileName());
                System.out.println(s[i].getLineNumber());
            }
        }
    }
}
