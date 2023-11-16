/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

/**
 *
 * @author xwely
 */
import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("Selamat datang di Kalkulator Java!");
        System.out.println("Pilih operasi yang ingin Anda lakukan:");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural");
        System.out.println("4. Factorial");
        System.out.println("5. Keluar");
        System.out.print("Pilihlah pilihan yang ada diatas:" );

        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan bilangan:");
                int bilangan = input.nextInt();
                double akar = Math.sqrt(bilangan);
                System.out.println("Akar kuadrat dari " + bilangan + " adalah " + akar);
                break;
            case 2:
                System.out.println("Masukkan bilangan:");
                int bilangan1 = input.nextInt();
                System.out.println("Masukkan pangkat:");
                int pangkat = input.nextInt();
                int hasil = (int) Math.pow(bilangan1, pangkat);
                System.out.println("Hasil dari " + bilangan1 + "^" + pangkat + " adalah " + hasil);
                break;
            case 3:
                System.out.println("Masukkan bilangan:");
                double bilangan2 = input.nextDouble();
                double hasil2 = Math.log(bilangan2);
                System.out.println("Logaritma natural dari " + bilangan2 + " adalah " + hasil2);
                break;
            case 4:
                System.out.println("Masukkan bilangan:");
                int bilangan3 = input.nextInt();
                int hasil3 = 1;
                for (int i = 1; i <= bilangan3; i++) {
                    hasil3 *= i;
                }
                System.out.println("Factorial dari " + bilangan3 + " adalah " + hasil3);
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan kalkulator ini");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}