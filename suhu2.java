package pert902;

/**
 *
 * @author Dani Pratama_20103320
 */
public class suhu2 {
    
    private double hasil, C, F;
    
    public void setC(double nilai){
        
        this.C = nilai;
      
    }
    
    public void setF(double nilai){
        
        this.F = nilai;
        
    }
    
    public void setHasil(double hsl){
    
        this.hasil = hsl;
        
}
    public double getHasil(){
    
        return this.hasil;
        
}
    public double Conversi(String jns){
    
        if(jns == "C-F")    
        
            this.hasil=C*9/5+ 32; 
    
        else if(jns == "F-C")
        
            this.hasil= (F-32)*5/9; 
        
        return this.hasil;
        
    }

}
