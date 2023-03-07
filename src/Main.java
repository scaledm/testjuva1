import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] a ={"one","two","three"};
        System.out.println(""+a[2]);
        int n=10,m=5,i,j;
        Random rd = new Random();
int A[][];
A= new int [n][m];

for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                A[i][j]= -50+(int) (Math.random()*100);
                System.out.print(" "+A[i][j]);
            }
                System.out.println(" ");

        }

    }
}