import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua ma tran: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so cot cua ma tran: ");
        int m = Integer.parseInt(sc.nextLine());
        float[][] matran = new float[n][m];
        System.out.println("NHAP GIA TRI CAC PHAN TU CUA MA TRAN");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                matran[i][j] = Float.parseFloat(sc.nextLine());
            }
        }
    //in
        System.out.println("\nIn mảng theo ma trận là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d",matran[i][j]);
            }
            System.out.println("");
        }
        System.out.println("\n");

    }
}
