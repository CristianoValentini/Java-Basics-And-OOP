
package javabasics.RubricaExercise.models;

public class Contatto {
    private String nome;
    private String cognome;
    private String telefono;

    private Indirizzo indirizzo;

    public Contatto(String nome, String cognome, String telefono, Indirizzo indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.indirizzo= indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", telefono='" + telefono + '\'' +
                ", indirizzo=" + indirizzo +
                '}';
    }
}
