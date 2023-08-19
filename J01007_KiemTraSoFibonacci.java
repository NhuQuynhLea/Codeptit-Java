import java.util.Scanner;

public class J01007_KiemTraSoFibonacci {
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
            long n = sc.nextLong();
            int flag = 0;
            for(int i = 0; i <= 92; i++){
                if(a[i] == n){
                    System.out.println("YES");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) System.out.println("NO");
        }
    }
}
