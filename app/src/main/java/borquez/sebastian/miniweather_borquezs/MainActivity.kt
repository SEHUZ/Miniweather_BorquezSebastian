package borquez.sebastian.miniweather_borquezs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val tvCity = findViewById<TextView>(R.id.tvCity)
        val tvTemperature = findViewById<TextView>(R.id.tvTemperature)
        val tvWeather = findViewById<TextView>(R.id.tvWeather)
        val ivWeather = findViewById<ImageView>(R.id.ivWeather)
        val btnDia = findViewById<Button>(R.id.btnCambiar)
        val btnPantalla = findViewById<Button>(R.id.btnPantalla)

        tvGreeting.text = "Buenos dias Sebastian!"
        tvCity.text = "Cd. Obregon, Sonora"
        tvTemperature.text = "35°C"
        tvWeather.text = "Nublado"
        ivWeather.setImageResource(R.drawable.ic_windy)

        btnDia.setOnClickListener {
            val climaAleatorio = (0..5).random()

            when (climaAleatorio) {
                0 -> {
                    tvWeather.text = "Soleado"
                    tvTemperature.text = "40°C"
                    ivWeather.setImageResource(R.drawable.ic_sunny)
                }
                1 -> {
                    tvWeather.text = "Nublado"
                    tvTemperature.text = "28°C"
                    ivWeather.setImageResource(R.drawable.ic_cloudy)
                }
                2 -> {
                    tvWeather.text = "Lluvioso"
                    tvTemperature.text = "22°C"
                    ivWeather.setImageResource(R.drawable.ic_rainy)
                }
                3 -> {
                    tvWeather.text = "Ventoso"
                    tvTemperature.text = "25°C"
                    ivWeather.setImageResource(R.drawable.ic_windy)
                }

                4 -> {
                    tvWeather.text = "Nevado"
                    tvTemperature.text = "14°C"
                    ivWeather.setImageResource(R.drawable.ic_snowy)
                }

                5 -> {
                    tvWeather.text = "Tormentoso"
                    tvTemperature.text = "10°C"
                    ivWeather.setImageResource(R.drawable.ic_stormy)
                }
            }
        }

        btnPantalla.setOnClickListener {
            val intent = Intent(this, ActivityLoca::class.java)
            intent.putExtra("USER_NAME", "Sebastian")
            startActivity(intent)

        }




    }
}