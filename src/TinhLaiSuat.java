
import java.util.Scanner;
public class TinhLaiSuat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien gui: ");
        int tien = input.nextInt();
        System.out.println("nhap so thang muon gui: ");
        int thang = input.nextInt();
        System.out.println("nhap lai suat (%): ");
        double lai = input.nextDouble();
        double tienLai = 0;
        for (int i = 0; i<thang; i++){
            tienLai += tien*(lai/100);
        }
        System.out.println("tong tien lai sau "+thang+ " la: "+tienLai);
    }
}
