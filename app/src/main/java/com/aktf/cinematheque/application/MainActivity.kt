package com.aktf.cinematheque.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aktf.cinematheque.R
import com.aktf.cinematheque.application.view.UpcomingListActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startActivity(Intent(this, UpcomingListActivity::class.java))
        finish()
    }
}
