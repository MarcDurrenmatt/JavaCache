/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Direct;


/**
 *
 * @author pedago
 */
public class NewClass {
    double Etiquette;
    int validité;
    
    public NewClass(double Eti, int v){
        this.Etiquette=Eti;
        this.validité=v;
    }
    
    public double getEti(){
        return Etiquette;
    }
    
    public int getVal(){
        return validité;
    }
    
    public void setEti(double eti){
        this.Etiquette=eti;
    }
    
    public void setVal(int val){
        this.validité=val;
    }
    
}