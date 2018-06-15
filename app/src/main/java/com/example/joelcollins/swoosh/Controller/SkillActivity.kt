package com.example.joelcollins.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.joelcollins.swoosh.Util.EXTRA_LEAGUE
import com.example.joelcollins.swoosh.Util.League
import com.example.joelcollins.swoosh.R
import com.example.joelcollins.swoosh.Util.EXTRA_SKILL
import com.example.joelcollins.swoosh.Util.SkillLevel
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var selectedLeague: League = League.None
    var selectedSkill: SkillLevel = SkillLevel.None

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        selectedLeague = intent.getSerializableExtra(EXTRA_LEAGUE) as League

        btnBeginner.setOnClickListener {
            if (btnBeginner.isChecked) {
                btnBaller.isChecked = false
                selectedSkill = SkillLevel.Beginner
            } else {
                selectedSkill = SkillLevel.None
            }
        }

        btnBaller.setOnClickListener {
            if (btnBaller.isChecked) {
                btnBeginner.isChecked = false
                selectedSkill = SkillLevel.Baller
            } else {
                selectedSkill = SkillLevel.None
            }
        }
    }

    fun onBtnFinishClicked(view: View) {
        if (selectedSkill == SkillLevel.None) {
            Toast.makeText(this, "Please select your skill level", Toast.LENGTH_SHORT).show()
            return
        }

        val gotoFinalActivity = Intent(this, FinalActivity::class.java)
        gotoFinalActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        gotoFinalActivity.putExtra(EXTRA_SKILL, selectedSkill)
        startActivity(gotoFinalActivity)
    }
}
