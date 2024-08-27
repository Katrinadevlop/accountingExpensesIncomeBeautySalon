package com.example.accountingexpensesincomebeautysalon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddIncomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_income)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageButtonBack = findViewById<ImageButton>(R.id.imageButton_Back)
        imageButtonBack.setOnClickListener(){
            val intent = Intent(this@AddIncomeActivity, AccountingActivity::class.java)
            startActivity(intent)
        }

        val buttonAmountCash = findViewById<Button>(R.id.amount_cash)
        buttonAmountCash.setOnClickListener {
            val intent = Intent(this@AddIncomeActivity, AmountCardActivity::class.java)
            startActivity(intent)
        }

        val buttonAmountCard = findViewById<Button>(R.id.amount_card)
        buttonAmountCard.setOnClickListener {
            val intent = Intent(this@AddIncomeActivity, AmountCashActivity::class.java)
            startActivity(intent)
        }

        val buttonSumFacts = findViewById<Button>(R.id.sum_facts)
        buttonSumFacts.setOnClickListener {
            val intent = Intent(this@AddIncomeActivity, SumFactsActivity::class.java)
            startActivity(intent)
        }
    }
}