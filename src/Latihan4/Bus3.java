/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author M. RAFI PUTRA
 */
public class Bus3 {
    private int penumpang;
    private int maxpenumpang;
     
    public Bus3(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //METHOD MUTATOR
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.penumpang = temp;
        }
    }
    
    public void getPenumpang(int password) {
        if(password == 24) {
            System.out.println("Pssword benar");
        }else {
            System.out.println("Pssword salah");
        }
    }
    
    public void cetakPenumpang() {
        System.out.println("Penumpang bus sekarang : "+ penumpang);
        System.out.println("Maksimum penumapang yang sehausnya adalah: "+ maxpenumpang); 
    }
}
