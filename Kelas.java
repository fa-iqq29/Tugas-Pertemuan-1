/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascontoh3;

/**
 *
 * @author Faiq
 */
public class Kelas extends SMAsederajat {

    /**
     * @return the waliKelas
     */
    protected String getWaliKelas() {
        return waliKelas;
    }

    /**
     * @param waliKelas the waliKelas to set
     */
    protected void setWaliKelas(String waliKelas) {
        this.waliKelas = waliKelas;
    }

    /**
     * @return the jumlahSiswa
     */
    protected int getJumlahSiswa() {
        return jumlahSiswa;
    }

    /**
     * @param jumlahSiswa the jumlahSiswa to set
     */
    protected void setJumlahSiswa(int jumlahSiswa) {
        this.jumlahSiswa = jumlahSiswa;
    }

    /**
     * @return the ketuaKelas
     */
    protected String getKetuaKelas() {
        return ketuaKelas;
    }

    /**
     * @param ketuaKelas the ketuaKelas to set
     */
    protected void setKetuaKelas(String ketuaKelas) {
        this.ketuaKelas = ketuaKelas;
    }
    private String waliKelas;
    private int jumlahSiswa;
    private String ketuaKelas;
    
    public static void main(String[] args) {
        Kelas XII =new Kelas();
        
        XII.setTipeSekolah("Negeri");
        XII.setNamaSekolah("SMAN 1 Surabaya");
        XII.setJumlahGuru(50);
        
        XII.setJenisSekolah("SMA");
        XII.setJurusan("MIPA");
        XII.setKepalaSekolah("Pak Firman");
        
        XII.setWaliKelas("Ibu Yuli");
        XII.setJumlahSiswa(35);
        XII.setKetuaKelas("Anto");
        
        System.out.println("Tipe Sekolah : " + XII.getTipeSekolah());
        System.out.println("Nama Sekolah : " + XII.getNamaSekolah());
        System.out.println("Jumlah Guru : " + XII.getJumlahGuru());
        
        System.out.println("Kepala Sekolah : " + XII.getKepalaSekolah());
        System.out.println("Jenis Sekolah Kelas XII : " + XII.getJenisSekolah());
        System.out.println("Jurusan Kelas XII : " + XII.getJurusan());
        
        System.out.println("Wali Kelas XII : " + XII.getWaliKelas());
        System.out.println("Jumlah Siswa XII : " + XII.getJumlahSiswa());
        System.out.println("Ketua Kelas XII : " + XII.getKetuaKelas());
    }
}
