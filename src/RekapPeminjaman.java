/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;
public class RekapPeminjaman {
    private ArrayList <Peminjaman> cartPinjam = new ArrayList <Peminjaman>();
    private int jumlahPeminjaman;
    private Peminjaman jp;
    private CartPeminjaman cp;
    private AnggotaDewasa ang = new AnggotaDewasa();
    private double jumlahPendapatan;
    
    public RekapPeminjaman(){
    }

    public ArrayList<Peminjaman> getCartPinjam() {
        return cartPinjam;
    }

    public int getJumlahPeminjaman() {
        return jumlahPeminjaman;
    }

    public void setJumlahPeminjaman() {
        this.jumlahPeminjaman = cartPinjam.size();
    }

    public double getJumlahPendapatan() {
        return jumlahPendapatan;
    }

    public void setJumlahPendapatan(double jumlahPendapatan) {
        this.jumlahPendapatan += jumlahPendapatan;
    }
    
    
    public void tampilkanData(){
        jumlahPeminjaman = cartPinjam.size();
        
        for(int i=0; i<jumlahPeminjaman; i++){
            int totalPeminjaman = cp.getCp().size();
            jumlahPendapatan = jumlahPendapatan + totalPeminjaman;
            System.out.println("total pendapatan = " + totalPeminjaman);
        }
    }
    
    public void tambahPeminjaman(Peminjaman p){
        p = new Peminjaman();
        cartPinjam.add(p);
    }
    
}
