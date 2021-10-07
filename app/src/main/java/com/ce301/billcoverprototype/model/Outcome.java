package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Outcome implements Parcelable {

    public final static Creator<Outcome> CREATOR = new Creator<Outcome>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Outcome createFromParcel(android.os.Parcel in) {
            return new Outcome(in);
        }

        public Outcome[] newArray(int size) {
            return (new Outcome[size]);
        }

    };
    @SerializedName("network_status")
    @Expose
    private String networkStatus;
    @SerializedName("reason")
    @Expose
    private Object reason;
    @SerializedName("risk_level")
    @Expose
    private String riskLevel;
    @SerializedName("risk_score")
    @Expose
    private Integer riskScore;
    @SerializedName("seller_message")
    @Expose
    private String sellerMessage;
    @SerializedName("type")
    @Expose
    private String type;

    protected Outcome(android.os.Parcel in) {
        this.networkStatus = ((String) in.readValue((String.class.getClassLoader())));
        this.reason = ((Object) in.readValue((Object.class.getClassLoader())));
        this.riskLevel = ((String) in.readValue((String.class.getClassLoader())));
        this.riskScore = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.sellerMessage = ((String) in.readValue((String.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Outcome() {
    }

    public String getNetworkStatus() {
        return networkStatus;
    }

    public void setNetworkStatus(String networkStatus) {
        this.networkStatus = networkStatus;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Integer getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Integer riskScore) {
        this.riskScore = riskScore;
    }

    public String getSellerMessage() {
        return sellerMessage;
    }

    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(networkStatus);
        dest.writeValue(reason);
        dest.writeValue(riskLevel);
        dest.writeValue(riskScore);
        dest.writeValue(sellerMessage);
        dest.writeValue(type);
    }

    public int describeContents() {
        return 0;
    }

}
