package com.example

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@JsonIgnoreProperties('usage')
class ChatResponse {
    String id
    String object
    long created
    String model
    List<ChatResponseChoice> choices
}
