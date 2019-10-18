package rk.playwith.deltalake

import org.apache.spark.sql.SaveMode

object SparkDeltaLakeFunc extends SparkSessionWrapper {


  import spark.implicits._

  def createDeltaLake(): Unit = {


    val input_df = spark
      .read
      .option("header", "true")
      .option("charset", "UTF8")
      .csv("./tmp/delta-table/")


    val output_df = spark.
      .repartition(5)
      .write
      .format("delta")
      .mode(SaveMode.Overwrite)
      .save()

  }





}
