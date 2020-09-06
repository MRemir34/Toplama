package ml.efhmedia.toplama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)

val edt1 = edittext1 as EditText
val edt2 = edittext2 as EditText
val txt1 = textview1 as TextView
val btn1 = button1 as Button

btn1.setOnClickListener {

val result1 : Int = edt1.text.toString().toInt()
val result2 : Int = edt2.text.toString().toInt()

val res : String = (result1 + result2).toString()
txt1.setText(res)

Toast.makeText(this, res, Toast.LENGTH_LONG).show()
};

}
}