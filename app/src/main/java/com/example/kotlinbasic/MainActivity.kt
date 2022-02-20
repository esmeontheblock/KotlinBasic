package com.example.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//            btnLog 버튼이 눌리면 해야할 일을 지정
        btnLog.setOnClickListener {

//            로그 버튼이 눌릴때마다 실행될 코드 {}

//            로그를 찍어보자

            Log.d( "메인화면", "로그 버튼 눌림" )
            Log.e("메인화면", "e로 로그 찍어보기")
            
        }
        
        btnToast.setOnClickListener { 
            
//            토스트를 띄워보자
            Toast.makeText(this, " 토스트 버튼 눌림", Toast.LENGTH_SHORT).show()

        }

        btnVariablePractice.setOnClickListener {

            var myName : String

            val friendName : String

            myName = "권효영"
            friendName = "조민상"

            myName = "권민주" // 추가로 다시 대입해도 됨. var
//            friendName = "조상민" // 한번 넣은 걸로 계속 사용. val

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

            btnConditionPractice.setOnClickListener {

                val userAge = 15

                if (userAge >= 20) {

//                    userAge의 값이 20 이상이면 실행됨.
                    Toast.makeText(this,"성인입니다.", Toast.LENGTH_SHORT).show()
                }
                else{

                    Toast.makeText(this,"미성년자입니다.", Toast.LENGTH_SHORT).show()

                }
            }

        }
    }
}