package com.maho_ya.viewbindingexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.maho_ya.viewbindingexample.databinding.ActivityMainBinding

class SubActivity : AppCompatActivity() {

    // activity_sub.xml はroot要素に tools:viewBindingIgnore="true" を設定しているためBindingクラスが生成されない。


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // Fragmentの追加
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContainer, SubFragment())
        fragmentTransaction.commit()
    }
}
