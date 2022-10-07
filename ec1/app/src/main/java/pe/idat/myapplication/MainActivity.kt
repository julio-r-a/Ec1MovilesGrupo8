package pe.idat.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.idat.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        calcularResultado()
    }

    private fun calcularResultado() {
        var numero = binding.edtnumero.text.toString().toInt()
        var cubo = 0;
        var cuarta = 0;
        var resultado = ""

        for(i in 1..numero){
            cubo = i*i*i
            cuarta = i*i*i*i
            resultado = resultado +  "\nPara el numero $i el cubo es $cubo y la cuarta es $cuarta"
        }
        binding.tvresultado.text = resultado

    }


}