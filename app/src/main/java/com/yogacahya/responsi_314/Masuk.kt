package com.yogacahya.responsi_314

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.masuk.*

class Masuk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masuk)

        btn_masuk.setOnClickListener {
            val username = edt_username.text.toString()
            val password = edt_password.text.toString()
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Username and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (username == "lesmana" || password == "314") {
                val intent = Intent(this, Lihat::class.java)
                startActivity(intent)
            }
        }

        btn_registrasi.setOnClickListener ( {
            val intent = Intent(this, Daftar::class.java)
            startActivity(intent)
        })
    }
}
