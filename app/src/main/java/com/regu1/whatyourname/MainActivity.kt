package com.regu1.whatyourname

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ボタンのクリック処理
        //単語編集から単語一覧へ
        buttonEdit.setOnClickListener{
            val intent=Intent(this@MainActivity,Wordlist::class.java)
            startActivity(intent)


        }

        var intBackGroundColor=0
        buttoncolor01.setOnClickListener{
            intBackGroundColor=R.color.color01
            ConstraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }

        buttoncolor02.setOnClickListener{
            intBackGroundColor=R.color.color02
            ConstraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttoncolor03.setOnClickListener{
            intBackGroundColor=R.color.color03
            ConstraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttoncolor04.setOnClickListener{
            intBackGroundColor=R.color.color04
            ConstraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttoncolor05.setOnClickListener{
            intBackGroundColor=R.color.color05
            ConstraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        buttoncolor06.setOnClickListener{
            intBackGroundColor=R.color.color06
            ConstraintLayoutMain.setBackgroundResource(
                intBackGroundColor)
        }



    }

}