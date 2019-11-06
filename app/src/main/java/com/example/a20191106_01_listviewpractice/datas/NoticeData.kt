package com.example.a20191106_01_listviewpractice.datas

import android.util.Log

class NoticeData(title:String, content:String, writeDate:String) {

    var noticeTitle= title
    var noticeContent = content
    var date = writeDate
    
    init {
        Log.d("제목",title)
    }


}