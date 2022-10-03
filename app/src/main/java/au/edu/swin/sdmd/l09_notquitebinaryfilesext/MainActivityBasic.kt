package au.edu.swin.sdmd.l09_notquitebinaryfilesext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.ui.converter.ConverterActivity
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.ui.history.HistoryActivity
import au.edu.swin.sdmd.l09_notquitebinaryfilesext.ui.process.ProcessActivity

class MainActivityBasic : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main_basic)

    val btnProcess = findViewById<Button>(R.id.btnProcess)
    val btnConverter = findViewById<Button>(R.id.btnConverter)
    val btnHistory = findViewById<Button>(R.id.btnHistory)

    btnProcess.setOnClickListener {
      val intent = Intent(this, ProcessActivity::class.java)
      startActivity(intent)
    }

    btnConverter.setOnClickListener {
      val intent = Intent(this, ConverterActivity::class.java)
      startActivity(intent)
    }

    btnHistory.setOnClickListener {
      val intent = Intent(this, HistoryActivity::class.java)
      startActivity(intent)
    }
  }
}