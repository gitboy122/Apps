package com.example.artsy




import android.content.Context
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest

class DataAPI {

    val url = "https://api-dot-angular-hw-8.wl.r.appspot.com/api/artists?name=picasso"




        fun getArtistData(t1:TextView,context:Context) {
            Log.w("XXX","Hello")

            val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener { response ->
                    t1.text = "Response: %s".format(response.toString())
                },
                Response.ErrorListener { error ->
                    t1.text = "Response: %s".format(error.toString())
                    Log.e("XXX:",error.toString())

                }
            )
            VolleySingleton.getInstance(context).addToRequestQueue(jsonObjectRequest)

        }
}

