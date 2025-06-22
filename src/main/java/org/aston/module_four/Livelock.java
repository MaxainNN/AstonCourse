package org.aston.module_four;

/**
 * Реализация livelock.
 * Потоки бесполезно работают, взаимно мешая друг другу.
 * Оба потока проверяют, занят ли ресурс другим.
 * Если занят – ждут, затем снова пытаются.
 * В результате бесконечный цикл.
 */
public class Livelock {

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static boolean thread1HasLock1 = false;
    private static boolean thread2HasLock2 = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                if (!thread2HasLock2) {
                    thread1HasLock1 = true;
                    System.out.println("Thread 1: Trying to acquire lock1");
                    synchronized (lock1) {
                        System.out.println("Thread 1: Acquired lock1");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        thread1HasLock1 = false;
                    }
                } else {
                    System.out.println("Thread 1: Yielding to Thread 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (!thread1HasLock1) {
                    thread2HasLock2 = true;
                    System.out.println("Thread 2: Trying to acquire lock2");
                    synchronized (lock2) {
                        System.out.println("Thread 2: Acquired lock2");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        thread2HasLock2 = false;
                    }
                } else {
                    System.out.println("Thread 2: Yielding to Thread 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
