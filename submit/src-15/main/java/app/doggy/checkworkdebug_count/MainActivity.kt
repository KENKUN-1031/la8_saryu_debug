package app.doggy.checkworkdebug_count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.doggy.checkworkdebug_count.databinding.ActivityMainBinding

/**
 * 問題15
 * MainActivity.ktのみを修正して、activity_main.xmlで定義したレイアウトを表示させてください。
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        Log.d("debug", "active=====================")
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }
        Log.d("debug", "second=====================")

        var count: Int = 0

        binding.plusButton.setOnClickListener {
            Log.d("debug", "insideIF=====================")
            count += 1
            binding.countText.text = count.toString()
        }
    }
}
