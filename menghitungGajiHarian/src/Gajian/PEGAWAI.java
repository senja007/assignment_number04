/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gajian;

/**
 *
 * @author senja007
 */
public class PEGAWAI {
    private String Nama, NIP;
    private double gajiPokok;
    private double lembur = 3000;
    private double uangMakan = 3500;
    private double transport = 4000;
    private int jumlahJamKerja;
    private double Gaji;
    
    

    public PEGAWAI(String Nama, String NIP) {
        this.Nama = Nama;
        this.NIP = NIP;
    }
    
    public PEGAWAI(String Nama, String NIP,int jamKerja) {
        this.Nama = Nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jamKerja;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    public void setGajiPokok() {
        gajiPokok = jumlahJamKerja * 2000;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setJumlahJamKerja(int jumlahJamKerja) {
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public int getJumlahJamKerja() {
        return jumlahJamKerja;
    }

    public void setLembur() {
        if (jumlahJamKerja <= 6){
            lembur = 0;
        } else {
            lembur = lembur;
        }
    }

    public double getLembur() {
        return lembur;
    }

    public void setTransport() {
        if (jumlahJamKerja <= 8){
            transport = 0;
        } else {
            transport = transport;
        }
    }

    public double getTransport() {
        return transport;
    }

    public void setuangMakan() {
        if (jumlahJamKerja <= 7){
            uangMakan= 0;
        } else {
           uangMakan = uangMakan;
        }
    }

    public double getUangMakan() {
        return uangMakan;
    }

    
    public void setTotalGaji() {
        Gaji = uangMakan + transport + lembur + gajiPokok;
    }
    
    public double getTotalGaji() {
        return Gaji;
    }

    public void printPenghasilan(){
        System.out.println("------- GAJI HARIAN PT. XYZ -------");
        System.out.println("===================================");
        System.out.println("Nama Karyawan           : "+ getNama());
        System.out.println("NIP                     : "+ getNIP());
        System.out.println("Jumlah jam kerja        : "+ getJumlahJamKerja());
        System.out.println("Gaji Pokok              : "+ getGajiPokok());
        System.out.println("Lembur                  : "+ getLembur());
        System.out.println("Uang Makan              : "+ getUangMakan());
        System.out.println("Transport Lembur        : "+ getTransport());
        System.out.println("TOTAL GAJI              : "+ getTotalGaji());
        System.out.println("===================================");
    }      

}