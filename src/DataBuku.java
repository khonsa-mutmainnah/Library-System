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
import java.util.ArrayList;
public class DataBuku {
    protected ArrayList<String> judulBuku = new ArrayList<>();
    protected ArrayList<String> genreBuku = new ArrayList<>();
    protected ArrayList<Integer> halaman = new ArrayList<>();
    protected ArrayList<Double> hargaBuku = new ArrayList<>();
    protected ArrayList<Integer> stok = new ArrayList<>();
    protected String [] genre = new String [4];
    private int jumlahBuku = judulBuku.size();
    private int totalBuku;
    private double hargaPinjam;
    
    Scanner sc = new Scanner(System.in);

    public DataBuku(){
        genre [0] = new String("buku anak");
        genre [1] = new String("buku pengetahuan");
        genre [2] = new String("buku fiksi");
        genre [3] = new String("buku agama");
    }
    

    public ArrayList<String> getJudulBuku() {
        return judulBuku;
    }

    public ArrayList<Integer> getStok() {
        return stok;
    }

    

    public ArrayList<String> getGenreBuku() {
        return genreBuku;
    }

    public ArrayList<Integer> getHalaman() {
        return halaman;
    }

    public ArrayList<Double> getHargaBuku() {
        return hargaBuku;
    }
    
    public double setHargaPinjam(double a){
        return hargaPinjam;
    }
    //lihat buku yang ada di perpustakaan
    public void dataBuku(){
        //banyak buku
        jumlahBuku = judulBuku.size();

        //jika sudah terdapat buku
        if(jumlahBuku > 0){
            //list barang yang akan ditampilkan
            for(int i = 0; i < jumlahBuku; i++ ){
                System.out.println("kode buku   = " + i);
                System.out.println("judul buku  = " + judulBuku.get(i));
                System.out.println("genre buku  = " + genreBuku.get(i));
                System.out.println("halaman     = " + halaman.get(i));
                System.out.println("harga buku  = " + hargaBuku.get(i));
                System.out.println("stok        = " + stok.get(i));
                
                totalBuku += stok.get(i);
            }
            System.out.println("total semua buku = " + totalBuku);
        }
        else{
            System.out.println("Saat ini stok masih kosong");
        }
        
    }

    public void addBuku(){
        //masuk genre buku
        System.out.print("pilih genre (0. anak; 1. pengetahuan; 2. fiksi; 3. agama) = ");
        int no =sc.nextInt();
        this.genreBuku.add(genre[no]);
        
        //masuk judul buku
        System.out.print("masukkan judul buku = ");
        String judul = sc.next();
        this.judulBuku.add(judul);
        
        // masuk halaman buku
        System.out.print("masukkan halaman buku = ");
        int hal = sc.nextInt();
        this.halaman.add(hal);
        
        //masuk harga buku
        System.out.print("masukkan harga = " );
        double harga = sc.nextDouble();
        this.hargaBuku.add(harga);
        
        //masuk stok
        System.out.print("masukkan stok = ");
        int stok = sc.nextInt();
        this.stok.add(stok);
        
        //pemberitahuan
        System.out.println("buku " + judulBuku + " Berhasil ditambah ke Stock ");
    }

    public void removeBuku(){
        //menghapus buku dari perpus
        showJudulBuku();
        System.out.print("masukkan kode buku = ");
        int kode = sc.nextInt();
        String judulBuku = this.judulBuku.get(kode);

        this.judulBuku.remove(kode);
        this.genreBuku.remove(kode);
        this.halaman.remove(kode);
        this.hargaBuku.remove(kode);
        this.stok.remove(kode);

        System.out.println(judulBuku + " berhasil di remove dari stock");
    }

    public void infoSatuBuku(){
        //info satu buku yang mau dilihat
        showJudulBuku();
        System.out.print("masukkan kode buku yang mau dilihat = ");
        int kode = sc.nextInt();
        System.out.println("judul buku  = " + judulBuku.get(kode));
        System.out.println("genre buku  = " + genreBuku.get(kode));
        System.out.println("halaman     = " + halaman.get(kode));
        System.out.println("harga buku  = " + hargaBuku.get(kode));
        System.out.println("stok        = " + stok.get(kode));
    }
    
    public void showJudulBuku(){
        jumlahBuku = judulBuku.size();
        if(jumlahBuku > 0){
            //list buku yang akan ditampilkan
            for(int i = 0; i < jumlahBuku; i++ ){
                System.out.print(i + ". "+ judulBuku.get(i));
                System.out.println("");
            }
        }
    }
    
    public void showStokBuku(){
        jumlahBuku = judulBuku.size();
        if(jumlahBuku > 0){
            //list buku yang akan ditampilkan
            for(int i = 0; i < jumlahBuku; i++ ){
                System.out.print(i + ". "+ judulBuku.get(i) + " = " + stok.get(i));
                System.out.println("");
            }
        }
    }
    
    public void hitungHargaPinjam(){
        System.out.print("masukkan nomor buku yang mau dipinjam = ");
        int no = sc.nextInt();
        if(genreBuku.get(no).contentEquals(genre[0])){
            hargaPinjam = hargaBuku.get(no)*0.02;
        }
        else if(genreBuku.get(no).contentEquals(genre[1])){
            hargaPinjam = hargaBuku.get(no)*0.01;
        }
        else if(genreBuku.get(no).contentEquals(genre[2])){
            hargaPinjam = hargaBuku.get(no)*0.03;
        }
        else if(genreBuku.get(no).contentEquals(genre[3])){
            hargaPinjam = hargaBuku.get(no)*0.02;
        }
        else{
            System.out.println("anda memasukan angka yang salah ");
        }
    }

    public double getHargaPinjam() {
        return hargaPinjam;
    }

}