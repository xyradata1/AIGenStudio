package com.example.chatgptclient.data.repository

import com.example.chatgptclient.data.api.OpenAIApi
import com.example.chatgptclient.data.model.ChatRequest
import com.example.chatgptclient.data.model.ChatMessage
import com.example.chatgptclient.data.model.ChatResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ChatRepository() {
    private val api: OpenAIApi = Retrofit.Builder()
        .baseUrl("https://api.replit.com/ai/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(OpenAIApi::class.java)

    suspend fun sendMessage(messages: List<ChatMessage>): ChatResponse {
        return api.getChatCompletion("Bearer Bearer", ChatRequest(messages = messages))
    }
}