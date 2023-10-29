public class Produkt {
    private int sr_nm;
    private int cena;
    private int hash;
    public Produkt(int sr_nm, int cena){ // Konstruktor z parametrami
        this.sr_nm = sr_nm;
        this.cena = cena;

        hash = cena+sr_nm;
        hash = 31 * hash; // obliczenie hasha
    }

    @Override
    public String toString() { //Przesłonięta metoda, która zwraca reprezentację obiektu Book w postaci ciągu znaków.
        return "Produkt{" +
                "sr_nm=" + sr_nm + '\''+
                ", cena=" + cena + '\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produkt)) return false;

        Produkt produkt = (Produkt) o;

        if (hash != o.hashCode()) {
            return false;
        }
        if (cena != produkt.cena) return false;
        if (sr_nm != produkt.sr_nm) return false;
        return true;
    }

    public int hashCode(){ //Przesłonięta metoda, która zwraca hash obiektu
        return hash;
    }
}
