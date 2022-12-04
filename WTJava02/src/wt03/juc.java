package wt03;

public class juc {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Object obj = new Object();
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                for (int i : arr1) {
                    System.out.print(i+" ");
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                for (int i : arr2) {
                    System.out.print(i+" ");
                    try {
                        obj.notify();
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        });

        t1.start();
        t2.start();
    }
}
