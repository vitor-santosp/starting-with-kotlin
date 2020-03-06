package br.senac.vitor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calcular.*

class CalcularActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular)
        btnSoma.setOnClickListener{
            somar(etVal1.text.toString(), etVal2.text.toString(),this)
        }
    }
}
