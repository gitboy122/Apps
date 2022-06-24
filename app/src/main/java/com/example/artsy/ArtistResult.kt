package com.example.artsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.example.artsy.DataAPI
import com.example.artsy.R

class ArtistResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artist_result)
        val url = "https://api-dot-angular-hw-8.wl.r.appspot.com/api/artists?name=picasso"
//
            val text1:TextView = findViewById(R.id.textView3)
//
//        val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
//            Response.Listener { response ->
//                t1.text = "Response: %s".format(response.toString())
//            },
//            Response.ErrorListener { error ->
//                t1.text = "Response: %s".format(error.toString())
//                Log.e("XXX:",error.toString())
//
//            }
//        )
//
//        VolleySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest)


        val d:DataAPI= DataAPI()
        d.getArtistData(text1,this)
    }
}