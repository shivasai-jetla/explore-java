package Diksha;


class StringPlay{
    int convert;
    int max;

    public StringPlay()
    {

    }
}

class StringMethod{
    int convertToInt(StringPlay sp,String str)
    {
        int result = Integer.parseInt(str);
        return sp.convert=result;
    }

    int getMax(StringPlay sp,String str,char ch)
    {
        int count = 0;
        for(int i=0;i < str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }

        return sp.max = count;
    }

}




public class StringTask1 {
    public static void main(String[] args) {


        StringPlay sp = new StringPlay();

        StringMethod sm = new StringMethod();
        int result = sm.convertToInt(sp,"123");
        System.out.println(result);

        System.out.println(sm.getMax(sp,"rrggggr",'g'));

    }
}
