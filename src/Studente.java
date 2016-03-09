import java.util.*;
public class Studente {

    private String nome;

    private String cognome;

    private int matricola;

    public Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public String getCognome(String cognome) {
        return this.cognome;
    }

    public int getMatricola(int matricola) {
        return this.matricola;
    }

    public void setCognome() {
        this.cognome = cognome;
    }

    public void setMatricola() {
        this.matricola = matricola;
    }
    
    public void stampaStudente(){
        System.out.println("Nome: " + this.nome + "\nCognome: " + this.cognome + "\nMatricola: " + this.matricola + "\n___________________________\n");
    }
}
