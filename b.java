import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        try{
            Scanner n = new Scanner(System.in);
            int input = n.nextInt();
            String m = String.valueOf(input);

            if(input == Integer.parseInt(m)){
                System.out.println("correct");
            }
        }catch(Exception e){
            System.out.println("type");
        }
    }
}
