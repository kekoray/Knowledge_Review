package basicAlgorithmDemo;

/**
 * @ProjectName: spark_revise
 * @program: ml
 * @FileName: quickSortDemo
 * @description: 快速排序法
 * **   快速排序原理即是，选择数组中的一个元素作为基准值 pivot（通常使用第一个就行），
 * **   然后遍历其他元素，将小于 pivot 的元素放置在左边，将大于 pivot 的元素放置在右边。
 * **   可以得到两个子数组，再依次对子数组进行快速排序，最终完成排序。
 * @version: 1.0
 * *
 * @author: koray
 * @create: 2020-09-13 20:09
 * @Copyright (c) 2020,All Rights Reserved.
 */
public class quickSortDemo {
    public static void main(String[] args) {
        int[] array = {6, 2, 1, 3, 4, 5, 0};
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i);
        }
    }

    /**
     *
     * @param array
     * @param start 基准值
     * @param end 次数
     */
    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) {
            return;
        }
        int low = start;
        int high = end;
        int pivot = array[low];
        while (low < high) {
            while (low < high && array[high] >= pivot) {
                high--;
            }
            //将小于pivot的数放在低位
            array[low] = array[high];
            while (low < high && array[low] <= pivot) {
                low++;
            }
            //将大于pivot的数放在高位
            array[high] = array[low];
        }
        array[low] = pivot;
        //递归排序左半部分
        quickSort(array, start, low - 1);
        //递归排序右半部分
        quickSort(array, low + 1, end);
    }
}
