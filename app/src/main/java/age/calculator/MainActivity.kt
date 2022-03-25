 package age.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  button click
        findViewById<Button>(R.id.calculateAgeBtn).setOnClickListener {
            //get age from EditText

            val userDOB = findViewById<EditText>(R.id.ageEt).text.toString().trim()// .trim is to remove space from the start and the end of text
            // get current year
            val year: Int = Calendar.getInstance().get(Calendar.YEAR)
            //validate
            if (userDOB == ""){// if no value entered
                Toast.makeText(this,"Please enter year", Toast.LENGTH_SHORT).show()
           }
            else if (userDOB > year.toString()){// if entered year > current year
                Toast.makeText(this, "Entered year should be less then current year",Toast.LENGTH_SHORT).show()
            }
            else{
                // current year - entered year
                val myAge = year - userDOB.toInt()// year is in int and userDOB is in string so need to be converted to int
                //set the value of myAge to TextView
                findViewById<TextView>(R.id.myAgeTv).text = "You are " +myAge+ " Years Old"
            }
        }
    }
}