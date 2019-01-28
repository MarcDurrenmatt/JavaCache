/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Direct;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.L;

/**
 *
 * @author pedago
 */
public class cache {

    NewClass[] tab;
    int TailleBloc = 32;
    int succes;
    int echec;
    int temps;
    File file = new File("matrice10.txt");
    
    double nbr_line;
    
    ArrayList<Integer> L  = new ArrayList<Integer>();
    
    public cache(int nbr_l) {
        this.nbr_line=nbr_l;
        double taille = Math.pow(2, nbr_l);
        this.tab = new NewClass[(int) taille];
        for (int i=0;i<taille;i++){
            tab[i]=new NewClass(-1,0);
        }
    }
    
    public ArrayList<Integer> Simulation() {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String i = sc.nextLine();
                String num = i.split(":")[0];
                int n = Integer.parseInt(num);
                double deplacement = (n/32);
                double line = (n / 32) % (Math.pow(2, this.nbr_line));
                double etiquette = (n / 32) /+ (Math.pow(2, this.nbr_line));
                if (tab[(int) line].Etiquette==etiquette){
                    succes+=1;
                    temps+=5;
                }
                else{
                    echec+=1;
                    temps+=50;
                    tab[(int) line].setEti(etiquette);
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        L.add(succes);
        L.add(echec);
        L.add(temps);
        return L;
    }
    

}