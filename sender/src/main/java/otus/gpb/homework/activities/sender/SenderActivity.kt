package otus.gpb.homework.activities.sender

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.io.Serializable



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

        buttonGoogleMaps.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse(
                    ("geo:0,0?q=restaurants")

                )
            )
            startActivity(intent)
        }

        buttonSendMail.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("mailto:android@otus.ru")
            intent.type = "text/plan"

            startActivity(intent)
        }


        buttonOpenReceiver.setOnClickListener {


            val intent = Intent(this, SenderActivity::class.java).apply {

                putExtra("title", "string")
                putExtra("year", "string")
                putExtra("description", "string")
            }

            startActivity(intent)

        }

    }
}
