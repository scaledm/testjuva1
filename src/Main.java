import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int a,i=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("write 1 if you want to enter numbers of masiv by yoursalfe and 2 - random");
        int ch= sc.nextInt(), n=5;
       int A[];
       A= new int [n];
       while (ch==1){
A[i]= sc.nextInt();
i++;
    if(i==n){break;}
       }

        while (ch==2){
            A[i]= rd.nextInt()*100;
            i++;
            if(i==n){break;}
        }
        for(i=0;i<n;i++)
        {
            System.out.print(" |"+A[i]);
        }
    }
}