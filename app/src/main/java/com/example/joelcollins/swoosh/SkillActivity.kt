package com.example.joelcollins.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
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
}
