package com.example.hww3_6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hww3_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(viewBinding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view_tag, MainFragment()).commit();
    }
}