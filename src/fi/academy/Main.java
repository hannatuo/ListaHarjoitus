package fi.academy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> lista = new ArrayList<String>();
        lista.add("Kauko");
        lista.add("Hemuli");
        lista.add("Cecilia");
        lista.add("Erkki");
        lista.add("Ville");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }
        List<Henkilo> henkiloLista = new ArrayList<Henkilo>();
        henkiloLista.add(new Henkilo("Markku", 6));
        henkiloLista.add(new Henkilo("Kari", 9));
        henkiloLista.add(new Henkilo("Mimmi", 85));
        henkiloLista.add(new Henkilo("Gerda", 2));
        henkiloLista.add(new Henkilo("Pirkko", 27));

        for (int j = 0; j < henkiloLista.size(); j++) {
            System.out.println(henkiloLista.get(j));
        }

        String[] viikonpaivat = {maanantai,tiistai,keskiviikko, torstai,perjantai};


        for (String Viikonpaiva : viikonpaivat) {
            if (Viikonpaiva.startsWith("t")) {
                viikonpaivat.remove(Viikonpaiva);

            }
        }

        Iterator<String> iter = viikonpaivat.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(s);


        }
    }
}