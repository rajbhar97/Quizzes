package com.example.quizzer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth


class SignUpActivity : AppCompatActivity() {

    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        firebaseAuth = FirebaseAuth.getInstance()
       // var emailAddress = findViewById<EditText>(R.id.etEmailAddress)
    }

     private fun signUpUser() {
      val email = etEmailAddres.text.toString()
     val password = etPassword.text.toString()

}
}