package com.example.joelcollins.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.joelcollins.swoosh.R
import com.example.joelcollins.swoosh.Util.EXTRA_LEAGUE
import com.example.joelcollins.swoosh.Util.EXTRA_SKILL
import com.example.joelcollins.swoosh.Util.League
import com.example.joelcollins.swoosh.Util.SkillLevel
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val league = intent.extras[EXTRA_LEAGUE] as League
        val skillLevel = intent.extras[EXTRA_SKILL] as SkillLevel

        val leagueString = when(league) {
            League.Mens -> "men's"
            League.Womens -> "women's"
            League.Coed -> "co-ed"
            else -> "ERROR!"
        }

        val skillLevelString = when (skillLevel) {
            SkillLevel.Beginner -> "beginner"
            SkillLevel.Baller -> "baller"
            else -> "ERROR!"
        }

        txtLookingFor.text = String.format(getString(R.string.looking_for_a_x_near_you), leagueString, skillLevelString)
    }
}
