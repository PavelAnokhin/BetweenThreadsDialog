package ru.netology;

class Threads extends Thread {

    public Threads(String ThreadName,ThreadGroup mainGroup) {
        super(mainGroup, ThreadName);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                Thread MyThread = new Thread();
                System.out.println("Hello everyone. My name is" + Thread.currentThread().getName() );
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
