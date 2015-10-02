package com.qburst.GitHubAnalytics.MostPulledRepo

import com.google.gson.Gson
import com.qburst.GitHubAnalytics.models.Event
import org.apache.spark.SparkContext

object MPRJob {
  def main(args: Array[String]): Unit = {
    val sparkContext = new SparkContext("local", "MPRJob")
    val counts = sparkContext.textFile(args(0))
      .map(line => new Gson().fromJson(line, classOf[Event]))
      .filter(x => x.`type` == "PullRequestEvent")
      .map(pull => (pull.repo.name, 1))
      .reduceByKey(_+_)
    counts.saveAsTextFile(args(1))
  }
}
