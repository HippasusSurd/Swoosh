package com.example.joelcollins.swoosh

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : LoggerActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btnGetStarted.setOnClickListener {
            val gotoLeagueActivity = Intent(this, LeagueActivity::class.java)
            startActivity(gotoLeagueActivity)
        }
    }

}
