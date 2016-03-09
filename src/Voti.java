

public class Voti {

    private int italiano;

    private int matematica;

    private int inglese;

    private int storia;

    private int informatica;
    
    private int N = 5;
    
    public int[] Voti = new int[N];
    
        
    public Voti(int italiano, int matematica, int inglese, int storia, int informatica) {
      
        this.italiano = italiano;
        this.matematica = matematica;
        this.inglese = inglese;
        this.storia = storia;
        this.informatica = informatica;
    }
    
        
    

    public int getItaliano(int italiano) {
        return this.italiano;
    }

    public int getMatematica(int matematica) {
        return this.matematica;
    }

    public int getInglese(int inglese) {
        return this.inglese;
    }

    public int getStoria(int storia) {
        return this.storia;
    }

    public int getInformatica(int informatica) {
        return this.informatica;
    }

    public void setItaliano() {
        this.italiano = italiano;
    }

    public void setMatematica() {
        this.matematica = matematica;
    }

    public void setInglese() {
        this.inglese = inglese;
    }

    public void setStoria() {
        this.storia = storia;
    }

    public void setInformatica() {
       this.informatica = informatica;
    }
    
    public void memorizzaVoti(int Voti[]){
        int i;
        int N = 1;
        
        for(i=0;i<N;i++){
            
            
            Voti[0] = italiano;
            Voti[1] = matematica;
            Voti[2] = inglese;
            Voti[3] = storia;
            Voti[4]= informatica;
            
            for(i=0;i<N;i++){
            System.out.println("Italiano: " + Voti[0]);
            System.out.println("Matematica: " + Voti[1]);
            System.out.println("Inglese: " + Voti[2]);
            System.out.println("Storia: " + Voti[3]);
            System.out.println("Informatica: " + Voti[4]);
            }
        }
    }
    
    public void memorizzaVoti2(int Voti[]){
        int j;
        int N = 1;
        
        for(j=0;j<N;j++){
            
            
            Voti[0] = italiano;
            Voti[1] = matematica;
            Voti[2] = inglese;
            Voti[3] = storia;
            Voti[4]= informatica;
            
            for(j=0;j<N;j++){
            System.out.println("Italiano: " + Voti[0]);
            System.out.println("Matematica: " + Voti[1]);
            System.out.println("Inglese: " + Voti[2]);
            System.out.println("Storia: " + Voti[3]);
            System.out.println("Informatica: " + Voti[4]);
            }
        }
    }
    
    public void memorizzaVoti3(int Voti[]){
        int k;
        int N = 1;
                
                
        
        for(k=0;k<N;k++){
            
            
            Voti[0] = italiano;
            Voti[1] = matematica;
            Voti[2] = inglese;
            Voti[3] = storia;
            Voti[4]= informatica;
            
            for(k=0;k<N;k++){
            System.out.println("Italiano: " + Voti[0]);
            System.out.println("Matematica: " + Voti[1]);
            System.out.println("Inglese: " + Voti[2]);
            System.out.println("Storia: " + Voti[3]);
            System.out.println("Informatica: " + Voti[4]);
            }
        }
    }
}

    
