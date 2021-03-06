package org.example.learn.kafka;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaUtil {

    public static final String broker_list = "localhost:9092";
    public static final String topic = "student";  //kafka topic 需要和 flink 程序用同一个 topic

    public static void writeToKafka() throws InterruptedException {

        Properties props = new Properties();
        props.put("bootstrap.servers", broker_list);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer producer = new KafkaProducer<String, String>(props);

//        for (int i = 1; i <= 100; i++) {
//            Student student = new Student(i, "kylin" + i, "password" + i, 18 + i);
//            ProducerRecord record = new ProducerRecord<String, String>(topic, null, null, JSON.toJSONString(student));
//            producer.send(record);  // 往kafka写数据
//            System.out.println("发送数据: " + JSON.toJSONString(student));
//        }
        producer.flush();

    }

    public static void main(String[] args) throws InterruptedException {
        writeToKafka();
    }

}
