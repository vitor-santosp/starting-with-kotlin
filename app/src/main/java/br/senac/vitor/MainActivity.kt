package br.senac.vitor

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNome.setText("Welcome")
        btnMsg.setOnClickListener{
            //etNome.setText("study a lot guy")
            //this.mostraMensagem("Quale rapazeadaaaa!")
            alert("Welcome","Welcome " + etNome.text + " " + etSobrenome.text, this)
        }
    }

    private fun mostraMensagem(message : String) {
        val dialogBuilder = AlertDialog.Builder(this)

        dialogBuilder.setMessage(message).setCancelable(false).setPositiveButton(
            "Proceed",
            DialogInterface.OnClickListener { dialog, id -> finish() })
            .setNegativeButton("cancel", DialogInterface.OnClickListener{dialog, id -> dialog.cancel()})
        val alert = dialogBuilder.create()
        alert.setTitle("AlertDialogExample")
        alert.show()
    }


}
