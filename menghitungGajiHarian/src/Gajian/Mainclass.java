/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gajian;

/**
 *
 * @author senja007
 */
public class Mainclass {
    public static void main(String[] args){
        PEGAWAI irma = new PEGAWAI("Irma Bening", "3216546545", 8);
        irma.setGajiPokok();
        irma.setTransport();
        irma.setuangMakan();
        irma.setLembur();
        irma.setTotalGaji();

        System.out.println(irma);
        irma.printPenghasilan();
        
        PEGAWAI dodit = new PEGAWAI("dodit mulyanto", "545574545", 6);
        dodit.setGajiPokok();
        dodit.setTransport();
        dodit.setuangMakan();
        dodit.setLembur();
        dodit.setTotalGaji();

        dodit.printPenghasilan();
        
        PEGAWAI malika = new PEGAWAI("Malika ginux", "6579816565", 10);
        malika.setGajiPokok();
        malika.setTransport();
        malika.setuangMakan();
        malika.setLembur();
        malika.setTotalGaji();

        malika.printPenghasilan();
         
    }
}
