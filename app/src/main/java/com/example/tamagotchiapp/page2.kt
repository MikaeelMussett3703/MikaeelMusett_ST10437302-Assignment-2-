package com.example.tamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2: AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        // setting of buttons and textview
        val feedBTN = findViewById<Button>(R.id.feedBTN)
        val cleanBTN = findViewById<Button>(R.id.cleanBTN)
        val playBTN = findViewById<Button>(R.id.playBTN)
        val hungerTXT = findViewById<Button>(R.id.hungerTXT)
        val cleanTXT = findViewById<Button>(R.id.cleanTXT)
        val happytxt = findViewById<Button>(R.id.happytxt)
        val petImage = findViewById<ImageView>(R.id.introimage)

        // Set the initial text views
        hungerTXT.text = petHunger.toString()
        happytxt.text = petHealth.toString()
        cleanTXT.text = petCleanliness.toString()

        feedBTN.setOnClickListener {
            // Perform feeding action
            petHunger += 10
            petHealth += 5
            petCleanliness -= 5

            // Update text views
            hungerTXT.text = petHunger.toString()
            happytxt.text = petHealth.toString()
            cleanTXT.text = petCleanliness.toString()

            // Change pet image
            petImage.setImageResource(R.drawable.puppyeating)
        }

        cleanBTN.setOnClickListener {
            // Perform cleaning action
            petCleanliness += 10
            petHealth += 5

            // Update text views
            cleanTXT.text = petCleanliness.toString()
            happytxt.text = petHealth.toString()

            // Change pet image
            petImage.setImageResource(R.drawable.img)
        }

        playBTN.setOnClickListener {
            // Perform playing action
            petCleanliness -= 5
            petHunger += 5
            petHealth += 10

            // Update text views
            cleanTXT.text = petCleanliness.toString()
            hungerTXT.text = petHunger.toString()
            happytxt.text = petHealth.toString()

            // Change pet image
            petImage.setImageResource(R.drawable.img_1)
        }
    }
}
