
package com.ce301.billcoverprototype.model;


import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address implements Parcelable
{

    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("line1")
    @Expose
    private Object line1;
    @SerializedName("line2")
    @Expose
    private Object line2;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("state")
    @Expose
    private Object state;
    public final static Creator<Address> CREATOR = new Creator<Address>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Address createFromParcel(android.os.Parcel in) {
            return new Address(in);
        }

        public Address[] newArray(int size) {
            return (new Address[size]);
        }

    }
    ;

    protected Address(android.os.Parcel in) {
        this.city = ((Object) in.readValue((Object.class.getClassLoader())));
        this.country = ((Object) in.readValue((Object.class.getClassLoader())));
        this.line1 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.line2 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.postalCode = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Address() {
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getLine1() {
        return line1;
    }

    public void setLine1(Object line1) {
        this.line1 = line1;
    }

    public Object getLine2() {
        return line2;
    }

    public void setLine2(Object line2) {
        this.line2 = line2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(city);
        dest.writeValue(country);
        dest.writeValue(line1);
        dest.writeValue(line2);
        dest.writeValue(postalCode);
        dest.writeValue(state);
    }

    public int describeContents() {
        return  0;
    }

}
