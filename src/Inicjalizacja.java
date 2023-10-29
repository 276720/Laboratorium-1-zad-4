import java.util.HashSet;

public class Inicjalizacja {
    private static void printCollection(HashSet<Produkt> produkt) { //Metoda służąca do wyświetlania
        for (Produkt element : produkt) {                          //zawartości zbioru produktów na konsoli.
            System.out.println(element.toString());
        }
        System.out.println();
    }
    public static void run() {
        boolean areProduktsEqual;
        HashSet<Produkt> produkt = new HashSet<>();

        Produkt produkt1 = new Produkt(12345, 36);
        Produkt produkt2 = new Produkt(12345, 36);
        Produkt produkt3 = new Produkt(56721, 23);
        Produkt produkt4 = new Produkt(90746, 23);
        Produkt produkt5 = new Produkt(48295, 12);

        produkt.add(produkt1);
        produkt.add(produkt2);
        produkt.add(produkt3);
        produkt.add(produkt4);
        produkt.add(produkt5);

        areProduktsEqual = produkt1.equals(produkt2);
        System.out.println(areProduktsEqual);


        System.out.println(produkt1.hashCode());
        System.out.println(produkt2.hashCode());
        System.out.println(produkt3.hashCode());
        System.out.println(produkt4.hashCode());
        System.out.println(produkt5.hashCode());

        printCollection(produkt);
    }
}
