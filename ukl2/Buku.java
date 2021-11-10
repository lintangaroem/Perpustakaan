/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl2;

import java.util.ArrayList;

public class Buku {
    private ArrayList<String> namaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Buku(){
        this.namaBuku.add("Buku Fiksi");
        this.stok.add(15);
        this.harga.add(25000);
        
        this.namaBuku.add("Buku Non Fiksi");
        this.stok.add(15);
        this.harga.add(40000);
        
        this.namaBuku.add("Buku Ilmiah");
        this.stok.add(5);
        this.harga.add(100000);
    }
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
    
    public void setNamaBuku(String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    
    public String getNamaBuku(int idBuku){
        return this.namaBuku.get(idBuku);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public int getStok(int idBuku){
        return this.stok.get(idBuku);
    }
    
    public void editStok(int idBuku, int stok){
        this.stok.set(idBuku, stok);;
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idBuku){
        return this.harga.get(idBuku);
    }
}
