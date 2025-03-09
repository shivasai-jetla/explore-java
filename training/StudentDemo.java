package training;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StudentDemo {
    int id;
    String name;
    String branchName;
    String dateOfBirth;
    int age;
    String gender;

    public static void main(String[] args) {


        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        StudentDemo student1 = new StudentDemo();
        student1.id = 100;
        student1.name = "Sanju";
        student1.branchName = "ECE";
        student1.dateOfBirth = "23-02-2002";
        student1.age = 22;
        student1.gender = "male";

        System.out.println("ID: "+student1.id);
        System.out.println("NAME: "+student1.name);
        System.out.println("BRANCH:"+student1.branchName);
        System.out.println("Date Of Birth: "+student1.dateOfBirth);
        System.out.println("AGE: "+student1.age);
        System.out.println("GENDER: "+student1.gender);

    }
}
