package hu.petrik;

public class Aszu extends Bor{
    private int puttony;

    public Aszu(int evJarat, int puttony) {
        super("aszu", evJarat);
        this.puttony = puttony;
    }

    public int getPuttony() {
        return puttony;
    }

    public void setPuttony(int puttony) {
        this.puttony = puttony;
    }

    @Override
    public String toString() {
        return String.format("Aszu, puttony: %d, évjárata: %d", this.puttony, super.getEvJarat());
    }
}
