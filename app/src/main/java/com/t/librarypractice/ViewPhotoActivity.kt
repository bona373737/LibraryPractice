package com.t.librarypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class ViewPhotoActivity : BaseActivity() {
    override fun setupEvents() {
        viewPhotoBtn.setOnClickListener{
            val myIntent = Intent(mContext,ViewPhotoActivity)
        }

    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_photo)
    }
}