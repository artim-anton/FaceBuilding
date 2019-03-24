package com.artim.anton.facebuilding.views

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.artim.anton.facebuilding.models.FreindsModel

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface FreindsView:MvpView {
    fun showError(text: String)
    fun setupEmptyList()
    fun setupFriendsList(frendsList: ArrayList<FreindsModel>)

}