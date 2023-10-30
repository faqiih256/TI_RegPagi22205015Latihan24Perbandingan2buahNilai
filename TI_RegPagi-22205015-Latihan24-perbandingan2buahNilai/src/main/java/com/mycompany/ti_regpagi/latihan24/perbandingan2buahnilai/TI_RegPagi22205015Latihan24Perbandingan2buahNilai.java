/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ti_regpagi.latihan24.perbandingan2buahnilai;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang perbandingan 2 nilai
 * @author 62895
 */
public class TI_RegPagi22205015Latihan24Perbandingan2buahNilai {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 24===");
        boolean nilai = true;
        while (nilai) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukan nilai pertama: ");
            int nilai1 = scanner.nextInt();
            System.out.print("Masukan nilai kedua: ");
            int nilai2 = scanner.nextInt();
            if (nilai1 > nilai2) {
                System.out.println(nilai1 + " lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println(nilai1 + " Lebih kecil dari " + nilai2);
            } else if (nilai1 == nilai2) {
                System.out.println(nilai1 + " Sama dengan " + nilai2);
            }

            System.out.println("Ulangi Aktifitas? (Ya/tidak)");
            String aktifitas = scanner.next();
            if (aktifitas.equals("ya")) {
                System.out.println("program akan di ulangi");
            } else if (aktifitas.equals("tidak")) {
                System.out.println("Program telah selesai");
                nilai = false;
            }
        }
    }
}
