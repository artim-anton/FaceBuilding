package com.artim.anton.facebuilding.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface LoginView:MvpView {
    fun startLoading()
    fun endLoading()
    fun showError(text: String)
    fun openFriends()
}
