package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var06MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var06_main)
//        val mEditText1 = findViewById<EditText>(R.id.astrix_text)
//        val mEditText2 = findViewById<EditText>(R.id.zero_text)
//        val mEditText3 = findViewById<EditText>(R.id.one_text)
//        val mButton = findViewById<Button>(R.id.play_button)

        // On button click, min and max value is fetched
        // from the EditText and a Random value is generated
//        val variabile = listOf<String>("*", "0", "1", "3")
//        mButton.setOnClickListener {
//
//
//            if (!mEditText1.isSelected) {
//                mEditText1.setText(variabile[(0..3).random()])
//            }
//            if (!mEditText2.isSelected) {
//                mEditText2.setText(variabile[(0..3).random()])
//            }
//            if (!mEditText3.isSelected) {
//                mEditText3.setText(variabile[(0..3).random()])
//            }
//        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            insets

        }
    }

}