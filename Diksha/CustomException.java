package Diksha;

class InvalidAgeExceptionDemo
{
    static void checkAge(int age)
    {

        if(age<18)
        {
            throw new InvalidAgeException("sorry!!invalid age");
        }
        else
        {
            System.out.println("valid age");
        }

    }
    public  static void main(String args[])
    {
        checkAge(17);
    }

}
class InvalidAgeException extends RuntimeException {
    InvalidAgeException (String s)
    {
        System.out.println(s);
    }
}