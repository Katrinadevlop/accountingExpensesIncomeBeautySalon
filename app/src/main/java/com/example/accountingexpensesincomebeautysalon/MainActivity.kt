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
        val db = DBHelper(this, null) // Инициализируем помощник базы данных один раз

        buttonPassword.setOnClickListener {
            val idSalon = userIdSalon.selectedItem.toString()
            val passwordSalon = userPasswordSalon.text.toString().trim()

          /*  val db = MyDataBase.get(this)

            val allAuthorizations = db.authorizationDAO().getByIdSalon(0)

            val newAuthorization = SalonEntity(
                id = 0,
                idSalon = "123",
                passwordSalon = "password"
            )
            db.authorizationDAO().insert(newAuthorization)
*/

            if (passwordSalon.isEmpty()) {
                Toast.makeText(this, "Введите пароль и выберите салон", Toast.LENGTH_LONG).show()
            } else {

               /* val cursor = db.getName()
                val nameTextView = findViewById<TextView>(R.id.Name)
                val ageTextView = findViewById<TextView>(R.id.Age)

                if (cursor != null && cursor.moveToFirst()) {
                    nameTextView.text = cursor.getString(cursor.getColumnIndex(DBHelper.IDSALON_COL))
                    ageTextView.text = cursor.getString(cursor.getColumnIndex(DBHelper.PASSWORDSALON_COL))

                    while (cursor.moveToNext()) {
                        nameTextView.append("\n" + cursor.getString(cursor.getColumnIndex(DBHelper.IDSALON_COL)))
                        ageTextView.append("\n" + cursor.getString(cursor.getColumnIndex(DBHelper.PASSWORDSALON_COL)))
                    }
                    cursor.close()
                }*/

                val intent = Intent(this@MainActivity, AccountingActivity::class.java)
                startActivity(intent)
            }
        }

        val buttonDsAdmin = findViewById<Button>(R.id.ds_admin)
        buttonDsAdmin.setOnClickListener {
            val intent = Intent(this@MainActivity, AddSalonActivity::class.java)
            startActivity(intent)
        }
    }
}