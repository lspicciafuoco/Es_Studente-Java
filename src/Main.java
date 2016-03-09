import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessio
 */
public class Main {
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        Studente s1 = new Studente("Alessio", "Picciafuoco", 12546);
        
        Voti v1 = new Voti(5,4,6,8,9);
        Voti v2 = new Voti(4,8,9,5,7);
        Voti v3 = new Voti(7,5,9,8,7);
        
        
        
        System.out.println("PREMERE 1 PER LA PAGELLA DEL 2014");
        System.out.println("PREMERE 2 PER LA PAGELLA DEL 2015");
        System.out.println("PREMERE 3 PER LA PAGELLA DEL 2016");
        
        int scelta = 0;
        
        String opzione = tastiera.readLine();
        scelta = Integer.valueOf(opzione).intValue();
        
        switch(scelta){
            case 1:
                
                s1.stampaStudente();
                v1.memorizzaVoti(v1.Voti);
                
                break;
                
            case 2:
                
                s1.stampaStudente();
                v2.memorizzaVoti2(v1.Voti);
                
                break;
            
            case 3:
                
                s1.stampaStudente();
                v3.memorizzaVoti3(v3.Voti);
                
                break;
                
        }
    }
}    
