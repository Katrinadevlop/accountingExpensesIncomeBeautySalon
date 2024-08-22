package com.example.accountingexpensesincomebeautysalon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val userIdSalon = findViewById<Spinner>(R.id.ds_admin_list)
        val userPasswordSalon = findViewById<EditText>(R.id.editText_password)
        val buttonPassword = findViewById<Button>(R.id.password)

        buttonPassword.setOnClickListener(){
            val idSalon = userIdSalon.selectedItem
            val passwordSalon = userPasswordSalon.text.toString().trim()

            if (idSalon == null || passwordSalon == "")
                Toast.makeText(this, "Введите пароль и выберите салон", Toast.LENGTH_LONG).show()
            else {
                val intent = Intent(this@MainActivity, AccountingActivity::class.java)
                startActivity(intent)
            }
        }
    }
}