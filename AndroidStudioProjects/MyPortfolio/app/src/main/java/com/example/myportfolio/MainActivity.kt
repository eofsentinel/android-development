package com.example.myportfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEducationActivity = findViewById<Button>(R.id.buttonEducation)
        val buttonSkillsActivity = findViewById<Button>(R.id.buttonSkills)
        val buttonAchievementsActivity = findViewById<Button>(R.id.buttonAchv)
        val buttonProjectsActivity = findViewById<Button>(R.id.buttonProj)

        buttonEducationActivity.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        buttonSkillsActivity.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonAchievementsActivity.setOnClickListener {
            intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

        buttonProjectsActivity.setOnClickListener {
            intent = Intent(this, ProjectsActivity::class.java)
            startActivity(intent)
        }

    }
}