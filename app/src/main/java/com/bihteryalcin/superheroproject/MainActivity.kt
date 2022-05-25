package com.bihteryalcin.superheroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun CreateSuperHero(view : View){

        val name = NameText.text.toString()
        val age = AgeText.text.toString().toIntOrNull()
        val job = JobText.text.toString()

        if (age == null ){
            ResultText.text = "Enter Int"
        }
        else {
            val SuperHero = Superhero(name,age,job)
            ResultText.text = "Name: ${SuperHero.name}"
        }





    }
}