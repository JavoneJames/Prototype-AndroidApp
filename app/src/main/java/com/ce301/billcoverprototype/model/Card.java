package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Card implements Parcelable {

    public final static Creator<Card> CREATOR = new Creator<Card>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Card createFromParcel(android.os.Parcel in) {
            return new Card(in);
        }

        public Card[] newArray(int size) {
            return (new Card[size]);
        }

    };
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("checks")
    @Expose
    private Checks checks;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("exp_month")
    @Expose
    private Integer expMonth;
    @SerializedName("exp_year")
    @Expose
    private Integer expYear;
    @SerializedName("fingerprint")
    @Expose
    private String fingerprint;
    @SerializedName("funding")
    @Expose
    private String funding;
    @SerializedName("installments")
    @Expose
    private Object installments;
    @SerializedName("last4")
    @Expose
    private String last4;
    @SerializedName("network")
    @Expose
    private String network;
    @SerializedName("three_d_secure")
    @Expose
    private Object threeDSecure;
    @SerializedName("wallet")
    @Expose
    private Object wallet;

    protected Card(android.os.Parcel in) {
        this.brand = ((String) in.readValue((String.class.getClassLoader())));
        this.checks = ((Checks) in.readValue((Checks.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.expMonth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.expYear = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fingerprint = ((String) in.readValue((String.class.getClassLoader())));
        this.funding = ((String) in.readValue((String.class.getClassLoader())));
        this.installments = ((Object) in.readValue((Object.class.getClassLoader())));
        this.last4 = ((String) in.readValue((String.class.getClassLoader())));
        this.network = ((String) in.readValue((String.class.getClassLoader())));
        this.threeDSecure = ((Object) in.readValue((Object.class.getClassLoader())));
        this.wallet = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Card() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Checks getChecks() {
        return checks;
    }

    public void setChecks(Checks checks) {
        this.checks = checks;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(Integer expMonth) {
        this.expMonth = expMonth;
    }

    public Integer getExpYear() {
        return expYear;
    }

    public void setExpYear(Integer expYear) {
        this.expYear = expYear;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public String getFunding() {
        return funding;
    }

    public void setFunding(String funding) {
        this.funding = funding;
    }

    public Object getInstallments() {
        return installments;
    }

    public void setInstallments(Object installments) {
        this.installments = installments;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Object getThreeDSecure() {
        return threeDSecure;
    }

    public void setThreeDSecure(Object threeDSecure) {
        this.threeDSecure = threeDSecure;
    }

    public Object getWallet() {
        return wallet;
    }

    public void setWallet(Object wallet) {
        this.wallet = wallet;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(brand);
        dest.writeValue(checks);
        dest.writeValue(country);
        dest.writeValue(expMonth);
        dest.writeValue(expYear);
        dest.writeValue(fingerprint);
        dest.writeValue(funding);
        dest.writeValue(installments);
        dest.writeValue(last4);
        dest.writeValue(network);
        dest.writeValue(threeDSecure);
        dest.writeValue(wallet);
    }

    public int describeContents() {
        return 0;
    }

}
