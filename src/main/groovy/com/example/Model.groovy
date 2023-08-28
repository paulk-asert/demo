package com.example

import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.ToString
import io.micronaut.serde.annotation.Serdeable

@Serdeable
@ToString
class Model {
    String id
    long created
    @JsonProperty('owned_by')
    String ownedBy
}
