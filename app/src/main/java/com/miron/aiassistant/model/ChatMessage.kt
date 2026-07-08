package com.miron.aiassistant.model

data class ChatMessage(
    val id: Long = 0,
    val text: String = "",
    val isUser: Boolean = false,
    val timestamp: Long = System.currentTimeMillis()
)
