package com.example.calcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*
import org.jetbrains.anko.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)



        Btn_sms.setOnClickListener {
            sendSMS("0700892787", "Hello Bram")
        }
        Btn_stk.setOnClickListener {
            val simToolKitLaunchIntent =
                this@IntentActivity.getPackageManager().getLaunchIntentForPackage("com.android.stk");
            if (simToolKitLaunchIntent != null) {
                startActivity(simToolKitLaunchIntent)
            }
        }
        Btn_share.setOnClickListener {
            share("Hello Kindly visit my social media account")
        }
        Btn_call.setOnClickListener {
            makeCall("0700892787")
        }
        Btn_browse.setOnClickListener {
            browse("www.youtube.com")
        }
        Btn_Email.setOnClickListener {
            email("Welcome to my app","Kindly subscribe","To my channel",)
        }

    }

}




