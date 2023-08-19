import java.util.Scanner;

public class J01004_SoNguyenTo {
    public static int SNT(int n){
        if(n < 2)
            return 0;
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return 0;
        }
        return 1;
    }
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- >0){
            int n = scanner.nextInt();
            if(SNT(n) == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
