package com.example.myclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterStudent = StudentAdapter(generateStudents()) {
            student ->
            Toast.makeText(this@MainActivity, "${student.name}",
            Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            rvStudent.apply {
                adapter = adapterStudent
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }

    fun generateStudents(): List<Student> {
        return listOf(
            Student(resID = R.drawable.draco, name = "Draco Malfoy", nim = "22/505613/SV/21835", gpa = 3.5),
            Student(resID = R.drawable.cedric, name = "Cedric Diggory", nim = "22/505614/SV/21836", gpa = 4.0),
            Student(resID = R.drawable.freya, name = "Freya Jayawardana", nim = "22/505615/SV/21837", gpa = 3.7),
            Student(resID = R.drawable.hermione, name = "Hermione Granger", nim = "22/505616/SV/21838", gpa = 4.0),
            Student(resID = R.drawable.lia, name = "Choi Ji-su", nim = "22/505617/SV/21839", gpa = 3.3),
            Student(resID = R.drawable.momo, name = "Hirai Momo", nim = "22/505618/SV/21840", gpa = 3.6),
            Student(resID = R.drawable.snape, name = "Severus Snape", nim = "22/505619/SV/21841", gpa = 3.0),
            Student(resID = R.drawable.tom, name = "Tom Riddle", nim = "22/505620/SV/21842", gpa = 4.0),
            Student(resID = R.drawable.voldy, name = "Voldemort", nim = "22/505621/SV/21843", gpa = 2.0),
            Student(resID = R.drawable.yiren, name = "Wang Yiren", nim = "22/505622/SV/21844", gpa = 3.4)
        )
    }
}