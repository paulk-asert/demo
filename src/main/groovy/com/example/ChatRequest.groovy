package com.example

import io.micronaut.serde.annotation.Serdeable

@Serdeable
class ChatRequest {
    String model = 'gpt-3.5-turbo'
    List<Message> messages
    double temperature = 0.7

    ChatRequest(String message = '') {
        this.messages = [new Message(Role.USER, message)]
    }
}
