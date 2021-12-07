/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Menu {
    public void showMenu(){
        System.out.println("==============================");
        System.out.println("1. pengelolaan buku");
        System.out.println("2. pengelolaan anggota");
        System.out.println("3. laporan pendapatan");
        System.out.println("12. keluar");
        System.out.println("==============================");
    }
    
    public void showMenuBuku(){
        System.out.println("1. menambahkan buku");
        System.out.println("2. mengurangi buku");
        System.out.println("3. melihat info buku");
        System.out.println("4. melihat semua judul buku");
        System.out.println("5. melihat stok buku");
        System.out.println("6. melihat semua data buku");
        System.out.println("7. kembali ke menu awal");
        System.out.println("==============================");
    }
    
    public void showMenuAnggota(){
        System.out.println("1. menambah anggota");
        System.out.println("2. anggota meminjam buku");
        System.out.println("3. anggota isi saldo");
        System.out.println("4. tampilkan data anggota");
        System.out.println("5. kembali ke menu awal");
        System.out.println("==============================");
    }
    
    public void showMenuPendapatan(){
        System.out.println("1. laporan peminjaman");
        System.out.println("2. laporan pendapatan");
        System.out.println("3. kembali ke menu awal");
        System.out.println("==============================");
    }
    
    
}
