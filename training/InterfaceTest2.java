package training;

interface takePhoto
{
    void capture();
}

interface musicPlayer
{
    void playingSong();
}

interface communication
{
    void makeCall();
}

class smartPhone implements takePhoto,musicPlayer,communication{
    @Override
    public void capture() {
        System.out.println("Capturing");
    }

    @Override
    public void playingSong() {
        System.out.println("Playing Music");
    }

    @Override
    public void makeCall() {
        System.out.println("Calling");
    }
}


public class InterfaceTest2 {

    public static void main(String[] args) {

        smartPhone sp = new smartPhone();

        sp.capture();
        sp.makeCall();
        sp.playingSong();
    }
}
