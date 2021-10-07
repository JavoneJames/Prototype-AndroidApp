package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentMethodDetails implements Parcelable {

    public final static Creator<PaymentMethodDetails> CREATOR = new Creator<PaymentMethodDetails>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PaymentMethodDetails createFromParcel(android.os.Parcel in) {
            return new PaymentMethodDetails(in);
        }

        public PaymentMethodDetails[] newArray(int size) {
            return (new PaymentMethodDetails[size]);
        }

    };
    @SerializedName("card")
    @Expose
    private Card card;
    @SerializedName("type")
    @Expose
    private String type;

    protected PaymentMethodDetails(android.os.Parcel in) {
        this.card = ((Card) in.readValue((Card.class.getClassLoader())));
        this.type = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PaymentMethodDetails() {
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(card);
        dest.writeValue(type);
    }

    public int describeContents() {
        return 0;
    }

}
