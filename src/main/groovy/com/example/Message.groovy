package com.example

import groovy.transform.TupleConstructor
import io.micronaut.serde.annotation.Serdeable

@TupleConstructor
@Serdeable
class Message {
    Role role
    String content
}