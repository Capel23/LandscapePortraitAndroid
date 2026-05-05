package com.example.landscape_portrait

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity que demuestra el uso de layouts diferentes para orientaciones Portrait y Landscape.
 *
 * - Portrait (Vertical): layout/activity_main.xml - Diseño vertical con scroll
 * - Landscape (Horizontal): layout-land/activity_main.xml - Diseño horizontal optimizado
 *
 * Los IDs de los componentes son idénticos en ambos layouts, por lo que el código
 * funciona sin modificaciones independientemente de la orientación.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Android automáticamente selecciona el layout correcto según la orientación:
        // - Vertical: res/layout/activity_main.xml
        // - Horizontal: res/layout-land/activity_main.xml
        setContentView(R.layout.activity_main)

        // Configurar el botón de comprar
        // El ID 'buyButton' existe en AMBOS layouts (portrait y landscape)
        val buyButton = findViewById<Button>(R.id.buyButton)
        buyButton.setOnClickListener {
            // Mostrar un mensaje cuando se presiona el botón
            Toast.makeText(
                this,
                R.string.toast_buy_message,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}