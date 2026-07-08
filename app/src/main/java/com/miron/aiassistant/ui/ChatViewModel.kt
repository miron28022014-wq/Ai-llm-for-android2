package com.miron.aiassistant.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.miron.aiassistant.model.ChatMessage

/**
 * Minimal ViewModel placeholder to hold chat messages.
 */
class ChatViewModel : ViewModel() {
    private val _messages = MutableLiveData<List<ChatMessage>>(emptyList())
    val messages: LiveData<List<ChatMessage>> = _messages

    fun addMessage(msg: ChatMessage) {
        val current = _messages.value ?: emptyList()
        _messages.value = current + msg
    }

    fun clear() {
        _messages.value = emptyList()
    }
}
