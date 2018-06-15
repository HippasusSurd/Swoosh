package com.example.joelcollins.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.joelcollins.swoosh.Util.EXTRA_LEAGUE
import com.example.joelcollins.swoosh.Util.League
import com.example.joelcollins.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*



class LeagueActivity : LoggerActivity() {

    var selectedLeague : League = League.None

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onBtnMensClick (view: View) {
        if (btnMens.isChecked) {
            selectedLeague = League.Mens
            btnWomens.isChecked = false
            btnCoed.isChecked = false
        }
        else selectedLeague = League.None
    }

    fun onBtnWomensClick (view: View) {
        if (btnWomens.isChecked) {
            selectedLeague = League.Womens
            btnMens.isChecked = false
            btnCoed.isChecked = false
        }
        else selectedLeague = League.None

    }

    fun onBtnCoedClick (view: View) {
        if (btnCoed.isChecked) {
            selectedLeague = League.Coed
            btnMens.isChecked = false
            btnWomens.isChecked = false
        }
        else selectedLeague = League.None

    }

    fun onBtnNextClick(view: View) {

        if (selectedLeague == League.None) {
            Toast.makeText(this, getString(R.string.please_select_league), Toast.LENGTH_SHORT).show()
            return
        }

        val gotoSkillActivity = Intent(this, SkillActivity::class.java)
        gotoSkillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        startActivity(gotoSkillActivity)

    }
}
