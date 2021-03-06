package org.example.learn.spark;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;

public class SparkDemo {
    public static void main(String[] args) {

        String logFile = "README.md"; // Should be some file on your system
        SparkSession sparkSession = SparkSession.builder()
                .appName("Simple Application")
                .getOrCreate();
        Dataset<String> logData = sparkSession.read().textFile(logFile).cache();
        long numAs = logData.filter((FilterFunction<String>) s -> s.contains("a")).count();
        long numBs = logData.filter((FilterFunction<String>) s -> s.contains("b")).count();
        System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);
        sparkSession.stop();

    }
}
