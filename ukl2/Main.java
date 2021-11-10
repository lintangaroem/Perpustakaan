/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Peminjaman peminjaman = new Peminjaman();
        Buku buku = new Buku();
        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        Laporan laporan = new Laporan();
        
        laporan.laporan(buku);
        laporan.laporan(siswa);
        peminjaman.Peminjaman(siswa, petugas, buku, laporan, peminjaman);
        
        laporan.laporan(peminjaman, buku);
        laporan.laporan(buku);
        laporan.laporan(siswa);
    }
}
