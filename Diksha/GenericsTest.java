package Diksha;

class Hey<T>
{
    T obj;

    Hey(T obj)
    {
        this.obj=obj;
    }

    public T getHey()
    {
        return this.obj;
    }
}

public class GenericsTest {

    public static void main(String[] args) {
        Hey<Integer> h1 = new Hey<Integer>(20);
        System.out.println(h1.getHey());
        Hey<String> h2 = new Hey<String>("Hello");
        System.out.println(h2.getHey());


    }
}
