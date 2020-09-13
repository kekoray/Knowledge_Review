package basicAlgorithmDemo;

/**
 * @ProjectName: spark_revise
 * @program: ml
 * @FileName: SequenSearchDemo
 * @description: 顺序查找
 * *  从数组的一端向另一端逐个将元素与给定值进行比较，
 * *  若相等，则查找成功，给出该元素在表中的位置；
 * *  若整个表检测完仍未找到与给定值相等的元素，则查找失败，给出失败信息。
 * @version: 1.0
 * *
 * @author: koray
 * @create: 2020-09-13 21:05
 * @Copyright (c) 2020,All Rights Reserved.
 */
public class SequenSearchDemo {
    public static void main(String[] args) {
        int[] array = {0, 5, 1, 9, 11, 55, 131, 48, 10};
        int index = sequenSearch(array, 10);
        try {
            System.out.println("索引为 " + index +", 且结果是" + array[index]);
        } catch (Exception e) {
            System.out.println("集合中没有该元素");
        }
    }

    private static int sequenSearch(int[] array, int item) {
        for (int i = 0; i < array.length; i++) {
            if (item == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
