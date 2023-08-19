import java.util.Scanner;

public class J01006_TinhSoFibonacci {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        long a[] = new long[93];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i <= 92; i++){
            a[i] = a[i-1] + a[i-2];
        }
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();
            System.out.println(a[n-1]);
        }
    }
}
