package n04.es01;

public class Persona {
    String nome, cognome = new String();
    int eta = 0;

    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona(String nome, String cognome){
        this(nome, cognome, -1);
    }

    public Persona(String nome){
        this(nome, "Non specificato");
    }

    public Persona(){
        this("Non specificato");
    }
    
    public String toString(){
        return nome +" "+ cognome +" "+ eta;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }
    
    public int getEta(){
        return this.eta;
    }
    
    public boolean equals(Persona altro){
        if( ( this.nome.equals(altro.getNome()       ) ) && 
            ( this.cognome.equals(altro.getCognome() ) ) && 
            ( this.eta == altro.getEta()               ) ){
            return true;
        }
        return false;
    }
    
}