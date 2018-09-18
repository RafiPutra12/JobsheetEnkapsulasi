/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author M. RAFI PUTRA
 */
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa Siswa = new EncapSiswa();
        Siswa.setName("Rafi");
        Siswa.setAbsen(26);
        Siswa.setAddress("Malang");
        
        System.out.println("Nama: "+ Siswa.getName()+ " Absen: "
        + Siswa.getAbsen()+ " Address: "+ Siswa.getAddress());
        
    }
}
