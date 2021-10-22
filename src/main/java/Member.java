//Добавил препятствие бег
public class Member {
    String name;
    int jumpHeight;
    int runForward;
    boolean isFinished;

    public Member(String name, int jumpHeight, int runForward){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runForward = runForward;
    }

    public void info(){
        System.out.println(name + " " + jumpHeight + " " + isFinished + " " + runForward);

    }
}
