import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int n=m.nextInt();
        int a[]=new int[n];
        for(int i=0 ; i < n;i++){
            System.out.printf("a[%d] = ", i);
            a[i] =m.nextInt();

        }
        for(int i=0;i<n ;i++){
            if(i % 2 == 1){
                if(i== n-1){
                    a[i] += a[i-1];
                }else{
                    a[i]=Math.abs(a[i-1]-a[i+1]) +a[i];
                }
            }
        }
        for(int i=0 ; i < n ;i++){
            System.out.print(a[i] + " ");
        }
    }
}
