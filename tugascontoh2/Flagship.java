/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascontoh2;

/**
 *
 * @author Faiq
 */
public class Flagship extends Handphone {
    
    private String Chipset;
    private int ram;
    private String Material;

    /**
     * @return the Chipset
     */
    protected String getChipset() {
        return Chipset;
    }

    /**
     * @param Chipset the Chipset to set
     */
    protected void setChipset(String Chipset) {
        this.Chipset = Chipset;
    }

    /**
     * @return the ram
     */
    protected int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    protected void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the Material
     */
    protected String getMaterial() {
        return Material;
    }

    /**
     * @param Material the Material to set
     */
    protected void setMaterial(String Material) {
        this.Material = Material;
    }
    
    public static void main(String[] args) {
        Flagship S27Ultra = new Flagship();
        
        S27Ultra.setJenisDaya("Baterai");
        S27Ultra.setBerat(200);
        
        S27Ultra.setOs("Android");
        S27Ultra.setKapasitasBaterai(8000);
        S27Ultra.setJumlahKamera(4);
        S27Ultra.setJumlahSim(2);
        
        S27Ultra.setChipset("Snapdragon 8 Gen");
        S27Ultra.setRam(16);
        S27Ultra.setMaterial("Kaca");
        
        System.out.println("Jenis Daya S27Ultra : " + S27Ultra.getJenisDaya());
        System.out.println("Berat S27Ultra : " + S27Ultra.getBerat() + "gram");
        
        System.out.println("OS S27Ultra : " + S27Ultra.getOs());
        System.out.println("Kapasitas Baterai S27Ultra : " + S27Ultra.getKapasitasBaterai() + "mAh");
        System.out.println("Jumlah Kamera S27Ultra : " + S27Ultra.getJumlahKamera());
        System.out.println("Jumlah SIM S27Ultra : " + S27Ultra.getJumlahSim());
        
        System.out.println("Chipset S27Ultra : " + S27Ultra.getChipset());
        System.out.println("RAM S27Ultra : " + S27Ultra.getRam() + "GB");
        System.out.println("Material S27Ultra : " + S27Ultra.getMaterial());
    }
}
