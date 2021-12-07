/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class AnggotaAnak extends Anggota implements HitungHarga{
    private DataBuku db;
    private CartPeminjaman cp;
    private DataAnggota dat;
    
    Scanner sc = new Scanner (System.in);
    
    public AnggotaAnak(){
        CartPeminjaman cp = new CartPeminjaman();
        DataAnggota dat = new DataAnggota();
        this.cp=cp;
        this.dat=dat;
    }

    @Override
    public void daftar() {
        System.out.print("nama    = ");
        super.nama = sc.nextLine();
        System.out.print("umur    = " );
        super.umur = sc.nextInt();
        if(umur>17){
            System.out.println("maaf, anggota ini tidak termasuk kategori anak");
        }
        else{
            System.out.print("masukkan saldo awal = ");
            super.saldo = sc.nextDouble();
            System.out.println(super.nama + " sudah masuk ke dalam anggota perpustakaan");
        }
        
    }

    @Override
    public void totalHarga() {
        double diskon = 0.03;
        cp.setTotalHarga(cp.getTotalHarga()*diskon);
    }
    
}
