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
public abstract class Anggota {
    Scanner input = new Scanner(System.in);
    protected String nama;
    protected double saldo;
    protected int umur;
    protected CartPeminjaman cpin = new CartPeminjaman();
    protected DataAnggota dat;
    protected Anggota anggotaAktif;
    protected DataBuku db = new DataBuku();
    private int no;
    
    Scanner sc = new Scanner (System.in);

    public Anggota(){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(){
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void meminjam(){
        //untuk kondisi
        int i = 1;
        while(i==1){
            //menampilkan buku yang ada di perpus
            db.showJudulBuku();
            System.out.print("masukkan nomor buku yang mau dipinjam = ");
            this.no = sc.nextInt();// pilih buku
            //pemilihan untuk melakukan peminjaman
            cpin.getCp().add(db.judulBuku.get(i));
            System.out.println("pinjam lagi? (1. ya ; 2. tidak)");
            int no = sc.nextInt();
            if(no==1){
                i=1;
            }
            else if(no==2){
                System.out.println("maaf, tidak bisa hanya meminjam satu buku");
                i=1;
            }
            else{
                i=0;
            }
            double a = cpin.getTotalHarga()+db.getHargaPinjam(); // buat total harga pinjam
            cpin.setTotalHarga(a);
            Peminjaman pj = new Peminjaman();
            pj.catatPeminjaman(a);
        }
            saldo -= cpin.getTotalHarga();
            //Peminjaman pj = new Peminjaman();
            //pj.catatPeminjaman(a);
            i++;
    }

    public void isiSaldo(){
        System.out.print("berapa saldo yang akan anda masukkan? = ");
        int a = sc.nextInt();
        System.out.println("saldo berhasil dimasukkan");
        saldo += a;
    }
    
    public void checkOut(Peminjaman pjm){
        cpin.bayar(pjm);
    }
    public abstract void daftar();
}
