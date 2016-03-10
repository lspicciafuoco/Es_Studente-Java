//Classe Voti
public class Voti {

    private int italiano;       //Inizializzazione della variabile per la materia Italiano

    private int matematica;     //Inizializzazione della variabile per la materia Matematica

    private int inglese;        //Inizializzazione della variabile per la materia Inglese

    private int storia;         //Inizializzazione della variabile per la materia Storia   

    private int informatica;    //Inizializzazione della variabile per la materia Informatica
    
    private int N = 5;          //Variabile per la dimensione dell'array Voti
    
    public int[] Voti = new int[N]; //Dichiarazione dell'array Voti[] di tipo int
    
    
    //Costruttore della classe Voti con relativi attributi
    public Voti(int italiano, int matematica, int inglese, int storia, int informatica) {
      
        this.italiano = italiano;
        this.matematica = matematica;
        this.inglese = inglese;
        this.storia = storia;
        this.informatica = informatica;
    }
    
        
    
    //Metodo getter per la variabile italiano
    public int getItaliano(int italiano) {
        return this.italiano;
    }
    
    //Metodo getter per la variabile matematica 
    public int getMatematica(int matematica) {
        return this.matematica;
    }
    
    //Metodo getter per la variabile inglese
    public int getInglese(int inglese) {
        return this.inglese;
    }

    //Metodo getter per la variabile storia
    public int getStoria(int storia) {
        return this.storia;
    }

    //Metodo getter per la variabile informatica
    public int getInformatica(int informatica) {
        return this.informatica;
    }
    
    //Metodo per riempire e stampare l'array Voti della pagella 2014
    public void memorizzaVoti(int Voti[]){
        int i;
        int N = 1;
        
        //Ciclo per riempire l'array Voti
        for(i=0;i<N;i++){
            
            
            Voti[0] = italiano;
            Voti[1] = matematica;
            Voti[2] = inglese;
            Voti[3] = storia;
            Voti[4]= informatica;
            
            //Ciclo per stampare l'array Voti
            for(i=0;i<N;i++){
            System.out.println("Italiano: " + Voti[0]);
            System.out.println("Matematica: " + Voti[1]);
            System.out.println("Inglese: " + Voti[2]);
            System.out.println("Storia: " + Voti[3]);
            System.out.println("Informatica: " + Voti[4]);
            }
        }
    }
    
    //Metodo per riempire e stampare l'array Voti della pagella 2015
    public void memorizzaVoti2(int Voti[]){
        int i;
        int N = 1;
        
        //Ciclo per riempire l'array Voti
        for(i=0;i<N;i++){
            
            
            Voti[0] = italiano;
            Voti[1] = matematica;
            Voti[2] = inglese;
            Voti[3] = storia;
            Voti[4]= informatica;
            
            //Ciclo per riempire l'array Voti
            for(i=0;i<N;i++){
            System.out.println("Italiano: " + Voti[0]);
            System.out.println("Matematica: " + Voti[1]);
            System.out.println("Inglese: " + Voti[2]);
            System.out.println("Storia: " + Voti[3]);
            System.out.println("Informatica: " + Voti[4]);
            }
        }
    }
    
    //Metodo per riempire e stampare l'array Voti della pagella 2016
    public void memorizzaVoti3(int Voti[]){
        int i;
        int N = 1;
        
        //Ciclo per riempire l'array Voti
        for(i=0;i<N;i++){
            
            
            Voti[0] = italiano;
            Voti[1] = matematica;
            Voti[2] = inglese;
            Voti[3] = storia;
            Voti[4]= informatica;
            
            //Ciclo per riempire l'array Voti
            for(i=0;i<N;i++){
            System.out.println("Italiano: " + Voti[0]);
            System.out.println("Matematica: " + Voti[1]);
            System.out.println("Inglese: " + Voti[2]);
            System.out.println("Storia: " + Voti[3]);
            System.out.println("Informatica: " + Voti[4]);
            }
        }
    }
}

    
