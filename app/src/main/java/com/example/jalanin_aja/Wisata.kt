package com.example.jalanin_aja

import android.os.Parcel
import android.os.Parcelable

data class Wisata(val image:Int, val name:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Wisata> {
        override fun createFromParcel(parcel: Parcel): Wisata {
            return Wisata(parcel)
        }

        override fun newArray(size: Int): Array<Wisata?> {
            return arrayOfNulls(size)
        }
    }
}
