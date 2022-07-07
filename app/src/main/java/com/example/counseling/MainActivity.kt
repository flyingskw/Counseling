package com.example.counseling

import android.content.Intent
import android.view.View
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // 변수 선언 왜하지?? 일단 이름표를 박는 건가??
    lateinit var calendarView: CalendarView
    lateinit var tv_text: TextView
    lateinit var contextEditText: EditText


    //이건 그냥 기본으로 있는 애 같은 느낌?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 변수에서 언급한 애가 누구인지 xml과 연결시켜주는 작업
        calendarView = findViewById(R.id.calendarView)
        tv_text = findViewById(R.id.tv_text)
        contextEditText = findViewById(R.id.content)

        //내용 넣기 => 어떤 내용이 텍스트 박스에 뜰지 기능을 주는 아이들 필요한 기능 구글링으로 넣나??
        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
        tv_text.text = String.format("%d / %d / %d", year, month + 1, dayOfMonth)
        contextEditText.visibility = View.VISIBLE



        }

    }

    // xml에서 버튼 클릭할 때 어떤 작업할지 명령 => 온클릭으로 연결 필요
    fun clickPlus(view: View) {
        //Toast.makeText(view.context, "상담을 기록하자", Toast.LENGTH_LONG).show()

        //새창 띄우는 것
       var intent = Intent(this, content::class.java)
        startActivity(intent)


    }








}
