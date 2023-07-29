import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]){

        System.out.print("Enter firstVal= ");
        Scanner firstVal= new Scanner(System.in);
        int val=firstVal.nextInt();
        int blank=0;

        

        for(int i=1;i<=val;i++){

            if(val%i==0){
            blank+=1;
            }
    }

        if(blank==2){
            System.out.println(val+  " It is a prime No.");
        }else
            System.out.println(val+" It is not a prime.");

            System.out.println(val +" is divided by "+blank +" numbers.");



    }
}
