/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan52.siapakamu;

/**
 *
 * @author 
 * NAMA  : Dida Handian
 * Kelas : PBO3
 * NIM   : 10117091
 * Deskripsi Tugas : Membuat Program Data untuk Mahasiswa dan Dosen
 *  
 */
public class PBO310117091Latihan52SiapaKamu {

    /**
     */
    protected static String nama;
    protected static int umur;
    private static String nip;
    private static String mataKuliah;
    private static String nim;
    private static String kelas;
    
    public static void main(String[] args) {
        
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        mahasiswa.setNim("10117091");
        mahasiswa.setNama("Dida Handian");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO3");
        
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
