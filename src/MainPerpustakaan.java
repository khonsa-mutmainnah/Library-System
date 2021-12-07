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
public class MainPerpustakaan {
    public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    DataBuku dat = new DataBuku();
    DataAnggota daong = new DataAnggota();
    RekapPeminjaman pjm = new RekapPeminjaman();
    CartPeminjaman cp = new CartPeminjaman();
    Menu menu = new Menu();
    //Anggota p;
    
    System.out.println("selamat datang di perpustakaan bahagia :D");
    System.out.print("apakah anda petugas perpustakaan? (1. ya; 2. tidak) = ");
    int no = sc.nextInt();
    if(no==1){
        int a = 0;
        while (a==0){
            menu.showMenu();
            System.out.print("apa yang akan anda lakukan? = ");
            no = sc.nextInt();
            System.out.println("==============================");
            if(no==1){
                menu.showMenuBuku();
                System.out.print("pilih = ");
                no = sc.nextInt();
                if (no == 1){
                    dat.addBuku();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no == 2){
                    dat.removeBuku();
                    System.out.println("");
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no == 3){
                    dat.infoSatuBuku();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no==4){
                    dat.showJudulBuku();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no==5){
                    dat.showStokBuku();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no==6){
                    dat.dataBuku();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no==7){
                    a=0;
                }
                else{
                    System.out.println("maaf nomor yang anda masukkan salah");
                    a=0;
                }
            }
            else if(no==2){
                menu.showMenuAnggota();
                System.out.print("pilih = ");
                no = sc.nextInt();
                if (no == 1){
                    System.out.print("apakah anggota berumur lebih dari 17 tahun? (1. ya; 2. tidak ) = ");
                    no = sc.nextInt();
                    if(no==1){
                        AnggotaDewasa dew = new AnggotaDewasa();
                        dew.daftar();
                        daong.addAnggota(dew);
                    }
                    else if(no==2){
                        AnggotaAnak anak= new AnggotaAnak();
                        anak.daftar();
                        daong.addAnggota(anak);
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah!");
                        a=0;
                    }
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no == 2){
                    cp = new CartPeminjaman();
                    System.out.print("(1. anggota baru; 2. anggota lama) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.print("apakah anggota berumur lebih dari 17 tahun? (1. ya; 2. tidak ) = ");
                        no = sc.nextInt();
                        if(no==1){
                            AnggotaDewasa dew = new AnggotaDewasa();
                            Peminjaman pj = new Peminjaman();
                            dew.daftar();
                            daong.addAnggota(dew);
                            dat.showJudulBuku();
                            dew.meminjam();
                            dew.checkOut(pj);
                        }
                        else if(no==2){
                            AnggotaAnak anak= new AnggotaAnak();
                            Peminjaman pj = new Peminjaman();
                            anak.daftar();
                            daong.addAnggota(anak);
                            dat.showJudulBuku();
                            anak.meminjam();
                            anak.checkOut(pj);
                        }
                        else{
                            System.out.println("maaf, nomor yang anda masukkan salah!");
                            a=0;
                        }
                    }
                    else if(no==2){
                        Peminjaman pj = new Peminjaman();
                        daong.pilihAnggota();
                        dat.showJudulBuku();
                        daong.anggotaAktif.meminjam();
                        daong.anggotaAktif.checkOut(pj);
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }          
                }
                else if(no == 3){
                    daong.pilihAnggota();
                    daong.anggotaAktif.isiSaldo();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no==4){
                    daong.pilihAnggota();
                    daong.infoAnggota();
                    System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                    no = sc.nextInt();
                    if(no==1){
                        System.out.println("sampai jumpa di lain waktu");
                        break;
                    }
                    else if(no==2){
                        a=0;
                    }
                    else{
                        System.out.println("maaf, nomor yang anda masukkan salah");
                        a=0;
                    }
                }
                else if(no==5){
                    a=0;
                }
                else {
                    System.out.println("maaf, nomor yang anda masukkan salah");
                }
            }
            else if(no==3){
                menu.showMenuPendapatan();
                System.out.print("pilih = ");
                no = sc.nextInt();
                if (no == 1){
                    System.out.println("jumlah peminjaman = "+pjm.getJumlahPeminjaman());
                }
                else if(no == 2){
                    System.out.println("pendapatan = "+ pjm.getJumlahPendapatan());
                }
                else if(no == 3){
                    a=0;
                }
                else{
                    System.out.println("maaf, nomor yang anda masukkan salah");
                }
                System.out.print("ingin keluar? (1. ya; 2. tidak) = ");
                no = sc.nextInt();
                if(no==1){
                    System.out.println("sampai jumpa di lain waktu");
                    break;
                }
                else if(no==2){
                    a=0;
                }
                else{
                    System.out.println("maaf, nomor yang anda masukkan salah");
                    a=0;
                }
            }
            else if(no==12){
                System.out.println("sampai jumpa di lain waktu");
                break;
            }
            else{
                System.out.println("maaf, nomor yang anda masukkan salah");
            }
        } 
    }
    else if(no==2){
        System.out.println("maaf, program ini hanya untuk petugas");
    }

    else{
        System.out.println("maaf, nomor yang anda masukkan salah");   
    }
    }
}