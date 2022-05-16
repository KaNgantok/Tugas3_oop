package pert902;

/**
 *
 * @author Dani Pratama_20103320
 */
public class Pert902 {

    
    public static void main(String[] args) {
        
        suhu2 con = new suhu2();
        con.setC(10);
        System.out.println("Suhu Celsius Ke Fahrenheit   :"+con.Conversi("C-F"));
       
        con.setF(45);
        System.out.println("Suhu Fahrenheit Ke Celsius   :"+con.Conversi("F-C"));
        
        
    }
    
}
