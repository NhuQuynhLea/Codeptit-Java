import java.util.Scanner;

public class J0100_TinhTongNSoNguyenDuongDauTien {

    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0){
            long n = scanner.nextLong();
            System.out.println( n* (n+1)/2);
        }

    }
}
