package com.example.a20191106_01_listviewpractice.datas

import android.util.Log
import java.io.Serializable

class NoticeData(title:String, content:String, writeDate:String) : Serializable{

    var noticeTitle= title
    var noticeContent = content
    var date = writeDate

/*
    init {
        Log.d("제목",title)
    }
*/

}