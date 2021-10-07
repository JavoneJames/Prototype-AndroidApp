package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

public class Metadata implements Parcelable {

    public final static Creator<Metadata> CREATOR = new Creator<Metadata>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Metadata createFromParcel(android.os.Parcel in) {
            return new Metadata(in);
        }

        public Metadata[] newArray(int size) {
            return (new Metadata[size]);
        }

    };

    protected Metadata(android.os.Parcel in) {
    }

    public Metadata() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
    }

    public int describeContents() {
        return 0;
    }

}
