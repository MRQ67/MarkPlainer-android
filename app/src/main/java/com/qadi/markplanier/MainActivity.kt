package com.qadi.markplanier

import android.os.Bundle
import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//import com.qadi.markplanier.ui.theme.MarkPlanierAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val markdownInput = findViewById<EditText>(R.id.markdown_input)
        val convertButton = findViewById<Button>(R.id.convert_button)
        val plainTextOutput = findViewById<TextView>(R.id.plain_text_output)

        convertButton.setOnClickListener {
            val markdown = markdownInput.text.toString()
            val plainText = MarkdownConverter.convertMarkdownToText(markdown)
            plainTextOutput.text = plainText
        }
    }
}