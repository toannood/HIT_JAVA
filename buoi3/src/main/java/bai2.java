import java.util.Locale;
import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int cnt = 0;
        String str=n.nextLine();
        int length=str.length();
        for(int i =0;i < length/2;i++){
            char str1, str2;
            str1 = str.charAt(i);
            str2 = str.charAt(length-1);
            if(str1 == str2){
                cnt++;
            }
            else {
                cnt = 0;
                System.out.print(str.toLowerCase());
                break;
            }
            length--;
        }
        if(cnt != 0){
            System.out.println(str.toUpperCase(Locale.ROOT));
        }

    }
}
