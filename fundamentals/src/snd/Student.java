package snd;

public class Student {
    private String name;
    private String university;
    private static int cntID = 100;
    private int id;
    private int yStu;
    public Student(String name, String university){
        this.name = name;
        this.university = university;
        this.id = cntID++;
    }

    public Student(String name, String university, int yStu){
        this(name, university);
        this.yStu = yStu;



    }

    public Student nextYearOfStudy(){
        System.out.println("Success - enrolled in the next study year!");
        this.yStu++;
        return this;
    }

}
