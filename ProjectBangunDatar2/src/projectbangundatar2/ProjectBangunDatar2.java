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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PERSEGI PANJANG
        System.out.println("Persegi Panjang\n--------------\nP:10   L:5");
        PersegiPanjang perpan = new PersegiPanjang();
        System.out.println("luas = "+perpan.hitungLuas(10, 5));
        System.out.println("keliling = "+perpan.hitungKeliling(10, 5));
        
        System.out.println("\nP:3,6   L:8");
        System.out.println("luas = "+perpan.hitungLuas(3.6, 8));
        System.out.println("keliling = "+perpan.hitungKeliling(3.6, 8));
        
        System.out.println("\nP:6   L:8,3");
        System.out.println("luas = "+perpan.hitungLuas(6, 8.3));
        System.out.println("keliling = "+perpan.hitungKeliling(6, 8.3));
        
        System.out.println("\nP:5,6   L:8,8");
        System.out.println("luas = "+perpan.hitungLuas(5.6, 8.8));
        System.out.println("keliling = "+perpan.hitungKeliling(5.6, 8.8));
        
        
        
        
        System.out.println("\n\nPersegi\n--------------");
        Persegi persegi = new Persegi();
        System.out.println("\nS:4,5");
        System.out.println("luas = "+persegi.hitungLuas(4.5));
        System.out.println("keliling = "+persegi.hitungKeliling(4.5));
        
        System.out.println("\nS:7");
        System.out.println("luas = "+persegi.hitungLuas(7));
        System.out.println("keliling = "+persegi.hitungKeliling(7));
        
        
        
        
        
        System.out.println("\n\nLingkaran\n--------------");
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("\nr:5");
        System.out.println("luas = "+lingkaran.hitungLuas(5));
        System.out.println("keliling = "+lingkaran.hitungKeliling(5));
        
        System.out.println("\nr:7,4");
        System.out.println("luas = "+lingkaran.hitungLuas(7.4));
        System.out.println("keliling = "+lingkaran.hitungKeliling(7.4));
        
        
        
        
        
        System.out.println("\n\nSegitiga\n--------------"); 
        Segitiga segitiga = new Segitiga();
        System.out.println("\nA:8   T:10");
        System.out.println("luas = "+segitiga.hitungLuas(8, 10));
        System.out.println("keliling = "+segitiga.hitungKeliling(8, 10));
        
        System.out.println("\nA:8   T:11,5");
        System.out.println("luas = "+segitiga.hitungLuas(8, 11.5));
        System.out.println("keliling = "+segitiga.hitungKeliling(8, 11.5));
        
        System.out.println("\nA:12,2   T:9");
        System.out.println("luas = "+segitiga.hitungLuas(12.2, 9));
        System.out.println("keliling = "+segitiga.hitungKeliling(12.2, 9));
        
        System.out.println("\nA:13,9   T:20,7");
        System.out.println("luas = "+segitiga.hitungLuas(13.9, 20.7));
        System.out.println("keliling = "+segitiga.hitungKeliling(13.9, 20.7));
        
    }
    
}
