import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        
        try{
            String n = Integer.toString(a);
            System.out.println("true" + n);
        }
        catch(NumberFormatException e){
            System.out.println("false");
        }
        in.close();
    }
}
