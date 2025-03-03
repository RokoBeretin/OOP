package fst;

public class TestDogApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("debil", "ooo", 11);

        System.out.println(d1);
        System.out.println(d2);
        d1.barkAsDog();
        d2.barkAsDog();
    }
}
