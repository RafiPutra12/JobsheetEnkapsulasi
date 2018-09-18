/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author M. RAFI PUTRA
 */
public class Bus1 {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    public double penumpangbatu;
    
    public Bus1(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        
        if(temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
        }
    }
    
    public void getPenumpang(int password) {
        if(password == 678) {
            System.out.println("Password anda benar");
        }else {
            System.out.println("Password anda salah");
        }
    }
    
    public void getAverage() {
        double h = penumpang / 4;
        System.out.println("Rata ratanya adalah: "+ h);
    }
    
    public void cetak() {
        System.out.println("Penumpang bus sekarang: "+ penumpang);
        System.out.println("Maksimum penumpang seharusnya adalah: "+ maxpenumpang);
    }
}
