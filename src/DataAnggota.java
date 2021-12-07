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
public class DataAnggota {
    protected ArrayList<Anggota> ang = new ArrayList<Anggota>();
    protected int jumlahAnggota;
    protected Anggota anggotaAktif;
    
    Scanner sc = new Scanner(System.in);
    
    public ArrayList<Anggota> getAng() {
        return ang;
    }
    
    
    public void addAnggota(Anggota a){
        ang.add(a);
    }
    
    public void infoAnggota(){
        jumlahAnggota = ang.size();

        //jika sudah terdapat buku
        if(jumlahAnggota > 0){
            //list barang yang akan ditampilkan
            for(int i = 0; i < jumlahAnggota; i++ ){
                System.out.println(i+ ". "+ ang.get(i).getNama());
            }
            System.out.println("total anggota perpustakaan = " + jumlahAnggota);
        }
        else{
            System.out.println("Saat masih belum ada anggota");
        }
    }
    public void pilihAnggota(){
        infoAnggota();
        System.out.print("pilih anggota = " );
        int no = sc.nextInt();
        anggotaAktif = ang.get(no);
    }
}
