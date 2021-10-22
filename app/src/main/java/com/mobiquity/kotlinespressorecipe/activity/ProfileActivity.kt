package com.mobiquity.kotlinespressorecipe.activity

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mobiquity.kotlinespressorecipe.R
import com.mobiquity.kotlinespressorecipe.data.repositories.CURRENT_USER
import com.mobiquity.kotlinespressorecipe.view.CircleImageView

class ProfileActivity : AppCompatActivity(){
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_profile)
         val avatar = findViewById<CircleImageView>(R.id.avatar)
         avatar.setImageDrawable(getDrawable(CURRENT_USER.avatar))
         val name = findViewById<EditText>(R.id.et_username)
         name.hint = CURRENT_USER.name
     }
}