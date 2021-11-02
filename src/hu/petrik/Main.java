package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Bor b1 = new Bor("asd", 1000);
        Aszu a1 = new Aszu(1200, 20);

        Futtathato.kiirBor(b1);
        Futtathato.kiirBor(a1);
    }
}
