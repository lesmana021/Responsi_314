package com.yogacahya.responsi_314

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.lihat.*
import kotlinx.android.synthetic.main.daftar.*
import kotlinx.android.synthetic.main.daftar.view.*

class Lihat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lihat)


        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val username2 = intent.getStringExtra("Username")
        var password = intent.getStringExtra("Password")
        val alamat = intent.getStringExtra("Alamat")
        val tanggallahir = intent.getStringExtra("Tanggal Lahir")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "Nama : "+nama+"\nUsername: "+username2+"\nPassword: "+password+"\nAlamat : "+alamat+"\nTanggal Lahir :"+tanggallahir

        pindahlogin.setOnClickListener {
            val intent = Intent (this, Masuk::class.java)
            startActivity(intent)
        }
    }
}
