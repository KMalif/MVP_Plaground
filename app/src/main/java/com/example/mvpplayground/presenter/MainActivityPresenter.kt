package com.example.mvpplayground.presenter

import com.example.mvpplayground.contract.ContractInterface
import com.example.mvpplayground.model.MainActivityModel

class MainActivityPresenter(_view : ContractInterface.View):ContractInterface.Presenter {

    private var view : ContractInterface.View = _view
    private var model : ContractInterface.Model = MainActivityModel()
    init {
        view.initView()
    }

    override fun incrementValue() {
    model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter(): String {
    return model.getCounter().toString()
    }
}