import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = 1;
        while(in.hasNext()){
            String h = in.nextLine();
            System.out.println(c + " " + h);
            c++;
        }
        in.close();
    }
}
