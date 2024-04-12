import java.util.ArrayList;
import java.util.List;

public class ListaPrzykladowa {
    private List<Element> lista;

    public ListaPrzykladowa() {
        lista = new ArrayList<>();
    }

    // Dodaje element do listy
    public void dodajElement(Element element) {
        lista.add(element);
    }

    // Usuwa element z listy
    public boolean usunElement(Element element) {
        return lista.remove(element);
    }

    // Wyświetla zawartość listy
    public void wyswietlListe() {
        System.out.println("Zawartość listy:");
        for (Element element : lista) {
            System.out.println(element.toString());
        }
    }

    // Wyszukuje element w liście po nazwie
    public boolean zawieraElementONazwie(String nazwa) {
        for (Element element : lista) {
            if (element.getNazwa().equals(nazwa)) {
                return true;
            }
        }
        return false;
    }


}
