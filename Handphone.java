/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascontoh2;

/**
 *
 * @author Faiq
 */
public class Handphone extends Gadget {

    /**
     * @return the os
     */
    protected String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    protected void setOs(String os) {
        this.os = os;
    }

    /**
     * @return the kapasitasBaterai
     */
    protected int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    /**
     * @param kapasitasBaterai the kapasitasBaterai to set
     */
    protected void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    /**
     * @return the jumlahKamera
     */
    protected int getJumlahKamera() {
        return jumlahKamera;
    }

    /**
     * @param jumlahKamera the jumlahKamera to set
     */
    protected void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }

    /**
     * @return the jumlahSim
     */
    protected int getJumlahSim() {
        return jumlahSim;
    }

    /**
     * @param jumlahSim the jumlahSim to set
     */
    protected void setJumlahSim(int jumlahSim) {
        this.jumlahSim = jumlahSim;
    }
    private String os;
    private int kapasitasBaterai;
    private int jumlahKamera;
    private int jumlahSim;
}
