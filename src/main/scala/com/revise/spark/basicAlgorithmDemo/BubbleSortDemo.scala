package com.revise.spark.basicAlgorithmDemo

/**
 *
 * @ProjectName: spark_revise  
 * @program: com.revise.spark.ml   
 * @FileName: BubbleSort 
 * @description: 冒泡排序-Scala
 * @version: 1.0   
 *           *
 * @author: koray   
 * @create: 2020-09-13 14:20  
 * @Copyright (c) 2020,All Rights Reserved.
 */
object BubbleSortDemo {

  def main(args: Array[String]): Unit = {
    val array: Array[Int] = Array(6, 2, 1, 3, 4, 5)
    BubbleSort(array)
    array.foreach(println(_))
  }

  def BubbleSort(arr: Array[Int]): Unit = {
    //until不包含末尾
    for (i <- 0 until arr.length - 1) {
      for (j <- 0 until arr.length - i - 1) {
        if (arr(j) > arr(j + 1)) {
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
  }

}
