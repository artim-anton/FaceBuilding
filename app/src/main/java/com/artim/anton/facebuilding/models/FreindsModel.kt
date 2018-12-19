package com.artim.anton.facebuilding.models

/**
 * Created by artim-anton on 17.12.2018.
 */
class FreindsModel {

    private var name: String
    private var surname: String
    private var city: String?
    private var avatar: String?
    private var isOnline: Boolean

    constructor(name: String, surname: String, city: String?, avatar: String?, isOnline: Boolean){
        this.name = name
        this.surname = surname
        this.city = city
        this.avatar = avatar
        this.isOnline = isOnline

    }
}