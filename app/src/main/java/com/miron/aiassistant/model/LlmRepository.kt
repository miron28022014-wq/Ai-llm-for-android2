package com.miron.aiassistant.model

/**
 * Minimal placeholder for the LLM repository / inference backend.
 * Implement real inference methods when integrating MediaPipe / model runner.
 */
class LlmRepository {
    fun isModelLoaded(): Boolean = false

    suspend fun generate(prompt: String): String {
        // placeholder: return an echo
        return "(stub) response for: $prompt"
    }
}
