package com.example.mvpplayground.model

import com.example.mvpplayground.contract.ContractInterface

class MainActivityModel:ContractInterface.Model {
    private var mCounter = 0

    override fun getCounter(): Int {
        return mCounter
    }

    override fun incrementCounter() {
        mCounter++
    }
}