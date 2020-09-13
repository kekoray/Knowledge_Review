package basicAlgorithmDemo;

/**
 * @ProjectName: spark_revise
 * @program: ml
 * @FileName: selectSort
 * @description: 选择排序算法
 * **  选择排序原理即是，遍历元素找到一个最小（或最大）的元素，把它放在第一个位置，
 * **  然后再在剩余元素中找到最小（或最大）的元素，把它放在第二个位置，依次下去，完成排序
 * @version: 1.0
 * *
 * @author: koray
 * @create: 2020-09-13 20:02
 * @Copyright (c) 2020,All Rights Reserved.
 */
public class selectSortDemo {
    public static void main(String[] args) {
        int[] array = {6, 2, 1, 3, 4, 5};
        selectSort(array);
        for (int i : array) {
            System.out.print(i);
        }

    }

    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            //用来记录最小值的索引位置,默认值为i
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    //遍历 i+1~length的值,找到其中最小值的位置
                    minIndex = j;
                }
            }
            //交换当前索引i和最小值索引minIndex两处的值
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
