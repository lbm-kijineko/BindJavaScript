package jp.co.lbm.bindjavascript

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var helper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helper = DatabaseHelper(this)
        try {
            helper.createDatabase()
        }
        catch (e: IOException) {
            throw Error("Unable to create database")
        }
    }
}