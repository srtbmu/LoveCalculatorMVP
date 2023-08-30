package com.example

import android.app.Activity
import android.content.Intent
import android.os.Bundle

fun <T : java.io.Serializable> Activity.changeScreen(toActivity: Activity, model: T) {
    val intent = Intent(this, toActivity::class.java)
    val bundle = Bundle()
    bundle.putSerializable("key", model)
    intent.putExtras(bundle)
    startActivity(intent)
}