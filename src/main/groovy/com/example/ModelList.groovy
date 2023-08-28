package com.example

import groovy.transform.ToString
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@ToString
class ModelList {
    String object
    List<Model> data
}
