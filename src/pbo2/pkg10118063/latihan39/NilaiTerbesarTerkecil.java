/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118063.latihan39;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        Petugas petugas = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa =====");
        
        //Petugas
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(scanner.next());
        
        //Mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilaiMhs.setJmlMhs(scanner.nextInt());
        
        //Nilai Mahasiswa
        for(int i = 0; i < nilaiMhs.getJmlMhs(); i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
            nilaiMhs.setNilai(scanner.nextInt());
        }
        nilaiMhs.tampilNilai();
        System.out.println("\nNama Petugas : " + petugas.getNama());
    }
    
}
