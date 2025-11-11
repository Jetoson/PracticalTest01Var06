package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var06MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var06_main)
        val mEditText1 = findViewById<TextView>(R.id.astrix_text)
        val mEditText2 = findViewById<TextView>(R.id.zero_text)
        val mEditText3 = findViewById<TextView>(R.id.one_text)
        val mButton = findViewById<Button>(R.id.play_button)


        val box1 = findViewById<CheckBox>(R.id.first_hold)
        val box2 = findViewById<CheckBox>(R.id.second_hold)
        val box3 = findViewById<CheckBox>(R.id.third_hold)

//         On button click, min and max value is fetched
//         from the EditText and a Random value is generated
        val variabile = listOf<String>("*", "0", "1", "3")
        mButton.setOnClickListener {


            if (!box1.isChecked) {
                val text1 = variabile[(0..3).random()]
                mEditText1.setText(text1)
            }
            if (!box2.isChecked) {
                val text2 = variabile[(0..3).random()]
                mEditText2.setText(text2)
            }
            if (!box3.isChecked) {
                val text3 = variabile[(0..3).random()]
                mEditText3.setText(text3)
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            insets

        }
    }

}