package idv.tfp10101.myapplication0914

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import idv.tfp10101.mysdk0914.TestOne

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestOne.testOne()
    }
}