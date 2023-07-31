import java.util.Scanner;

public class Pattern {
    public static void main(String args[]){
        System.out.print("Enter no upto which you want to print pattern :- ");
        Scanner num = new Scanner(System.in);
        int val=num.nextInt();
        for(int i=1;i<=val;i++){
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
