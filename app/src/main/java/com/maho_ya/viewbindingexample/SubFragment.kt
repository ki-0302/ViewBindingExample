package com.maho_ya.viewbindingexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.maho_ya.viewbindingexample.databinding.FragmentSubBinding

class SubFragment: Fragment() {

    // フラグメントでビュー バインディングを使用する
    // https://developer.android.com/topic/libraries/view-binding?hl=ja#fragments

    // FragmentはViewよりも生存するため、onDestroyView() で参照をクリーンアップする必要がある。
    // そのためNullableとしている
    private var _binding: FragmentSubBinding? = null

    // onCreateViewからonDestroyViewまでしか呼ばれないため、強制アンラップを使用する
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentSubBinding.inflate(inflater, container, false)
        binding.textView.text = "Sub Fragment Test"
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()

        // 参照をクリーンアップ
        _binding = null
    }
}