package com.maho_ya.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maho_ya.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // View Binding
    // https://developer.android.com/topic/libraries/view-binding?hl=ja

    // layout/**.xml 毎にバインディングクラスが xmlのファイル名 + Binding の名称でキャメルケースで生成される。
    // 生成されたバインディングクラスにはrootとidを持つViewへの参照が組み込まれる。
    // idを持たないものは参照が生成されない。
    // またレイアウトのルート要素に tools:viewBindingIgnore="true" が設定された場合は Bindingクラスは生成されない。


    // 生成されたBindingクラスを使用する。
    // クラスが実際に生成されるのはBuild時だが、Buildしなくてもエラーにはならない。
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // View Bindingのセットアップ方法
        // - Bindingクラスのインスタンスを生成
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        // - rootのViewをsetContentViewに渡して、アクティブビューにする
        setContentView(view)

        // 以上で任意のビューを参照できるようになる
        binding.textView.text = "BindingTest"
    }
}