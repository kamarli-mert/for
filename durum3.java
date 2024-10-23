package projeGrubu.programlama2.exp1;

import java.util.Scanner;

public class durum3 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("satır sayısını giriniz: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir tam sayı girin.");
            return;
        }

        for (int i= 1; Math.abs(n-i)<n; i++) {   //burası tamam
            for (int j = 0; j < Math.abs(n-i); j++) { // bu baştaki Boşlukları yazdırır
                System.out.print(" ");
            }
            for (int k = 1; k <= Math.abs(i); k++) { // Yıldızları yazdır ?????????????????????
                System.out.print("* ");
            }
            System.out.println();  //baya kolaymış aslında
            }
    }
}  //mutlak değer
