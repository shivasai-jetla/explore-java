package Ideas;

public class TV1 {
    Remote1 remote;

    public TV1() {
        this.remote = new Remote1();
        remote.click();
    }
}
class Main1 {

    public static void main(String[] args) {
        TV1 tv = new TV1();
    }
}

