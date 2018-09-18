/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author M. RAFI PUTRA
 */
public class UjiBus {
    public static void main(String[] args) {
        
        //membuat objek busBesar dari kelas Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penmabhan penumpang
        busBesar.addPenumpang(15);
        //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penmabhan penumpang
        busBesar.addPenumpang(5);
        //menambahkan 15 penumpang
        busBesar.cetak();
        
        //penmabhan penumpang
        busBesar.addPenumpang(26);
        //menambahkan 15 penumpang
        busBesar.cetak();
        
    }
}
