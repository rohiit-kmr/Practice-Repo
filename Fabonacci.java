import java.util.Scanner;

class Fabonacci{
    public static void main(String args[]){
        System.out.print("Enter the no you want to print fabonacci series :- ");
        Scanner fab =new Scanner(System.in);
        int val=fab.nextInt();
        int temp=0;
        int add=1;

        if(val==2){
            System.out.println(temp +" "+add);
        }else{  
            for(int i=3;i<=val;i++){
            
            int check=add+temp;  
            temp=add;
            add=check;         
            System.out.print(check+" ");
        }
    }
        
    }
}