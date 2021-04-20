package hw5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        calcArrayVal(arr);
        calcArrayValWithSplice(arr, h);
    }


    private static void calcArrayVal(float[] arr) {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        fillArr(arr);
        System.out.println(System.currentTimeMillis() - a);
    }

    private static void calcArrayValWithSplice(float[] arr, int h) {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> {
            fillArr(a1);
        });

        Thread t2 = new Thread(() -> {
            fillArr(a2);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void fillArr(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
