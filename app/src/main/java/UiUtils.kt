package br.senac.vitor

import androidx.appcompat.app.AlertDialog
import android.content.Context

 fun alert(title: String, msg: String, context: Context){
    val builder = AlertDialog.Builder(context)
    builder
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("OK",null)
        .create()
        .show()
}

fun somar (val1: String, val2: String, context: Context){
    val valor1 = val1.toString().toDouble()
    val valor2 = val2.toString().toDouble()
    val total = valor1 + valor2
    alert("Bem-Vindo", "Resultado: $total", context)
}