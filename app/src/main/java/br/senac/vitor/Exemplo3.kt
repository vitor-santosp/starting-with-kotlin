package br.senac.vitor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exemplo3.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.etNome

class Exemplo3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exemplo3)

        btnMostrar.setOnClickListener{
            var msg = """Nome: ${etNome.text}
            |Telefone: ${etTelefone.text}
            |Email: ${etEmail.text}
            |
            |Preferencias de Contato
            """.trimMargin("|")

            if(cbTelefone.isChecked){
                msg += "\n - Telefone"
            }

            if (cbEmail.isChecked){
                msg+= "\n - Email"
            }

            alert("Dados", msg, this)

        }


    }
}
