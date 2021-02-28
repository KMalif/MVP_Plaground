package com.example.mvpplayground.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mvpplayground.R
import com.example.mvpplayground.contract.ContractInterface
import com.example.mvpplayground.databinding.ActivityMainBinding
import com.example.mvpplayground.presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), ContractInterface.View {

    private var presenter : MainActivityPresenter?= null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        binding.CounterTV.text = presenter?.getCounter()
        binding.FAB.setOnClickListener{ presenter?.incrementValue()}
    }

    override fun updateViewData() {
        binding.CounterTV.text = presenter?.getCounter()
    }
}