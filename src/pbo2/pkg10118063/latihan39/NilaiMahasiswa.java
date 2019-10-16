/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118063.latihan39;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class NilaiMahasiswa {
    private final List<Integer> nilai = new ArrayList();
    private int jmlMhs,terbesar,terkecil;
    
    public void setNilai(int nilai){
        this.nilai.add(nilai);
    }

    public int getJmlMhs() {
        return jmlMhs;
    }

    public void setJmlMhs(int jmlMhs) {
        this.jmlMhs = jmlMhs;
    }
    
    private void hitungNilaiTerbesar(int idx){
        if(terbesar < nilai.get(idx))
            terbesar = nilai.get(idx);
    }
    
    private void hitungNilaiTerkecil(int idx){
        if(terkecil > nilai.get(idx))
            terkecil = nilai.get(idx);
    }
    
    public void tampilNilai(){
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        
        terbesar = nilai.get(0);
        terkecil = nilai.get(0);
        
        for(int i = 0; i < nilai.size(); i++){
            hitungNilaiTerbesar(i);
            hitungNilaiTerkecil(i);
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " = " + nilai.get(i));
        }
        System.out.println("\nNilai Terbesar adalah : " + terbesar);
        System.out.println("Nilai Terkecil adalah : " + terkecil);
    }
}
