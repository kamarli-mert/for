package projeGrubu.programlama2.exp1;

import java.util.Scanner;

public class durum1 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.print("satır sayısını giriniz: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir tam sayı girin.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
