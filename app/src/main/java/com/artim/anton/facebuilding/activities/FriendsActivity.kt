package com.artim.anton.facebuilding.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.artim.anton.facebuilding.R
import com.artim.anton.facebuilding.models.FreindsModel
import com.artim.anton.facebuilding.presenters.FriendsPresenter
import com.artim.anton.facebuilding.views.FreindsView
import com.github.rahatarmanahmed.cpv.CircularProgressView

class FriendsActivity : MvpAppCompatActivity(), FreindsView {

    @InjectPresenter
    lateinit var friendsPresenter: FriendsPresenter

    private lateinit var mRvFreinds: RecyclerView
    private lateinit var mTxtNoItems: TextView
    private lateinit var mCpvWait: CircularProgressView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)

        mRvFreinds = findViewById(R.id.recycler_friends)
        mTxtNoItems = findViewById(R.id.txt_friends_no_item)
        mCpvWait = findViewById(R.id.cpv_friends)
    }

    override fun showError(text: String) {

    }

    override fun setupEmptyList() {

    }

    override fun setupFriendsList(frendsList: ArrayList<FreindsModel>) {

    }


}
