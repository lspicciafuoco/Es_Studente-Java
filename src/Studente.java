//Classe Studente
public class Studente {

    private String nome;        //Definizione della variabile nome

    private String cognome;    //Definizione della variabile cognome

    private int matricola;    //Definizione della variabile matricola

    //Costruttore della classe Studente con relativi attributi
    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    //Metodo getter per la varibile nome
    public String getNome(String nome) {
        return this.nome;
    }

    //Metodo getter per la varibile cognome
    public String getCognome(String cognome) {
        return this.cognome;
    }

    //Metodo getter per la varibile matricola
    public int getMatricola(int matricola) {
        return this.matricola;
    }

    
    //Ciclo per stampare gli attributi di uno studente
    public void stampaStudente(){
        System.out.println("Nome: " + this.nome + "\nCognome: " + this.cognome + "\nMatricola: " + this.matricola + "\n___________________________\n");
    }
}
