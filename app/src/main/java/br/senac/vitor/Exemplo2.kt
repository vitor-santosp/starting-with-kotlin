package br.senac.vitor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exemplo2.*

class Exemplo2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exemplo2)
        btnMensagem.setOnClickListener{
            var genero = ""

            when(rgGen.checkedRadioButtonId){
                (R.id.rbMasc) -> {genero = "Sr"}
                (R.id.rbFem) -> {genero = "Sra"}
            }

            alert("Bem-Vindo","Ola, " + genero + " " + etNome.text, this)

        }

    }
}
