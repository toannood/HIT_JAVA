import java.util.Scanner;

public class bai1 {
    public static final String str1=  "Square";
    public static final String str2=  "Triangle";
    public static final String str3= "Circle";
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String a= n.nextLine();
        if(a.equals(str1)){
            int b= n.nextInt();
            System.out.println( " Math.pow(b,2)");
        } else if (a.equals(str2)) {
            
                int c = n.nextInt();
                int d= n.nextInt();
                int e= n.nextInt();
                if(c <=0|| d<=0||e<=0 || c+d <=e ||c +e <=d || e + d <=0) {
                    System.out.println("-1");
                }
                else{
                    double p=(c+d+e)/2;
                    System.out.printf(" %.2f", Math.sqrt(p* (p-c) * (p-d) * (p-e) ) ) ;
                }
        } else if (a.equals(str3)) {
            int r = n.nextInt();
            System.out.printf("%.2f",Math.pow(r,2)*Math.PI);

        }else{
            System.out.println(" Hình dạng không hợp lệ!");
        }

    }
}
