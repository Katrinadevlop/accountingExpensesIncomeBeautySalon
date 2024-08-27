package com.example.accountingexpensesincomebeautysalon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AccountingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_accounting)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonAddIncome = findViewById<Button>(R.id.add_income)
        buttonAddIncome.setOnClickListener {
            val intent = Intent(this@AccountingActivity, AddIncomeActivity::class.java)
            startActivity(intent)
        }

        val buttonAddExpense = findViewById<Button>(R.id.add_expense)
        buttonAddExpense.setOnClickListener {
            val intent = Intent(this@AccountingActivity, AddExpenseActivity::class.java)
            startActivity(intent)
        }
    }
}