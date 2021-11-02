package hu.petrik;

public class Bor {

    /**
     * String, a bor fajtája.
     */
    private String fajta;

    /**
     * Int, a bor évjárata.
     */
    private int evJarat;

    public Bor(String fajta, int evJarat) {
        this.fajta = fajta;
        this.evJarat = evJarat;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public int getEvJarat() {
        return evJarat;
    }

    public void setEvJarat(int evJarat) {
        this.evJarat = evJarat;
    }

    @Override
    public String toString() {
        return String.format("Bor, fajtája: %s, évjárata: %d", this.fajta, this.evJarat);
    }
}
