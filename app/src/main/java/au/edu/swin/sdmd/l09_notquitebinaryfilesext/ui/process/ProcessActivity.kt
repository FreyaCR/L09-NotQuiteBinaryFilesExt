package au.edu.swin.sdmd.l09_notquitebinaryfilesext.ui.process

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.R

class ProcessActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_process)

    val text = findViewById<TextView>(R.id.text_process_basic)

    /* read a raw resource file (res/raw): binary_process.html */
    val process = resources.openRawResource(R.raw.binary_process)
      .bufferedReader().readText()

    /* convert read content to HTML and display on text view*/
    text.text = Html.fromHtml(process, Html.FROM_HTML_MODE_COMPACT)
  }
}