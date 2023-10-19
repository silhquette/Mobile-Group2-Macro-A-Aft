package com.example.jalanin_aja

import android.os.Parcel
import android.os.Parcelable

data class Foods(var foodImage: Int, var foodName: String?, var foodAddress: String?, var foodPrice: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foodImage)
        parcel.writeString(foodName)
        parcel.writeString(foodAddress)
        parcel.writeInt(foodPrice)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Foods> {
        override fun createFromParcel(parcel: Parcel): Foods {
            return Foods(parcel)
        }

        override fun newArray(size: Int): Array<Foods?> {
            return arrayOfNulls(size)
        }
    }
}
