public class Element {
    private String nazwa;
    private int liczba;

    public Element(String nazwa, int liczba) {
        this.nazwa = nazwa;
        this.liczba = liczba;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getLiczba() {
        return liczba;
    }

    @Override
    public String toString() {
        return "Element "  +  nazwa + " liczba " + liczba ;
    }
}
