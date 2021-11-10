/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

import java.util.ArrayList;
import java.util.Scanner;
public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyakBuku = new ArrayList<Integer>();
    
    Scanner input = new Scanner(System.in);
    
    //method size
    public int getJmlPeminjaman(){
        return this.idSiswa.size();
    }
    
    public int getIdSiswa(int id){
        return this.idSiswa.get(id);
    }
    
    public int getIdBuku(int id){
        return this.idBuku.get(id);
    }
    
    public int getBanyakBuku(int id){
        return this.banyakBuku.get(id);
    }
    
    public void Peminjaman(Siswa siswa, Petugas petugas, Buku buku, Laporan laporan, Peminjaman tr){
        
        System.out.println("");
        System.out.print("Masukkan id siswa     : ");
        int idSiswa = input.nextInt();
        
        do{
            if (siswa.getStatus(idSiswa) == true) {
                System.out.println("Halo " + siswa.getNama(idSiswa) + " Silahkan meminjam buku");
                laporan.laporan(buku);

                System.out.print("Masukkan id buku pinjaman     : ");
                int idBuku = input.nextInt();

                System.out.print("Masukkan jumlah buku pinjaman : ");
                int banyakBuku = input.nextInt();

                updateDataPinjam(buku, idSiswa, idBuku, banyakBuku, siswa);
                
                System.out.println("Detail Peminjaman Buku");
                System.out.println("Siswa \tBuku \tJumlah \tPetugas \tStatus");
                
                int x = tr.getJmlPeminjaman();
                for(int i = 0; i < x; i++){
                    System.out.println(siswa.getNama(tr.getIdSiswa(i)) + "\t" 
                            + buku.getNamaBuku(tr.getIdBuku(i)) + "\t" + 
                            tr.getBanyakBuku(i) + "\t" + petugas.getNama(i) 
                            +"\t"+ siswa.getStatus(tr.getIdSiswa(i)));
                }
            } else {
                System.out.println("Halo " + siswa.getNama(idSiswa) + 
                        " Anda harus mengembalikan buku");
                laporan.laporan(buku);
                
                System.out.print("Masukkan id buku     : ");
                int idBukuKembali = input.nextInt();

                System.out.print("Masukkan jumlah buku : ");
                int banyakBukuKembali = input.nextInt();
                
                siswa.editStatus(idSiswa, true);
                buku.editStok(idBukuKembali, buku.getStok(idBukuKembali) + banyakBukuKembali);
            }
        } while(siswa.getStatus(idSiswa) == true);
        
    }
    
    public void updateDataPinjam(Buku buku, int idSiswa, int idBuku, int banyakBuku, Siswa siswa){
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyakBuku.add(banyakBuku);
    
        //edit stok buku
        buku.editStok(idBuku, buku.getStok(idBuku) - banyakBuku);
        //edit status siswa
        siswa.editStatus(idSiswa, false);
    }
    
    
}
