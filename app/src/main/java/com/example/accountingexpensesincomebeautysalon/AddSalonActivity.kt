package com.example.accountingexpensesincomebeautysalon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddSalonActivity : AppCompatActivity() {
    private fun AlertDialogs(title:String, text: String) {
        val inputEditText = EditText(this@AddSalonActivity)
        AlertDialog.Builder(this@AddSalonActivity)
            .setTitle(title)
            .setMessage(text)
            .setView(inputEditText)
            .setPositiveButton("Добваить") { dialog, _ ->
                val inputText = inputEditText.text.toString()
                Toast.makeText(this@AddSalonActivity, "Введенный текст: $inputText", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNegativeButton("Отмена") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_salon)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageButtonBack = findViewById<ImageButton>(R.id.imageButton_Back)
        imageButtonBack.setOnClickListener(){
            val intent = Intent(this@AddSalonActivity, MainActivity::class.java)
            startActivity(intent)
        }

        val buttonCreateSalon = findViewById<Button>(R.id.create_salon)
        buttonCreateSalon.setOnClickListener(){
            AlertDialogs("Название салона", "Добавление нового салона")
        }

        val buttonEditSalon = findViewById<Button>(R.id.edit_salon)
        buttonEditSalon.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonEditDataDalon = findViewById<Button>(R.id.edit_data_salon)
        buttonEditDataDalon.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonGiveAccess = findViewById<Button>(R.id.give_access)
        buttonGiveAccess.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonEditAccess = findViewById<Button>(R.id.edit_access)
        buttonEditAccess.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonCheckFixesSalon = findViewById<Button>(R.id.check_fixes_salon)
        buttonCheckFixesSalon.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonAmountSalonDate = findViewById<Button>(R.id.amount_salon_date)
        buttonAmountSalonDate.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonDetailedReport = findViewById<Button>(R.id.detailed_report)
        buttonDetailedReport.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }

        val buttonTrustedDevices = findViewById<Button>(R.id.trusted_devices)
        buttonTrustedDevices.setOnClickListener(){
            AlertDialogs("Какой-то текст", "Какой-то текст")
        }
    }
}