/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascontoh1;

/**
 *
 * @author Faiq
 */
public class Darat extends Transportasi {

    /**
     * @return the jenisJalan
     */
    protected String getJenisJalan() {
        return jenisJalan;
    }

    /**
     * @param jenisJalan the jenisJalan to set
     */
    protected void setJenisJalan(String jenisJalan) {
        this.jenisJalan = jenisJalan;
    }

    /**
     * @return the sistemPenggerak
     */
    protected String getSistemPenggerak() {
        return sistemPenggerak;
    }

    /**
     * @param sistemPenggerak the sistemPenggerak to set
     */
    protected void setSistemPenggerak(String sistemPenggerak) {
        this.sistemPenggerak = sistemPenggerak;
    }

    /**
     * @return the jenisMesin
     */
    protected String getJenisMesin() {
        return jenisMesin;
    }

    /**
     * @param jenisMesin the jenisMesin to set
     */
    protected void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    private String jenisJalan;
    private String sistemPenggerak;
    private String jenisMesin;
}
