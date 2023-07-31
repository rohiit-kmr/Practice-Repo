import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        System.out.print("Enter the no you want to check :- ");
        Scanner val = new Scanner(System.in);
        int num=val.nextInt();
        int rem=0;
        int rev=0;
        int check=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(check==rev){
            System.out.println("It is palindrome");
        }else{
        System.out.println("It is not palindrome");
    }
}
}
