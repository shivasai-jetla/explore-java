package Ideas;

import java.util.ArrayList;
import java.util.List;

public class ClassList {

    private int ID;
    private String name;
    private String gender;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ClassList(int ID, String name, String gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ClassList{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}

class ClassListRepo
{
    ClassList cl;

    List<ClassList> cl1 = new ArrayList<>();

    public ClassListRepo(){
        cl1.add(new ClassList(21,"Srihari","Male"));
        cl1.add((new ClassList(22,"Jenny","Male")));
        //addPerson(cl);
    }

    public List<ClassList> getClassList()
    {
        return cl1;
    }

    public void addPerson(ClassList cl)
    {
        cl1.add(cl);
    }

    public static void main(String[] args) {
        ClassListRepo clr = new ClassListRepo();
        List<ClassList> cl1 = clr.getClassList();

        ClassList cl = new ClassList(23,"Raju","Male");

        clr.addPerson(cl);
        //System.out.println(cl1);
        for(ClassList i:cl1){
            System.out.println(i);
        }

    }
}

class ClassListController
{
    ClassListRepo repo;
    ClassList cl;

    public void addPerson(ClassList cl)
    {
        repo.addPerson(cl);
    }
}
