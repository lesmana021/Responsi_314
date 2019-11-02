package com.yogacahya.responsi_314

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.masuk.*
import kotlinx.android.synthetic.main.daftar.*

class Daftar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar)

        btn_daftar.setOnClickListener{
            val username2 = findViewById<EditText>(R.id.edt_username2)
            val password = findViewById<EditText>(R.id.edt_password2)
            if (edt_username2.text.isEmpty() || edt_password2.text.isEmpty()) {
                Toast.makeText(this, "Username/Password Harus Diisi", Toast.LENGTH_SHORT).show()
            }
            if (edt_password2.text.isNotEmpty() && password.text.isNotEmpty()) {
                val intent = Intent(this, Lihat::class.java)
                startActivity(intent)
            }
        }

        btn_daftar.setOnClickListener {
            val nama = edt_nama.text.toString()
            val username2 = edt_username2.text.toString()
            val password = edt_password2.text.toString()
            val alamat = edt_alamat.text.toString()
            val tanggallahir = edt_tgllahir.text.toString()

            val intent = Intent(this@Daftar, Lihat::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Username", username2)
            intent.putExtra("Password", password)
            intent.putExtra("Alamat", alamat)
            intent.putExtra("Tanggal Lahir", tanggallahir)
            startActivity(intent)

        }
    }
}
