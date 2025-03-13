package Diksha.Scholarship;

import java.util.ArrayList;



public class Scholarship {

    ArrayList<Student> list = new ArrayList<>();

    void assignScholarship()
    {
        for(Student s: list)
        {
            if(s.getPercentage() >= 91)
            {
                s.setScholarship(10000);
            } else if (s.getPercentage() >= 81) {
                s.setScholarship(5000);
            }
            else if(s.getPercentage() < 81)
            {
                s.setScholarship(0);
            }
            else {
                System.out.println("Invalid Percentage");
            }
        }
    }
}

class Portal{


    public static void main(String[] args) {


    }
}


