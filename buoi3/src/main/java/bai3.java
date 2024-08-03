import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int a,b,c,d;
        d=(int)(Math.random()*2);
        if(d == 1) {

                a = (int) (Math.random() * 11);
                b = (int) (Math.random() * 11);
                c = a + b;
        }
        else{
            do {
                a = (int) (Math.random() * 11);
                b = (int) (Math.random() * 11);
                c = (int) (Math.random() * 21);
            }while( a + b == c);
        }
        System.out.print( a + " + " + b + " = " + c);
        System.out.println(" phép tính đ/s: ");
        String str=n.nextLine();
        if(str.equals("Y") && a + b == c || str.equals("N")&& a + b != c){
            System.out.print("true");

        }else{
            System.out.println("Fasle");
        }


    }
}
