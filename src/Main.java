import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Nập số pt và khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các phần tu mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] mang = new int[n];
        int max = 0;
        int min = 0;
        System.out.println("Nhập giá tr cac phan tu cua mang: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("old[%d]=",i);
            mang[i] = Integer.parseInt(sc.nextLine());
        }
        //in ra phần tử trong maảng
        System.out.printf("In ra các phần ử trong mảng: ");
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("%d\t",mang[i]);
        }
        System.out.printf("\n");
        //Tìm giá tr lon nhat
        System.out.println("Tìm giá trị lớn nhất, nhỏ nhất: ");
        for (int i = 0; i < n; i++) {
             if (i==0)
                 max = mang[i];
             else if(mang[i]>max)
                 max = mang[i];
        }
        for (int i = 0; i < n ; i++) {
            if (i==0)
                min = mang[i];
            else if (mang[i]<min)
                min = mang[i];
        }
        System.out.println("Giá trị lớn nất trongm mang: "+max);
        System.out.println("Giá trị nhỏ nhát trong mang: "+min);
        //Sắp xếp từ to đến bé
        System.out.printf("Từ to đến bé:");
        for (int i = 0; i < mang.length-1; i++) {
            for (int j = i+1; j < mang.length; j++) {
                if (mang[i]<mang[j]){
                    int x = mang[i];
                    mang[i]=mang[j];
                    mang[j]=x;
                }
            }
        }
        for (int i = 0; i < mang.length; i++) {
            System.out.printf("%d\t",mang[i]);
        }
        //Thoát ctr
        System.exit(0);
        System.out.println("Mời nhập lại mảng: ");
        System.out.println("");


    }
}