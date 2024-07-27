import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner b1 = new Scanner(System.in);
        double r;
        do{
             r = b1.nextDouble();

        }while( r <= 0|| r >= 1000);


            double chuvi=r * 3.14 *2;
            double dientich = r * r * 3.14;

            System.out.printf("%.3f",chuvi);
            System.out.print(" ");
            System.out.printf("%.3f",dientich);
        }

}
