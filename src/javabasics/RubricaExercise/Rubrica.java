package javabasics.RubricaExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javabasics.RubricaExercise.models.Contatto;
import javabasics.RubricaExercise.models.Indirizzo;

public class Rubrica {
    public static void main(String[] args) {
        List<Contatto> rubrica = new ArrayList<>();
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        boolean running = true;

        while (running) {
            System.out.println(" *******   **     ** ******   *******   **   ******      **             ********  *******   **     ** *******  *******    *******             **    \n" +
                    "/**////** /**    /**/*////** /**////** /**  **////**    ****           **//////**/**////** /**    /**/**////**/**////**  **/////**           ****   \n" +
                    "/**   /** /**    /**/*   /** /**   /** /** **    //    **//**         **      // /**   /** /**    /**/**   /**/**   /** **     //**         **//**  \n" +
                    "/*******  /**    /**/******  /*******  /**/**         **  //**       /**         /*******  /**    /**/******* /******* /**      /**        **  //** \n" +
                    "/**///**  /**    /**/*//// **/**///**  /**/**        **********      /**    *****/**///**  /**    /**/**////  /**////  /**      /**       **********\n" +
                    "/**  //** /**    /**/*    /**/**  //** /**//**    **/**//////**      //**  ////**/**  //** /**    /**/**      /**      //**     **       /**//////**\n" +
                    "/**   //**//******* /******* /**   //**/** //****** /**     /**       //******** /**   //**//******* /**      /**       //*******        /**     /**\n" +
                    "//     //  ///////  ///////  //     // //   //////  //      //         ////////  //     //  ///////  //       //         ///////         //      // ");

            System.out.println("Seleziona un'operazione:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Cerca contatto");
            System.out.println("3. Visualizza tutti i contatti");
            System.out.println("4. Ricerca contatto per iniziale cognome");
            System.out.println("5. Cancella contatto");
            System.out.println("6. Ricerca per indirizzo");
            System.out.println("0. Esci");

            int scelta = input.nextInt();

            switch (scelta) {

                case 1:

                    System.out.println("Inerisci il nome del contatto:");
                    String name = input.next();
                    System.out.println("Inerisci il cognome del contatto:");
                    String cognome = input.next();
                    System.out.println("Inerisci il numero di telefono del contatto:");
                    String numeroTelefono = input.next();
                    System.out.println("inserisci via");
                    String  via = input.next();
                    System.out.println("inserisci civico");
                    String civico= input.next();
                    System.out.println("inserisci citta");
                    String citta= input.next();
                    System.out.println("inserisci cap");
                    String cap= input.next();
                    System.out.println("inserisci provincia");
                    String provincia= input.next();

                    Indirizzo indirizzo=new Indirizzo();
                    indirizzo.via=via;

                    indirizzo.setCivico(civico);
                    indirizzo.setCap(cap);
                    indirizzo.setCitta(citta);
                    indirizzo.setProvincia(provincia);

                    Contatto contatto = new Contatto(name, cognome, numeroTelefono, indirizzo);
                    rubrica.add(contatto);
                    System.out.println("Contatto aggiunto!");

                    break;

                case 2:
                    System.out.println("Inserisci il nome o il cognome del contatto da cercare:");
                    String searchString = input.next().toLowerCase();
                    List<Contatto> risultatiRicerca = new ArrayList<>();
                    for (Contatto cerca : rubrica) {
                        if (cerca.getNome().toLowerCase().contains(searchString) || cerca.getCognome().toLowerCase().contains(searchString)) {
                            risultatiRicerca.add(cerca);
                        }
                    }
                    if (risultatiRicerca.isEmpty()) {
                        System.out.println("Nessun contatto trovato");
                    } else {
                        System.out.println("Contatti trovati:");
                        for (Contatto c : risultatiRicerca) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.println("/---------------------------------------------/");
                    System.out.println("/----------------------RUBRICA----------------/");
                    System.out.println("/---------------------------------------------/");
                    int j = 1;
                    for (Contatto c : rubrica) {
                        System.out.println(j + " - " + c);
                        j++;
                    }
                    System.out.println("/---------------------------------------------/");
                    break;

                case 4:
                    System.out.println("Inserisci l'iniziale del cognome:");
                    String iniziale = input.next();
                    System.out.println("/----------------------RISULTATI RICERCA PER COGNOME----------------/");
                    int i = 1;
                    for (Contatto ricercaCognome : rubrica) {
                        if (ricercaCognome.getCognome().startsWith(iniziale.toUpperCase())) {
                            System.out.println(i + " - " + ricercaCognome);
                            i++;
                        }
                    }
                    System.out.println("/--------------------------------------------------------/");

                    break;

                case 5:
                    System.out.println("Inserisci il nome del contatto da cancellare:");
                    String nomeCancellazione = input.next();
                    System.out.println("Inserisci il cognome del contatto da cancellare:");
                    String cognomeCancellazione = input.next();
                    boolean trovato = false;
                    for (Contatto contatto2 : rubrica) {
                        if (contatto2.getNome().equals(nomeCancellazione) && contatto2.getCognome().equals(cognomeCancellazione)) {
                            rubrica.remove(contatto2);
                            System.out.println("Contatto cancellato!");
                            trovato = true;
                            break;
                        }
                    }

                    if (!trovato) {
                        System.out.println("Contatto non trovato");
                    }
                    break;
/**

                case 6:
                    System.out.println("Inserisci la via del contatto");
                    String indirizzo2 = input.next();
                    System.out.println("/----------------------RISULTATI RICERCA PER VIA----------------/");
                    int x = 1;
                    for (Contatto ricercaIndirizzo : rubrica) {
                        if (ricercaIndirizzo.().equals(indirizzo2)) {
                            System.out.println(x + " - " + ricercaIndirizzo);
                            x++;
                        }
                    }
                    System.out.println("/--------------------------------------------------------/");
                    break;
**/

                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Operazione non valida");
                    break;
            }
        }

    }
}




