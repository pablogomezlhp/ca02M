package com.example.ca2mfusion.ui.option
//Pablo 19562 and Bruno 20053 -->
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aman.foodordering.R
import com.aman.foodordering.databinding.ActivityOptionBinding
import com.example.ca2mfusion.ui.main.MainActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_option.*

private lateinit var binding: ActivityOptionBinding

class OptionActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_option)

        val intent = Intent(this, MainActivity::class.java)
        configButtons(intent)
    }

    private fun configButtons(intent: Intent) {
        btnDelivery.setOnClickListener {
            startActivity(intent)
        }

        btnBag.setOnClickListener {
            startActivity(intent)
        }

        btnMenu.setOnClickListener {
            startActivity(intent)
        }
    }
}