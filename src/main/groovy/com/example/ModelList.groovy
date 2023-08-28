package com.example

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import groovy.transform.ToString
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@ToString
@JsonIgnoreProperties('object')
class ModelList {
    List<Model> data
}
