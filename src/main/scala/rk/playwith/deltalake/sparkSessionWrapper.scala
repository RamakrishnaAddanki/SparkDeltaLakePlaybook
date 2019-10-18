package rk.playwith.deltalake

import org.apache.spark.sql.SparkSession

trait SparkSessionWrapper extends Serializable {

  lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .master("local")
      .appName("spark session Delta Playbook")
      .config("spark.databricks.delta.retentionDurationCheck.enabled", "false")
      .getOrCreate()
  }

}
