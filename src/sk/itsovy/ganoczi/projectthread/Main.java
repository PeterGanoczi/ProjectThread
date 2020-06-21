package sk.itsovy.ganoczi.projectthread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DemoThread thread1 = new DemoThread("thread1");
        thread1.start();


        Users t1 = new Users();
        Users t2=new Users();
        t1.createUser("marek");
        t2.readUsers();


    }
}