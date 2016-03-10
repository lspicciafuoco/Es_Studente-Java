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
        
        //Istruzioni per input
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        //Instanziamento dell' oggetto Studente s1 con attributi
        Studente s1 = new Studente("Alessio", "Picciafuoco", 12546);
        
        //Instanziamento dell' oggetto Voti v1 per la pagella 2014
        Voti v1 = new Voti(5,4,6,8,9);
        
        //Instanziamento dell' oggetto Voti v2 per la pagella 2015
        Voti v2 = new Voti(4,8,9,5,7);
        
        //Instanziamento dell' oggetto Voti v3 per la pagella 2016
        Voti v3 = new Voti(7,5,9,8,7);
        
        
        //Stampa delle stringhe per scelta pagella
        System.out.println("PREMERE 1 PER LA PAGELLA DEL 2014");
        System.out.println("PREMERE 2 PER LA PAGELLA DEL 2015");
        System.out.println("PREMERE 3 PER LA PAGELLA DEL 2016");
        
        //Definizione e inizializzazione della variabile scelta 
        int scelta = 0;
        
        //
        String opzione = tastiera.readLine();
        scelta = Integer.valueOf(opzione).intValue();
        
        //Costrutto switch per la scelta della pagella
        switch(scelta){
            
            case 1:
                
                //Richiamo del metodo che stampa lo studente dell' oggetto s1
                s1.stampaStudente();
                //Richiamo del metodo che memorizza e stampa l'array voti dell' oggetto v1
                v1.memorizzaVoti(v1.Voti);
                
                break;
                
            case 2:
                
                //Richiamo del metodo che stampa lo studente dell' oggetto s1
                s1.stampaStudente();
                //Richiamo del metodo che memorizza e stampa l'array voti dell' oggetto v2
                v2.memorizzaVoti2(v1.Voti);
                
                break;
            
            case 3:
                
                //Richiamo del metodo che stampa lo studente dell' oggetto s1
                s1.stampaStudente();
                //Richiamo del metodo che memorizza e stampa l'array voti dell' oggetto v3
                v3.memorizzaVoti3(v3.Voti);
                
                break;
                
                default:
                System.out.println("Scelta della pagella non disponibile");
                
        }
    }
}    
