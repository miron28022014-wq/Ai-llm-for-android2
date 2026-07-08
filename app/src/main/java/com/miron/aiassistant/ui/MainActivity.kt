package com.miron.aiassistant.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.textfield.TextInputEditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar?>(R.id.toolbar)
        toolbar?.let { setSupportActionBar(it) }

        val layoutStatus = findViewById<LinearLayout?>(R.id.layoutStatus)
        val layoutInput = findViewById<LinearLayout?>(R.id.layoutInput)
        val tvStatus = findViewById<TextView?>(R.id.tvStatus)
        val progressBar = findViewById<ProgressBar?>(R.id.progressBar)
        val etInput = findViewById<TextInputEditText?>(R.id.etInput)
        val btnSend = findViewById<FloatingActionButton?>(R.id.btnSend)
        val btnStop = findViewById<FloatingActionButton?>(R.id.btnStop)
        val rvChat = findViewById<RecyclerView?>(R.id.rvChat)

        layoutStatus?.visibility = View.VISIBLE
        layoutInput?.visibility = View.GONE
        progressBar?.visibility = View.GONE

        btnSend?.setOnClickListener {
            tvStatus?.text = "Нажата отправка (тест)"
        }
    }
}
