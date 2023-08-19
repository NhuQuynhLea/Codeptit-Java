import java.util.Scanner;

public class In_ma_tran {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [][]a = new int[n+1][n+1];
            for (int i = 1; i <= n; i++){
                for(int j = 1; j<= n; j++) a[i][j] = scanner.nextInt();
            }
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                }
                i++;
                if(i <= n){
                    for(int j = n; j > 0; j--){
                        System.out.print(a[i][j]);
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }

    }
}
