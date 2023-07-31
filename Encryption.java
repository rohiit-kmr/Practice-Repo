import java.util.Scanner;

public class Encryption {
    public static void main(String args[]){
        System.out.print("Enter name you want to convert :- ");
        Scanner name=new Scanner(System.in);
        String val=name.nextLine();
        String encryName="";
        for(int i=0;i<val.length();i++){
            char strToChr=val.charAt(i);
            int covNum=strToChr+5;
            char covChr=(char)covNum;
            System.out.print(covChr); 
        }
        System.out.println();

    }
}
