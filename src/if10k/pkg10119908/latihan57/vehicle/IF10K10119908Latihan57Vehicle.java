/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119908.latihan57.vehicle;

/**
 *
 * @author senenngahenen
 * Nama     : Aldi Nugraha
 * NIM      : 10119908
 * Kelas    : IF-10K
 */
public class IF10K10119908Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Becycle bicycle = new Becycle("Trek Bike", "7.4FX");
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyMOdel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getMyBrand());
        System.out.println("Model : "+bicycle.getMyMOdel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        
        System.out.println("");
  
        Skateboard sb = new Skateboard("Ally Skate", "Rocket");
        sb.setMyBrand("Ally Skate");
        sb.setMyMOdel("Rocket");
        sb.setMyBoardLenght(54.5);
        System.out.println("Brand : "+sb.getMyBrand());
        System.out.println("Model : "+sb.getMyMOdel());
        System.out.println("Panjangnya Board : "+sb.getMyBoardLenght());
    }
    
}
