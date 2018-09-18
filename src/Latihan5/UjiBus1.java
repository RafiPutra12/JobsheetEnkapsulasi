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
public class UjiBus1 {
    public static void main(String[] args) {
        Bus1 Bus = new Bus1(15);
        Bus.getPenumpang(154);
        Bus.getPenumpang(678);
        
        Bus.addPenumpang(4);
        Bus.cetak();
        Bus.getAverage();
        
        Bus.addPenumpang(5);
        Bus.cetak();
        Bus.getAverage();
        
        Bus.addPenumpang(3);
        Bus.cetak();
        Bus.getAverage();
        
        Bus.addPenumpang(1);
        Bus.cetak();
        Bus.getAverage();
    }
}
