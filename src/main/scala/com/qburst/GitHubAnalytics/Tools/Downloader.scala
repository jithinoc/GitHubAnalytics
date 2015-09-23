package com.qburst.GitHubAnalytics.Tools

import scala.language.postfixOps

import java.io.InputStream
import java.io.OutputStream
import java.io.FileOutputStream
import java.io.BufferedOutputStream
import java.net.URL
import java.net.HttpURLConnection


object Downloader {
  def download(downloadURL: String, destination: String) {
		var out: OutputStream = null
		var in: InputStream = null

		try {
			val url = new URL(downloadURL)
			val connection = url.openConnection().asInstanceOf[HttpURLConnection]
			connection.setRequestMethod("GET")
			in = connection.getInputStream
			out = new BufferedOutputStream(new FileOutputStream(destination))
			val byteArray = Stream.continually(in.read).takeWhile(-1 !=).map(_.toByte).toArray

			out.write(byteArray)
		} catch {
			case e: Exception => println(e.printStackTrace())
		} finally {
			out.close()
			in.close()
		}
	}

	// http://data.githubarchive.org/2015-01-{01..30}-{0..23}.json.gz

	def main(args: Array[String]): Unit = {
		val root: String = "http://data.githubarchive.org/"
		val tail: String = ".json.gz"
		val directory: String = args(0)

		for(day <- Range.apply(1, 5)) {
			for(hour <- Range.apply(0,24)) {
				val gzipFileName = "2015-01-" + f"$day%02d-" + hour + tail
				val saveTo = directory + gzipFileName
				println("Downloading " + root + gzipFileName)
				download(root+gzipFileName, saveTo)
			}
		}
	}
}
