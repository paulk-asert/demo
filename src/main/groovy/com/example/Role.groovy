package com.example

import com.fasterxml.jackson.annotation.JsonValue
import io.micronaut.serde.annotation.Serdeable

@Serdeable
enum Role {
    USER, SYSTEM, ASSISTANT

    @JsonValue
    String toLower() { name().toLowerCase() }
}
