package com.pb.PetryayevDm.HW13;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
    Queue q;
    public Producer(Queue q) {
        this.q = q;
    }
    Random r = new Random();
    public void run() {
        while (true) {
            synchronized (q) {
                if (q.size() != 5) {
                    double gaussian = r.nextGaussian();
                    q.offer(gaussian);
                    System.out.println("Добавлен элемент: " + gaussian);
                    System.out.println("Размер очереди в producer: " + q.size());
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
