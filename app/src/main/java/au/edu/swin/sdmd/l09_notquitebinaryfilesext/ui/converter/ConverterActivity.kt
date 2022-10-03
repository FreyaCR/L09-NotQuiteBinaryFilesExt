package au.edu.swin.sdmd.l09_notquitebinaryfilesext.ui.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.R
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.data.HistoryFile
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.data.SharedPrefFile

class ConverterActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_converter)

    val bConvert: Button = findViewById(R.id.bConvert_basic)
    bConvert.setOnClickListener {
      val etDecimal: EditText = findViewById(R.id.etDecimal_basic)
      val sDecimal = etDecimal.text.toString()
      if (sDecimal != "") {
        val iDecimal = sDecimal.toInt()
        val sBinary = Integer.toBinaryString(iDecimal)
        val tvResult = findViewById<TextView>(R.id.tvBinary_basic)
        tvResult.text = sBinary

        /**
         * This is where we update our files.
         */
        SharedPrefFile.updateSharedPrefs(this,
          getString(R.string.preference_file_key),
          getString(R.string.last_input),
          sDecimal)

        HistoryFile.appendInput(this, HistoryFile.fileName, "$sDecimal = $sBinary")
      } else {
        val tvBinary: TextView = findViewById(R.id.tvBinary_basic)
        tvBinary.text = "No number entered"
      }
    }
  }
}