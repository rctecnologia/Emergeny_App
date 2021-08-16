package foo.rctecnologia.emergencyapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun callPolice(view: View) {

        var numero = 190
        val telefone = numero.toString()
        val uri: Uri = Uri.parse("tel:$telefone")
        val intent = Intent(Intent.ACTION_CALL, uri)
        startActivity(intent)
    }
    fun callBomb(view: View) {

        var numero = 192
        val telefone = numero.toString()
        val uri: Uri = Uri.parse("tel:$telefone")
        val intent = Intent(Intent.ACTION_CALL, uri)
        startActivity(intent)
    }
    fun sairApp(view: View) {
        finish()
    }
}