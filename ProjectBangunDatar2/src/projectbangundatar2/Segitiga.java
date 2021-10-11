/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author acer
 */
public class Segitiga {
    // luas
    int hitungLuas(int alas, int tinggi){
        return (alas * tinggi)/2;
    }
    double hitungLuas(double alas, double tinggi){
        return (alas * tinggi)/2;
    }
    double hitungLuas(int alas, double tinggi){
        return (alas * tinggi)/2;
    }
    double hitungLuas(double alas, int tinggi){
        return (alas * tinggi)/2;
    }
    
    
    // keliling segitiga sama kaki
    double hitungKeliling(int alas, int tinggi){
        double sisiSamaKaki = Math.sqrt( Math.pow((alas/2), 2) + Math.pow(tinggi, 2) );
        return alas + (2* sisiSamaKaki);
    }
    double hitungKeliling(double a, double t){
        double sisiS = Math.sqrt( Math.pow((a/2), 2) + Math.pow(t, 2) );
        return (2* sisiS)+a;
    }
}
