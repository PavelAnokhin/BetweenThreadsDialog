package ru.netology;

class Threads extends Thread implements Runnable {

    public Threads(String ThreadName,ThreadGroup mainGroup) {

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
