package otus.gpb.homework.activities.sender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



lateinit var buttonGoogleMaps : Button
lateinit var buttonSendMail : Button
lateinit var buttonOpenReceiver : Button

class SenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sender)

        buttonGoogleMaps = findViewById(R.id.buttonGoogleMaps)
        buttonSendMail = findViewById(R.id.buttonSenMail)
        buttonOpenReceiver = findViewById(R.id.buttonOpenReceiver)

    }

    override fun onStart() {
        super.onStart()

        buttonOpenReceiver.setOnClickListener {


            val intent = Intent(this, ReceiverActivity::class.java).apply {

                putExtra("title", "string")
                putExtra("year", "string")
                putExtra("description", "string")
            }

            startActivity(intent)

        }


    }
}