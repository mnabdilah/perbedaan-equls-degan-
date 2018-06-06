/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetugas;

/**
 *
 * @author Sabri_abdillah
 */
public class Tugas3 {
    public static void main(String[] args) {
        String st1="Saya suka makan bakso";
        String st2="Saya suka makan bakso";
        String st3="Saya";
        String st4="suka";
        String st5="makan bakso";
        String st6=st3+st4+st5;
        
        System.out.println("Perbedaan method equals dengan separator ==");
        System.out.println();
        System.out.println("Statemen 1 : "+st1);
        System.out.println("Statemen 2 : "+st2);
        System.out.println("Statemen 3 : "+st3);
        System.out.println("Statemen 4 : "+st4);
        System.out.println("Statemen 5 : "+st5);
        System.out.println("Statemen 6 : "+st6);
        System.out.println();
        
        
        System.out.println();
        System.out.println("Membandingkan dengan method equals");
        System.out.println("Statement 1.equals(statement 2) " + (st1.equals(st2)));
        System.out.println("Statement 1.equals(statement 6) " + (st1.equals(st6)));
        System.out.println("method equals membandingkan isi memori");
        
        System.out.println("Membandingkan dengan method equals");
        System.out.println("Statement 1 == statement 2 " + (st1==st2));
        System.out.println("Statement 1 == statement 6 " + (st1==st6));
        System.out.println("method == akan  membandingkan alamat memori");
        
    }
    
}
