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
}
