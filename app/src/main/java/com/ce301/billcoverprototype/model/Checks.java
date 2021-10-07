package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Checks implements Parcelable {

    public final static Creator<Checks> CREATOR = new Creator<Checks>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Checks createFromParcel(android.os.Parcel in) {
            return new Checks(in);
        }

        public Checks[] newArray(int size) {
            return (new Checks[size]);
        }

    };
    @SerializedName("address_line1_check")
    @Expose
    private Object addressLine1Check;
    @SerializedName("address_postal_code_check")
    @Expose
    private String addressPostalCodeCheck;
    @SerializedName("cvc_check")
    @Expose
    private String cvcCheck;

    protected Checks(android.os.Parcel in) {
        this.addressLine1Check = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressPostalCodeCheck = ((String) in.readValue((String.class.getClassLoader())));
        this.cvcCheck = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Checks() {
    }

    public Object getAddressLine1Check() {
        return addressLine1Check;
    }

    public void setAddressLine1Check(Object addressLine1Check) {
        this.addressLine1Check = addressLine1Check;
    }

    public String getAddressPostalCodeCheck() {
        return addressPostalCodeCheck;
    }

    public void setAddressPostalCodeCheck(String addressPostalCodeCheck) {
        this.addressPostalCodeCheck = addressPostalCodeCheck;
    }

    public String getCvcCheck() {
        return cvcCheck;
    }

    public void setCvcCheck(String cvcCheck) {
        this.cvcCheck = cvcCheck;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(addressLine1Check);
        dest.writeValue(addressPostalCodeCheck);
        dest.writeValue(cvcCheck);
    }

    public int describeContents() {
        return 0;
    }

}
