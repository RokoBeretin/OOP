package fst;

public class Dog {
    private String name;
    private int years;
    private String breed;

    public Dog(String name, String breed, int years){
        this.breed = breed;
        this.name = name;
        this.years = years;
    }
    public Dog(){
        System.out.println("Create a dog without fields values");
    }

    public void barkAsDog(){
        System.out.println(this.getClass().getSimpleName() + " av av av");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", breed='" + breed + '\'' +
                '}';
    }
}
