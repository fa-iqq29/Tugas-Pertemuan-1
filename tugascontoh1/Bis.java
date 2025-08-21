/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascontoh1;

/**
 *
 * @author Faiq
 */
public class Bis extends Darat{

    /**
     * @return the jumlahKursi
     */
    protected int getJumlahKursi() {
        return jumlahKursi;
    }

    /**
     * @param jumlahKursi the jumlahKursi to set
     */
    protected void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    /**
     * @return the jenisLayanan
     */
    protected String getJenisLayanan() {
        return jenisLayanan;
    }

    /**
     * @param jenisLayanan the jenisLayanan to set
     */
    protected void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }
    
    private int jumlahKursi;
    private String jenisLayanan;
    
    public static void main(String[] args) {
        Bis kota = new Bis();
        
        kota.setBahanBakar("Bensin");
        kota.setKecepatanMaksimum(80);
        kota.setTipePenggunaan("Umum");
        
        kota.setJenisJalan("Aspal");
        kota.setSistemPenggerak("Roda");
        kota.setJenisMesin("Mesin Bakar");
        
        kota.setJumlahKursi(50);
        kota.setJenisLayanan("Ekonomi");
        
        System.out.println("Bahan Bakar Bis : " + kota.getBahanBakar());
        System.out.println("Kecepatan Bis : " + kota.getKecepatanMaksimum() + "km/jam");
        System.out.println("Tipe Penggunaan Bis : " + kota.getTipePenggunaan());
        
        System.out.println("Jalan yang dilalui Bis : " + kota.getJenisJalan());
        System.out.println("Sistem Penggerak Bis : " + kota.getSistemPenggerak());
        System.out.println("Jenis Mesin Bis : " + kota.getJenisMesin());
        
        System.out.println("Jumlah Kursi Bis : " + kota.getJumlahKursi());
        System.out.println("Jenis Layanan Bis : " + kota.getJenisLayanan());
        
    }
}
