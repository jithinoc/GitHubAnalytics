package com.qburst.GitHubAnalytics.Tools

import java.io.{File, FileInputStream, FileOutputStream}
import java.util.zip.GZIPInputStream

object GZipManager {

  def unzip(fileName: String): Unit = {
    val buffer: Array[Byte] = new Array[Byte](1024)

    try {
      val gZIPInputStream: GZIPInputStream = new GZIPInputStream(new FileInputStream(fileName))
      val fileOutputStream: FileOutputStream = new FileOutputStream(fileName.replace(".gz", ""))

      var len = gZIPInputStream.read(buffer)
      while (len > 0) {
        fileOutputStream.write(buffer, 0, len)
        len = gZIPInputStream.read(buffer)
      }

      gZIPInputStream.close()
      fileOutputStream.close()

    } catch {
      case ex: Exception => ex.printStackTrace()
    }
  }


  def unzipAll(dirName: String): Unit = {
    val dir: File = new File(dirName)
    for(file <- dir.listFiles()) {
      unzip(file.getAbsolutePath)
    }
  }

  def main(args: Array[String]) {
    unzipAll(args(0))
  }

}
