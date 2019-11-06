package com.example.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.a20191106_01_listviewpractice.datas.GameData

class googleMain : AppCompatActivity() {

    var gameData = ArrayList<GameData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_main)

        addGameData()


    }

    fun addGameData(){

        gameData.add(GameData("1. 아스팔트8","Gameloft"))
        gameData.add(GameData("2. 마이크래프트","Mojang"))
        gameData.add(GameData("3. 아스팔트7 : 허트","Gameloft"))
        gameData.add(GameData("4. 팔라독","FrzeCat"))
        gameData.add(GameData("5. Plants vs Zombies","EA Swiss Sarl"))
        gameData.add(GameData("6. 스왐피","Disney"))

    }
}
