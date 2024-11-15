package com.example.accountingexpensesincomebeautysalon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddExpenseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_expense)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageButtonBack = findViewById<ImageButton>(R.id.imageButton_Back)
        imageButtonBack.setOnClickListener(){
            val intent = Intent(this@AddExpenseActivity, AccountingActivity::class.java)
            startActivity(intent)
        }

        val buttonAmountCash = findViewById<Button>(R.id.amount_cash)
        buttonAmountCash.setOnClickListener {
            val intent = Intent(this@AddExpenseActivity, AmountCardActivity::class.java)
            startActivity(intent)
        }

        val buttonAmountCard = findViewById<Button>(R.id.amount_card)
        buttonAmountCard.setOnClickListener {
            val intent = Intent(this@AddExpenseActivity, AmountCashActivity::class.java)
            startActivity(intent)
        }

        val buttonSumFacts = findViewById<Button>(R.id.sum_facts)
        buttonSumFacts.setOnClickListener {
            val intent = Intent(this@AddExpenseActivity, SumFactsActivity::class.java)
            startActivity(intent)
        }
    }
}