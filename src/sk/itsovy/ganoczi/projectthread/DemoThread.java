package sk.itsovy.ganoczi.projectthread;

class DemoThread implements Runnable {
    Thread demoThread;
    private String threadName;

    DemoThread(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running" + threadName);

        synchronized (this) {


            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                System.out.println(threadName);
                try {

                    notify();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        }
    }

    public void start() {
        System.out.println("Thread started");
        if (demoThread == null) {
            demoThread = new Thread(this, threadName);
            demoThread.start();
        }

    }
}