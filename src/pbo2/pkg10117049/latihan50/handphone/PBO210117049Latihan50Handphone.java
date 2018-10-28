/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan50.handphone;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program informasi seputar kordinat
 */
public class PBO210117049Latihan50Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android andro = new Android("Xiaomi","Android","Redmi Note 5",3000000);
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android KeyStore : "+andro.getKeyStore());
        System.out.println("");
        
        Blackberry bb = new Blackberry("Balckberry","BB10","Z10",2000000);
        bb.setPinBB("BH151TT");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Microsoft","Windows Phone 10","Lumia 740",3500000);
        wp.setWpKeyStore("S451LB");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        
    }
    
}
