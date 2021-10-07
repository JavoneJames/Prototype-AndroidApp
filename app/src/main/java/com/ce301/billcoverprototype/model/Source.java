package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source implements Parcelable {

    public final static Creator<Source> CREATOR = new Creator<Source>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Source createFromParcel(android.os.Parcel in) {
            return new Source(in);
        }

        public Source[] newArray(int size) {
            return (new Source[size]);
        }

    };
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("address_city")
    @Expose
    private Object addressCity;
    @SerializedName("address_country")
    @Expose
    private Object addressCountry;
    @SerializedName("address_line1")
    @Expose
    private Object addressLine1;
    @SerializedName("address_line1_check")
    @Expose
    private Object addressLine1Check;
    @SerializedName("address_line2")
    @Expose
    private Object addressLine2;
    @SerializedName("address_state")
    @Expose
    private Object addressState;
    @SerializedName("address_zip")
    @Expose
    private String addressZip;
    @SerializedName("address_zip_check")
    @Expose
    private String addressZipCheck;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("customer")
    @Expose
    private Object customer;
    @SerializedName("cvc_check")
    @Expose
    private String cvcCheck;
    @SerializedName("dynamic_last4")
    @Expose
    private Object dynamicLast4;
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
    @SerializedName("last4")
    @Expose
    private String last4;
    @SerializedName("metadata")
    @Expose
    private Metadata__1 metadata;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("tokenization_method")
    @Expose
    private Object tokenizationMethod;

    protected Source(android.os.Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.object = ((String) in.readValue((String.class.getClassLoader())));
        this.addressCity = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressCountry = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressLine1 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressLine1Check = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressLine2 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressState = ((Object) in.readValue((Object.class.getClassLoader())));
        this.addressZip = ((String) in.readValue((String.class.getClassLoader())));
        this.addressZipCheck = ((String) in.readValue((String.class.getClassLoader())));
        this.brand = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.customer = ((Object) in.readValue((Object.class.getClassLoader())));
        this.cvcCheck = ((String) in.readValue((String.class.getClassLoader())));
        this.dynamicLast4 = ((Object) in.readValue((Object.class.getClassLoader())));
        this.expMonth = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.expYear = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fingerprint = ((String) in.readValue((String.class.getClassLoader())));
        this.funding = ((String) in.readValue((String.class.getClassLoader())));
        this.last4 = ((String) in.readValue((String.class.getClassLoader())));
        this.metadata = ((Metadata__1) in.readValue((Metadata__1.class.getClassLoader())));
        this.name = ((Object) in.readValue((Object.class.getClassLoader())));
        this.tokenizationMethod = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Source() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Object getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(Object addressCity) {
        this.addressCity = addressCity;
    }

    public Object getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(Object addressCountry) {
        this.addressCountry = addressCountry;
    }

    public Object getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(Object addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Object getAddressLine1Check() {
        return addressLine1Check;
    }

    public void setAddressLine1Check(Object addressLine1Check) {
        this.addressLine1Check = addressLine1Check;
    }

    public Object getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Object getAddressState() {
        return addressState;
    }

    public void setAddressState(Object addressState) {
        this.addressState = addressState;
    }

    public String getAddressZip() {
        return addressZip;
    }

    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    public String getAddressZipCheck() {
        return addressZipCheck;
    }

    public void setAddressZipCheck(String addressZipCheck) {
        this.addressZipCheck = addressZipCheck;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Object customer) {
        this.customer = customer;
    }

    public String getCvcCheck() {
        return cvcCheck;
    }

    public void setCvcCheck(String cvcCheck) {
        this.cvcCheck = cvcCheck;
    }

    public Object getDynamicLast4() {
        return dynamicLast4;
    }

    public void setDynamicLast4(Object dynamicLast4) {
        this.dynamicLast4 = dynamicLast4;
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

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public Metadata__1 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata__1 metadata) {
        this.metadata = metadata;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getTokenizationMethod() {
        return tokenizationMethod;
    }

    public void setTokenizationMethod(Object tokenizationMethod) {
        this.tokenizationMethod = tokenizationMethod;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(object);
        dest.writeValue(addressCity);
        dest.writeValue(addressCountry);
        dest.writeValue(addressLine1);
        dest.writeValue(addressLine1Check);
        dest.writeValue(addressLine2);
        dest.writeValue(addressState);
        dest.writeValue(addressZip);
        dest.writeValue(addressZipCheck);
        dest.writeValue(brand);
        dest.writeValue(country);
        dest.writeValue(customer);
        dest.writeValue(cvcCheck);
        dest.writeValue(dynamicLast4);
        dest.writeValue(expMonth);
        dest.writeValue(expYear);
        dest.writeValue(fingerprint);
        dest.writeValue(funding);
        dest.writeValue(last4);
        dest.writeValue(metadata);
        dest.writeValue(name);
        dest.writeValue(tokenizationMethod);
    }

    public int describeContents() {
        return 0;
    }

}
