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
public class Bus {
    public int penumpang;
    public int maxPenumpang;
   
    //konstraktor kelas bus
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    Bus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if(temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kupta");
        }else {
            this.penumpang = temp;
        }
    }
   
    public void cetak() {
        System.out.println("Penumpang bus sekarang adalah: "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah: "+ maxPenumpang);
    }
} 
   
    

