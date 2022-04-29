package AboutMePages

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.example.codingtigerapp3.R
import kotlinx.android.synthetic.main.activity_app_introduction2.*

class App_Introduction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_introduction2)

        app_introduction_textview.movementMethod = ScrollingMovementMethod()
    }
}