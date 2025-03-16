package Diksha;

public class Student {
    String name;
    String usn;
    String college;
    int cgpa;

    public Student(String name, String usn, String college, int cgpa) {
        this.name = name;
        this.usn = usn;
        this.college = college;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", usn='" + usn + '\'' +
                ", college='" + college + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

class StudentImplementation
{
    Student s;

    public StudentImplementation(Student s) {
        this.s = s;
    }

    Student getStudentInfo(String str)
    {
        if(s.name.equals(str))
        {
            return this.s;
        }
        return null;
    }

}

class StudentMain{
    public static void main(String[] args) {

        Student s = new Student("ram","rr","hey",76);

        StudentImplementation s1 = new StudentImplementation(s);

        Student student = s1.getStudentInfo("ram");

        System.out.println(student);


    }


}



