/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Peminjaman {
    private double total;
    
    public Peminjaman(){
        
    }

    public double getTotal(){
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void catatPeminjaman(double total){
        this.total = total;
        RekapPeminjaman rp = new RekapPeminjaman();
    }
}