package com.miron.aiassistant.ui

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.miron.aiassistant.model.ChatMessage

/**
 * Minimal RecyclerView.Adapter implementation used as a placeholder.
 * Renders each message as a simple TextView. Replace with full layout + view binding later.
 */
class ChatAdapter(private val context: Context) : RecyclerView.Adapter<ChatAdapter.VH>() {
    private val items = mutableListOf<ChatMessage>()

    fun setItems(newItems: List<ChatMessage>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val tv = TextView(context).apply {
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            setPadding(16, 12, 16, 12)
        }
        return VH(tv)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val msg = items[position]
        holder.bind(msg)
    }

    override fun getItemCount(): Int = items.size

    class VH(view: View) : RecyclerView.ViewHolder(view) {
        private val tv: TextView = view as TextView
        fun bind(msg: ChatMessage) {
            tv.text = msg.text
        }
    }
}
