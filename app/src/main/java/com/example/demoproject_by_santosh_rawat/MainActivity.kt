package com.example.demoproject_by_santosh_rawat


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
            Toast.makeText(this, "Kindly click on this button to move on next page.", Toast.LENGTH_LONG).show()
            val intent = Intent(this, WelcomePage::class.java)
            // start your next activity
            startActivity(intent)
        }

        findViewById<TextView>(R.id.disp_name).setOnClickListener {
            updateNickname(it)
        }
    }
    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.user_name)
        val nicknameTextView = findViewById<TextView>(R.id.disp_name)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
    private fun updateNickname(view: View) {
        val editText = findViewById<EditText>(R.id.user_name)
        val doneButton = findViewById<Button>(R.id.done_button)

        editText.visibility = View.VISIBLE
        doneButton.visibility = View.VISIBLE
        view.visibility = View.GONE

        // Set the focus to the edit text.
        editText.requestFocus()

        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, 0)
    }

}
