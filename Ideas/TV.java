package Ideas;
class Remote {
    public void click()
    {
        System.out.println("Clicking");
    }
}

public class TV {
    Remote remote;

    public TV(Remote remote) {
        this.remote = remote;
        remote.click();
    }
}
class Main{

    public static void main(String[] args) {
        Remote remote = new Remote();
        TV tv = new TV(remote);
    }
}
