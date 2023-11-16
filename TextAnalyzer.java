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

public class TextAnalyzer {
    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int pilih = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilih) {
                case 1:
                    MasukkanTeks(scanner);
                    break;
                case 2:
                    JumlahKarakter();
                    break;
                case 3:
                    JumlahKata();
                    break;
                case 4:
                    CariKata(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
    }

    private static void MasukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        String inputText = scanner.nextLine();
        
        if (!inputText.isEmpty()) {
            text = inputText;
            System.out.println("Teks telah dimasukkan!\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks yang valid.\n");
        }
    }

    private static void JumlahKarakter() {
        if (!text.isEmpty()) {
            int JumlahHuruf = text.length();
            System.out.println("Jumlah karakter dalam teks: " + JumlahHuruf + "\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
        }
    }

    private static void JumlahKata() {
        if (!text.isEmpty()) {
            String[] kata = text.split("\\s+");
            int JumlahKata = kata.length;
            System.out.println("Jumlah kata dalam teks: " + JumlahKata + "\n");
        } else {
            System.out.println("Teks kosong, masukkan teks terlebih dahulu.\n");
        }
    }

    private static void CariKata(Scanner scanner) {
        if (!text.isEmpty()) {
            System.out.print("Masukkan kata yang ingin dicari: ");
            String CariKata = scanner.nextLine();

            String[] kata = text.split("\\s+");
            int wordFrequency = 0;

            for (String word : kata) {
                if (word.equalsIgnoreCase(CariKata)) {
                    wordFrequency++;
                }
            }

            System.out.println("Kata '" + CariKata + "' ditemukan sebanyak " + wordFrequency + " kali dalam teks.\n");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
        }
    }
}