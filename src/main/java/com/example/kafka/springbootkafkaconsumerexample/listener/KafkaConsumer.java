package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "Kafka_Example", group = "group_id")
    public void consume(String message) {

        System.out.println("Consumed message: " + message);



        RestTemplate restTemplate = new RestTemplate();
        Book obj = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Book.class);
    }


   /* @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }*/
}
