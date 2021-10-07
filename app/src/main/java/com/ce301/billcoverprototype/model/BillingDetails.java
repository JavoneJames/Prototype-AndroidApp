package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BillingDetails implements Parcelable {

    public final static Creator<BillingDetails> CREATOR = new Creator<BillingDetails>() {


        @SuppressWarnings({
                "unchecked"
        })
        public BillingDetails createFromParcel(android.os.Parcel in) {
            return new BillingDetails(in);
        }

        public BillingDetails[] newArray(int size) {
            return (new BillingDetails[size]);
        }

    };
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("phone")
    @Expose
    private Object phone;

    protected BillingDetails(android.os.Parcel in) {
        this.address = ((Address) in.readValue((Address.class.getClassLoader())));
        this.email = ((Object) in.readValue((Object.class.getClassLoader())));
        this.name = ((Object) in.readValue((Object.class.getClassLoader())));
        this.phone = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public BillingDetails() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(address);
        dest.writeValue(email);
        dest.writeValue(name);
        dest.writeValue(phone);
    }

    public int describeContents() {
        return 0;
    }

}
