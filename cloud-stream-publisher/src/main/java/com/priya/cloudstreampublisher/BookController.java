package com.priya.cloudstreampublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private MessageChannel output;

    @PostMapping
    public Book publishEvent(@RequestBody Book book) {
        output.send(MessageBuilder.withPayload(book).build());
        return book;
    }
}
