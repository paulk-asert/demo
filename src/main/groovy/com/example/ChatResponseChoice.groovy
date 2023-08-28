package com.example

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.serde.annotation.Serdeable

@Serdeable
class ChatResponseChoice {
    Message message
    int index
    @JsonProperty('finish_reason')
    String finishReason
}