package com.example

import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client

@Client('${chat.baseUrl}')
@Headers(
    @Header(name = 'Authorization', value = '${chat.authorization}')
)
interface ChatClient {
    @Get('/models')
    ModelList listModels()

    @Post('/chat/completions')
    ChatResponse ask(@Body ChatRequest request)
}
