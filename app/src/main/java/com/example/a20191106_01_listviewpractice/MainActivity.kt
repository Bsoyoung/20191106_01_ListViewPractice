package com.example.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20191106_01_listviewpractice.adapters.NoticeAdapter
import com.example.a20191106_01_listviewpractice.datas.NoticeData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var noticeList = ArrayList<NoticeData>();
    var noticeAdapter:NoticeAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNotices()

        noticeAdapter = NoticeAdapter(this,noticeList)
        noticeListView.adapter = noticeAdapter

    }

    fun addNotices() {

        noticeList.add(NoticeData("1번 공지","1번 내용입니다","2019-01-02"))
        noticeList.add(NoticeData("2번 공지","2번 내용입니다","2019-02-03"))
        noticeList.add(NoticeData("3번 공지","3번 내용입니다","2019-03-04"))
        noticeList.add(NoticeData("4번 공지","4번 내용입니다","2019-04-01"))
        noticeList.add(NoticeData("5번 공지","5번 내용입니다","2019-05-01"))
        noticeList.add(NoticeData("6번 공지","6번 내용입니다","2019-06-01"))
        noticeList.add(NoticeData("7번 공지","7번 내용입니다","2019-07-02"))
        noticeList.add(NoticeData("8번 공지","8번 내용입니다","2019-07-03"))
        noticeList.add(NoticeData("9번 공지","9번 내용입니다","2019-07-04"))
        noticeList.add(NoticeData("10번 공지","10번 내용입니다","2019-08-01"))
        noticeList.add(NoticeData("11번 공지","11번 내용입니다","2019-09-01"))
        noticeList.add(NoticeData("12번 공지","12번 내용입니다","2019-10-01"))
        noticeList.add(NoticeData("13번 공지","13번 내용입니다","2019-11-06"))
        noticeList.add(NoticeData("14번 공지","14번 내용입니다","2019-11-11"))
        noticeList.add(NoticeData("15번 공지","15번 내용입니다","2019-12-24"))
        noticeList.add(NoticeData("16번 공지","16번 내용입니다","2019-12-25"))
    }
}
