package uml;

public class Mechanic {
    private String mechanicName;
    public Mechanic(String name){
        this.mechanicName = name;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mechanicName='" + mechanicName + '\'' +
                '}';
    }
}
