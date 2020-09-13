package basicAlgorithmDemo;

/**
 * @ProjectName: spark_revise
 * @program: ml
 * @FileName: BubbleSort
 * @description: 冒泡排序-Java
 * **       冒泡排序的原理即是，对于一个元素个数为 n 的无序集合，
 * **       从第一个元素开始依次和下一个元素比较，较大者放在后面的位置，
 * **       最终可以得到一个最大值并放置在最后一个位置。接下来再遍历 0 至 n-1 个元素，
 * **       找到第二大的数放置在 n-1 的位置，反复如此完成排序。
 * @version: 1.0
 * *
 * @author: koray
 * @create: 2020-09-13 14:08
 * @Copyright (c) 2020,All Rights Reserved.
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] array = {6, 2, 1, 3, 4, 5};
        bubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
