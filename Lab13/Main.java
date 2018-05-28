package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GuruThread3 threadguru1 = new GuruThread3("guru1");
        threadguru1.start();
        GuruThread3 threadguru2 = new GuruThread3("guru2");
        threadguru2.start();
    }
}
class GuruThread3 implements Runnable {
    Thread guruthread;
    private String guruname;
    ArrayList<Integer> list = new ArrayList<>();

    GuruThread3(String name) {
        guruname = name;
        list.add(333);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        list.add(888);
        list.add(999);
        list.add(000);
        list.add(112);
        list.add(123);
        list.add(134);
        list.add(145);
        list.add(156);

    }
    @Override
    public void run() {
        System.out.println("Thread running" + guruname);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
            System.out.println(guruname);
            System.out.println(list.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
    public void start() {
        System.out.println("Thread started");
        if (guruthread == null) {
            guruthread = new Thread(this, guruname);
            guruthread.start();
        }

    }
}