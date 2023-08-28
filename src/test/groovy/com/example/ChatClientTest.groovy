package com.example

import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import jakarta.inject.Inject
import org.junit.jupiter.api.Test

@MicronautTest
class ChatClientTest {
    @Inject @Client ChatClient client

    @Test
    void "list models"() {
        println client.listModels()
    }

    @Test
    void "suggest a name"() {
        String prompt = """
            Suggest a name for a presentation about
            AI tools for Java developers.
        """
        var request = new ChatRequest(messages: [new Message(Role.USER, prompt)])
        var response = client.ask(request)
        println response.choices[0].message.content
    }

}
