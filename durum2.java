package projeGrubu.programlama2.exp1;

import java.util.Scanner;

public class durum2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("satır sayısını giriniz: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir tam sayı girin.");
            return;
        }

        for (int i = n; i >= 1; i--) {
            // bu baştaki Boşlukları yazdırır
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();  //baya kolaymış aslında
        }

    }
}
