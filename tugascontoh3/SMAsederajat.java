/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascontoh3;

/**
 *
 * @author Faiq
 */
public class SMAsederajat extends Sekolah {

    /**
     * @return the kepalaSekolah
     */
    protected String getKepalaSekolah() {
        return kepalaSekolah;
    }

    /**
     * @param kepalaSekolah the kepalaSekolah to set
     */
    protected void setKepalaSekolah(String kepalaSekolah) {
        this.kepalaSekolah = kepalaSekolah;
    }

    /**
     * @return the jenisSekolah
     */
    protected String getJenisSekolah() {
        return jenisSekolah;
    }

    /**
     * @param jenisSekolah the jenisSekolah to set
     */
    protected void setJenisSekolah(String jenisSekolah) {
        this.jenisSekolah = jenisSekolah;
    }

    /**
     * @return the Jurusan
     */
    protected String getJurusan() {
        return Jurusan;
    }

    /**
     * @param Jurusan the Jurusan to set
     */
    protected void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }
    private String jenisSekolah;
    private String Jurusan;
    private String kepalaSekolah;
}
