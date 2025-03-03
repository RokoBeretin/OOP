package fst;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Marko", 2, "nauticar", "Zagreb");
        stu1.setName("Boban");
        stu1.setStudij("Da");
        stu1.setGodinaStudija(22);
        stu1.setSveuciliste("Zadar");
        System.out.println(stu1);
        System.out.println(stu2);
    }


}
