package lat.pam.mesenmakanan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AlamatPengirimanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alamat_pengiriman)

        val buttonOrderSekarang: Button = findViewById(R.id.button_order_sekarang)
        buttonOrderSekarang.setOnClickListener {
            val intent = Intent(this, SelesaiActivity::class.java)
            startActivity(intent)
        }
    }
}