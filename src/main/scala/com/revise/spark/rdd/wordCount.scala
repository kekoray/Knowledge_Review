package com.revise.spark.rdd

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 *
 * @ProjectName: spring_boot_demo  
 * @program: com.revise.spark.rdd   
 * @FileName: wordCount 
 * @description: wordCount
 * @version: 1.0   
 *           *
 * @author: koray   
 * @create: 2020-09-10 10:06  
 * @Copyright (c) 2020,All Rights Reserved.
 */
object wordCount {

  def main(args: Array[String]): Unit = {
    //创建sparkConf
    val sparkConf = new SparkConf().setAppName("wordCount").setMaster("local[*]")

    //创建Spark Context
    val sc = new SparkContext(sparkConf)

    //设置日志级别
    sc.setLogLevel("WARN")


    /**
     * 创建RDD的二种方式
     */
    //1.本地集合直接创建
    val makeRDD_Seq: RDD[Int] = sc.makeRDD(Seq(1, 2, 3))
    val parallelize_Seq: RDD[String] = sc.parallelize(Seq("Hadoop", "spark", "flink", "spark"))

    //2.读取外部数据集创建
    val hdfs_file = sc.textFile("hdfs://node-1:8020/...")
    val local_file = sc.textFile("file:///./data/access.log.20181101_20190813_171702.dat")



    /**
     * wordCount
     */
    val result = parallelize_Seq
      .flatMap(_.split(",")).map((_, 1)).reduceByKey((x, y) => x + y)
    result.foreach(println(_))














    //释放资源
    sc.stop()

  }

}
