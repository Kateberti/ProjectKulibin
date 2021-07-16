package ru.romanova.programm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        when (item.itemId) {
            R.id.action_head -> {
                startActivity(Intent(this, MainActivity::class.java))
                true
            }
            R.id.action_site -> {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://kulibin.club/")))
                true
            }
            R.id.action_kurs -> {
                startActivity(Intent(this, KursActivity::class.java))
                true
            }
            R.id.action_teacher -> {
                startActivity(Intent(this, TeacherActivity::class.java))
                true
            }
            R.id.action_price -> {
                startActivity(Intent(this, PriceActivity::class.java))
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
}