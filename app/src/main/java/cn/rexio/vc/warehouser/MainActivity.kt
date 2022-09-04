package cn.rexio.vc.warehouser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar.let { it?.hide() }
        setContentView(R.layout.activity_main)
    }
}