
package javabasics.RubricaExercise.models;

import java.util.ArrayList;
import java.util.List;

public class Indirizzo {
    public String via;

    private String civico;

    private String citta;

    private String cap;

    private String provincia;

    private static List<String> province = new ArrayList<>();

    public Indirizzo() {

        province = populateProvince();

    }

    private List<String> populateProvince() {
        List<String> province = new ArrayList<>();
        province.add("PA");
        province.add("RM");
        return province;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public void setProvincia(String provincia) {
        if (province.contains(provincia)) {
            this.provincia = provincia ;
        } else {
            System.out.println("Hai inserito una provincia non valida");
        }
    }


    @Override
    public String toString() {
        return "Indirizzo{" +
                "via='" + via + '\'' +
                ", civico='" + civico + '\'' +
                ", citta='" + citta + '\'' +
                ", cap='" + cap + '\'' +
                '}';
    }
}