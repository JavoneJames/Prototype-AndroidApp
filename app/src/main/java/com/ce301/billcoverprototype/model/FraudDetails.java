package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

public class FraudDetails implements Parcelable {

    public final static Creator<FraudDetails> CREATOR = new Creator<FraudDetails>() {


        @SuppressWarnings({
                "unchecked"
        })
        public FraudDetails createFromParcel(android.os.Parcel in) {
            return new FraudDetails(in);
        }

        public FraudDetails[] newArray(int size) {
            return (new FraudDetails[size]);
        }

    };

    protected FraudDetails(android.os.Parcel in) {
    }

    public FraudDetails() {
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
    }

    public int describeContents() {
        return 0;
    }

}
