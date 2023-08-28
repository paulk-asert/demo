package com.example

import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client('https://api.openai.com/v1/')
@Headers(
        @Header(name = "Authorization", value = "Bearer sk-XXXXX")
)
interface ChatClient {
    @Get('/models')
    ModelList listModels()

    @Post('/chat/completions')
    ChatResponse ask(@Body ChatRequest request)
}
