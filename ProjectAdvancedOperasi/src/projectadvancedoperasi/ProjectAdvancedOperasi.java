/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author acer
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object to call method
        Operasi bil = new Operasi();
        
        System.out.println("Soal Nomer 7\n---------------");
        
        // a.	3+4
        int A = bil.jumlahkan(3,4);
        System.out.println("3+4 = " + A);
        
        // b.	4+7+(-9)
        int B = bil.jumlahkan(4, 7, -9);
        System.out.println("4+7+(-9) = " + B);
   
        // c.	3.4+(-0.002)+0.12313
        double hasilC = bil.jumlahkan(3.4, 0.12313, -0.002);
        System.out.println("3.4 + (-0.002) + 0.12313 : " + hasilC);
        
        
        System.out.println("\n\nproject 1\n---------------");
        
        // perkalian 
        int hasilKali1 = bil.perkalian(10, 3);
        System.out.println("10 x 3 : " + hasilKali1);
        
        double hasil2 = bil.perkalian(3, 5, 2.5);
        System.out.println("3 x 5 x 2.5 : " + hasil2);
    }
    
    
    
}
