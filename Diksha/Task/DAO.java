package Diksha;

import java.util.ArrayList;

public class DAO {


    Restaurent searchRestaurent(ArrayList<Restaurent> contacts,String info)
    {
        for(Restaurent r: contacts)
        {
            if(r.getName().equals(info))
            {
                return r;
            }
        }
        return null;

    }

    void addRestaurent(ArrayList<Restaurent> re)
    {
        Restaurent r1 =new Restaurent("NH8","Indiranagar","Indian","4");
        Restaurent r2  =new Restaurent("Adigas","Indiranagar","Indian","4");

        re.add(r1);
        re.add(r2);

        for(Restaurent r: re)
        {
            System.out.println(r);
        }

    }
}
