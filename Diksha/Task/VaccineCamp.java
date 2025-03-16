package Diksha;

import java.util.ArrayList;

public class VaccineCamp {

    ArrayList<Vaccine> vaccineList = new ArrayList<>();

    public void assignVaccine() {

        for (Vaccine v: vaccineList) {
            if (v.getAge() >= 45) {
                v.setDosage(200);
            } else if (v.getAge() >= 20) {
                v.setDosage(200);
            } else if (v.getAge() < 20) {
                v.setDosage(100);
            } else {
                System.out.println("Invalid age");
            }
        }
    }

    public  float vaccineInjected()
    {
        float totalVaccine =0;
        for(Vaccine v: vaccineList)
        {
            totalVaccine = totalVaccine + v.getDosage();
        }
        return  totalVaccine;
    }

    public static void main(String[] args) {

        VaccineCamp vc = new VaccineCamp();

        vc.vaccineList.add(new Vaccine(49));
        vc.vaccineList.add(new Vaccine(26));
        vc.vaccineList.add(new Vaccine(19));

        vc.assignVaccine();
        System.out.println("Total Dosage: "+vc.vaccineInjected());

    }
}
