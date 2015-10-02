package com.qburst.GitHubAnalytics.EventToppers

import com.google.gson.Gson
import com.qburst.GitHubAnalytics.models.Event
import org.apache.spark.SparkContext

object ETJob {
  def main(args: Array[String]): Unit = {
    val sparkContext = new SparkContext("local", "EventTopperJOb")
    val counts = sparkContext.textFile(args(0))
      .map(line => new Gson().fromJson(line, classOf[Event]))
      .filter(x => x.`type` == args(1))
      .map(pull => (pull.repo.name, 1))
      .reduceByKey(_+_)
    counts.saveAsTextFile(args(2))
  }
}
