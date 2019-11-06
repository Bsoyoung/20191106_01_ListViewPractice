package com.example.a20191106_01_listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.a20191106_01_listviewpractice.R
import com.example.a20191106_01_listviewpractice.datas.GameData

class GameAdapter(context: Context, res:Int, list:ArrayList<GameData>):ArrayAdapter<GameData>(context,R.layout.game_list_item,list) {

    var myContext = context
    var mList = list
    var inf = LayoutInflater.from(myContext)

    constructor(context:Context,list:ArrayList<GameData>):this(context,R.layout.game_list_item,list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null)
        {
            tempRow = inf.inflate(R.layout.game_list_item,null)
        }

        var row = tempRow!!

        //근거 데이터 변수 추출
        var data = mList.get(position)
        //각 줄에서 데이터를 출력할 View 찾아오기
        var titleTxt = row.findViewById<TextView>(R.id.gameTitle)
        var contentTxt = row.findViewById<TextView>(R.id.gameManuf)

        //View / Data를 연결
        titleTxt.text = data.title
        contentTxt.text = data.manuf



        return row
    }

}