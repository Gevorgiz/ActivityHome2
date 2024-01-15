package otus.gpb.homework.activities.receiver

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "ReceiverActivity"

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        val key = intent.extras?.getString("KEY")
        Log.d(TAG, "extra key:$key")
    }
}