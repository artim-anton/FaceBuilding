package com.artim.anton.facebuilding.presenters

import android.os.Handler
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.artim.anton.facebuilding.views.LoginView

@InjectViewState
class LoginPresenter: MvpPresenter<LoginView>() {
    fun login(isSuccess: Boolean) {
        viewState.startLoading()
        Handler().postDelayed({
            viewState.endLoading()
            if (isSuccess) {
                viewState.openFriends()
            } else {
                viewState.showError("login data is correct")
            }
        }, 500)
    }
}