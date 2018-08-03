package com.java.resource;

import com.java.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KafkaProducerResource {

    @Autowired
    private KafkaTemplate<Object, Object> kafkaTemplate;

    private static final String TOPIC = "test";

    @PostMapping("/sendMessage/{message}")
    public ResponseEntity<String> sendMessage(@PathVariable("message") String message) {
        kafkaTemplate.send(TOPIC, new User(message, 100L, "Bangalore") );
        return new ResponseEntity<>("Message sent successfully", HttpStatus.OK);

    }

}
