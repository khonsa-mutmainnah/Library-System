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
public class CartPeminjaman {
    Scanner input = new Scanner(System.in);
    
    private ArrayList <String> cp = new ArrayList <String>();
    private ArrayList <Double> cpHarga = new ArrayList <Double>();
    private DataBuku db = new DataBuku();
    private double totalHarga;
    private int jumlahBuku;
    private Anggota an;
    
    Scanner sc = new Scanner (System.in);

    public ArrayList<Double> getCpHarga() {
        return cpHarga;
    }
    
    public CartPeminjaman() {
    }

    public ArrayList<String> getCp() {
        return cp;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    
    public double getTotalHarga() {
        return totalHarga;
    }
    
    public void Cart(String buku, double tot){
        cp.add(buku);
        cpHarga.add(totalHarga);
    }
    
    public void bayar (Peminjaman pjm){
        jumlahBuku = cp.size();
        int jumlahHarga = 0;
                
        System.out.println("jumlah buku yang dipinjam = " + jumlahBuku);
        System.out.println("total harga buku = " + totalHarga);

        pjm.catatPeminjaman(totalHarga);
    }
}
