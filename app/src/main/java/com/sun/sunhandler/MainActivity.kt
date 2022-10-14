package com.sun.sunhandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class MainActivity : AppCompatActivity() {


    private val sunHandler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sunHandler.postDelayed(Runnable {
            testSunHandler()
        }, 2000)
    }

    private fun testSunHandler() {
        log("start test sun handler")

        sunHandler.postDelayed({
            log("start test aync message")
        }, 3000)

        sunHandler.post {
            log("start message1")
            Thread.sleep(2000)
        }
        sunHandler.post {
            log("start message2")
            Thread.sleep(2000)
        }
        sunHandler.post {
            log("start message3")
            Thread.sleep(2000)
        }
        sunHandler.post {
            log("start message4")
            Thread.sleep(2000)
        }
        sunHandler.post {
            log("start message5")
            Thread.sleep(2000)
        }
    }
}

fun log(str: String) {
    Log.i("SunHandlerLog", str)
}