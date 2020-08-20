package com.example.fakebookstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.login_screen_activity.*

class LoginScreenActivity : AppCompatActivity() {

    override fun onBackPressed() { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen_activity)



        loginBtn.setOnClickListener {

            if(userNameTxt.text.toString() == "" || passwordTxt.text.toString() == "") {
                Toast.makeText(this, "Username and Password Required", Toast.LENGTH_SHORT).show()

            }
            else {
                if (userNameTxt.text.toString() == "mrfinch" && passwordTxt.text.toString() == "abc") {
                    val intent = Intent(this, HomeScreenMrFinchActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}