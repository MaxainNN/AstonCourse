package org.aston.module_four;

import java.util.concurrent.Semaphore;

/**
 * Реализация задания с печатью чисел 1 и 2 поочередно в консоль.
 * Сначала всегда печатается 1.
 */
public class PrintNumbersInThreads {

    private static final Semaphore semaphore1 = new Semaphore(1); // Начинаем с 1
    private static final Semaphore semaphore2 = new Semaphore(0); // 2 ожидает разрешения

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    semaphore1.acquire(); // Захват разрешения для 1
                    System.out.println("1");
                    semaphore2.release(); // Разрешаем напечатать 2
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    semaphore2.acquire(); // Захват разрешения для 2
                    System.out.println("2");
                    semaphore1.release(); // Разрешаем напечатать 1
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
