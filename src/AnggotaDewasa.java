/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AnggotaDewasa extends Anggota implements HitungHarga{
    private double iuranTahunan = 10000;
    private DataAnggota dat;
    private CartPeminjaman cp;
    private RekapPeminjaman rpjm;
    
    public AnggotaDewasa(){
        CartPeminjaman cp = new CartPeminjaman();
        DataAnggota dat = new DataAnggota();
        this.cp=cp;
        this.dat=dat;
    }
    
    public void bayarIuran(){
        saldo-=iuranTahunan;
        double a = rpjm.getJumlahPendapatan()+iuranTahunan;
        rpjm.setJumlahPendapatan(a);
        System.out.println("pembayaran iuran berhasil");
        
    }

    @Override
    public void daftar() {
        System.out.print("nama    = ");
        super.nama = sc.nextLine();
        System.out.print("umur    = " );
        super.umur = sc.nextInt();
        if(umur<17){
            System.out.println("maaf, anggota ini tidak termasuk kategori dewasa");
        }
        else{
            System.out.print("masukkan saldo awal = ");
            super.saldo = sc.nextDouble();
            saldo -= iuranTahunan;
            System.out.println(super.nama + " sudah masuk ke dalam anggota perpustakaan");
            System.out.println("pembayaran iuran tahunan berhasil");
        }
    }

    @Override
    public void totalHarga() {
        double diskon = 0.05;
        cp.setTotalHarga(cp.getTotalHarga()*diskon);
    }
}