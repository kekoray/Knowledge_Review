package basicAlgorithmDemo;


import java.util.Arrays;

/**
 * @ProjectName: spark_revise
 * @program: ml
 * @FileName: BinarySearchDemo
 * @description: 二分查找算法  -->
 * **       针对一个有序数组（假设为升序），要查找某个 item 是否存在，
 * **       并返回 item 的索引 index，则可以使用二分查找法。
 * ** 举例:
 * **       比如存在100个有序元素，简单查找就是遍历这100个元素，找到和 item 相等的元素就返回，
 * **       这样我们最多可能需要查找100次；而二分查找，即我先拿到中间这个元素，
 * **       判断大于还是小于 item，然后根据结果可以缩小一半的查找区间，以此类推最终找到该元素。
 * @version: 1.0
 * *
 * @author: koray
 * @create: 2020-09-13 20:25
 * @Copyright (c) 2020,All Rights Reserved.
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] array = {0,5,1,9,11,55,131,48,10};
        int index = binarySearch(array, 1);
        System.out.println("索引为 " + index +", 且结果是" + array[index]);
    }

    /**
     * 数据集要求须采用顺序存储结构
     * @param array
     * @param item
     * @return  返回的是索引
     */
    private static int binarySearch(int[] array, int item) {
        //数据集要求须采用顺序存储结构
        //所以对数据集进行字典排序
        Arrays.sort(array);

        //定义初始最小、最大索引
        int low = 0;
        int high = array.length - 1;
        //确保不会出现重复查找，越界
        while (low <= high) {
            //计算出中间索引值
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if (item > midVal ) {
                low = mid + 1;
            } else if ( item < midVal) {
                high = mid - 1;
            } else if (midVal == item){
                return mid;
            }
        }
        return -1;
    }
}
