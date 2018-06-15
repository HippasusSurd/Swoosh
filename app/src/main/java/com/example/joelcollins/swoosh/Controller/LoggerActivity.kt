package com.example.joelcollins.swoosh.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

abstract class LoggerActivity : AppCompatActivity() {

    private val TAG = "activity_log"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "${javaClass.simpleName} Created")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "${javaClass.simpleName} Started")
        super.onStart()
    }

    override fun onStop() {
        Log.d(TAG, "${javaClass.simpleName} Stopped")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "${javaClass.simpleName} Restarted")
        super.onRestart()
    }

    override fun onResume() {
        Log.d(TAG, "${javaClass.simpleName} Resumed")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "${javaClass.simpleName} Paused")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d(TAG, "${javaClass.simpleName} Destroyed")
        super.onDestroy()
    }

}