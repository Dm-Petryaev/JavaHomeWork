package com.pb.PetryayevDm.HW13;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Double> q = new LinkedList<>();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
