import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println(" nhap so dong  va cot  "); 
        int u;
        do{
           u=m.nextInt();
        }while( n > 7 || n < 0);

        int a[][]=new int[u][u];
        int c= u*u;
        int index=0;
        for(int i=1 ; i<=u;i++){
            ++index;
            a[1][i]= index;
        }
        for(int i = 2; i <= u; i++){
            ++index;
            a[i][u] = index;
        }for(int i = u-1; i >0; i--){
            ++index;
            a[u][i] = index;
        }
        for(int i=u-1;i > 1;i--){
            ++index;
            a[1][u] = index;
        }






    }
}
