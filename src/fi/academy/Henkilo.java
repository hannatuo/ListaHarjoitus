package fi.academy;

import org.w3c.dom.ls.LSOutput;

public class Henkilo {
    private String nimi;
    private int ika;


    public Henkilo(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
        }

    public void setNimi(String nimi) {
        this.nimi = nimi;
        }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    @Override
    public String toString() {
        return (this.nimi + ", " + this.ika);
    }
}

