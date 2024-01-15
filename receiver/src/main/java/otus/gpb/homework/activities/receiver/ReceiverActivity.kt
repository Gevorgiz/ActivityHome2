package otus.gpb.homework.activities.receiver

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "ReceiverActivity"

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        val title = intent.extras?.getString("title")
        val year = intent.extras?.getString("year")
        val description = intent.extras?.getString("description")
        //Log.d(TAG, "extra key:$key")
    }
}