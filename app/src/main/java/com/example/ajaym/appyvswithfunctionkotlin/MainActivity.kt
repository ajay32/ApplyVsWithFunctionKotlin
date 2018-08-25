package com.example.ajaym.appyvswithfunctionkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ajaym.appyvswithfunctionkotlin.model.DesktopDev
import com.example.ajaym.appyvswithfunctionkotlin.model.Developers
import com.example.ajaym.appyvswithfunctionkotlin.model.PhoneDev

class MainActivity : AppCompatActivity() {


 //   Usually you use apply when you need to do something with an object and return it.
    // And when you need to perform some operations on an object and return some other object
    // you can use with.



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var desktopD = DesktopDev()
        desktopD.name = "dhruv Desktop"
        desktopD.age = 32


        //===================



        var phoneD = PhoneDev()
        phoneD.name = "ajay Phone"
        phoneD.age = 25

        Toast.makeText(this, "${getDeveloper(desktopD)}  ${getDeveloper(phoneD)}  ${getDeveloper()}",Toast.LENGTH_LONG).show()



    }


    //============================== with ========================


    fun getDeveloper(deskDeveloper: DesktopDev): Developers {   // having other object parameter
        return with(deskDeveloper) {
            Developers(deskDeveloper.name, deskDeveloper.age)
        }
    }



    fun getDeveloper(phoneDev: PhoneDev): Developers {
        return with(phoneDev) {
            Developers(phoneDev.name, phoneDev.age)
        }
    }


    //=====================================  apply ==============


    fun getDeveloper(): Developers {  // not having any parameter
        return Developers().apply {
            name = "Hero Hero"   //you coud put dynamically value here for the object coming from api n all
            age = 10
        }
    }



}
