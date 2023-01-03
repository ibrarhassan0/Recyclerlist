package com.example.test

import android.app.Activity
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*




@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.misetting -> Toast.makeText(this, "setting option is clicked", Toast.LENGTH_SHORT)
                .show()
            R.id.mifeedback -> Toast.makeText(
                this,
                "mifeedback option is clicked",
                Toast.LENGTH_SHORT
            ).show()
            R.id.closeapp -> finish()
            R.id.settingbtn -> Toast.makeText(
                this,
                "settinbtn option is clicked",
                Toast.LENGTH_SHORT
            ).show()
            R.id.fav -> Toast.makeText(this, "fav option is clicked", Toast.LENGTH_SHORT).show()

        }
        return true

    }
}

/* btnchos.setOnClickListener {
       intent=Intent(Intent.ACTION_VIEW)
        intent.setData(Uri.parse("https://www.google.com/"))
        startActivity(intent)
    }

    */
/*
  btnchos.setOnClickListener{
      intent=Intent(Intent.ACTION_GET_CONTENT)
          .also {
              it.type="image/*"
             startActivityForResult(intent,0)
          }
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
      super.onActivityResult(requestCode, resultCode, data)
      if (resultCode==Activity.RESULT_OK && requestCode==0 )
      {
          val uri=data?.data
          imgview.setImageURI(uri)
      }


 */