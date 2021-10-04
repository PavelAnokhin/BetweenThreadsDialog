package ru.netology;

import java.lang.ThreadGroup;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup =new ThreadGroup("main  thread group");
        final Threads MyThread1 = new Threads("My name is Thread 1",mainGroup);
        final Threads  MyThreads2 = new Threads("My name is Thread 2",mainGroup);
        final Threads MyThread3 = new Threads("My name is Thread 3",mainGroup);
        final Threads  MyThreads4 = new Threads("My name is Thread 4",mainGroup);
        MyThread1.start();
        MyThreads2.start();
        MyThread3.start();
        MyThreads4.start();
        //запуск потока но

        try {
            Thread.sleep(15000);
            System.out.println("All threads are breaking off.");
        } catch (InterruptedException exception ) {
            exception.printStackTrace();
        }
        mainGroup.interrupt();

    }
}
