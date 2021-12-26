package com.pb.PetryayevDm.HW13;

import java.util.Queue;

public class Consumer extends Thread {
    Queue q;
    public Consumer(Queue q) {
        this.q = q;
    }
    public void run() {
        while (true) {
            synchronized (q) {
                if (q.size() > 0) {
                    System.out.println("Изъят элемент " + q.poll());
                    System.out.println("Размер очереди в consumer: " + q.size());
                    q.notify();
                } else {
                    try {
                        Thread.sleep(2000);
                        System.out.println();
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
