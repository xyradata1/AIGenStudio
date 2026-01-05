package com.example.chatgptclient.data.model

data class ChatRequest(
    val model: String = "gpt-5",
    val messages: List<ChatMessage>
)

data class ChatMessage(
    val role: String,
    val content: String
)

data class ChatResponse(
    val choices: List<Choice>
)

data class Choice(
    val message: ChatMessage
)