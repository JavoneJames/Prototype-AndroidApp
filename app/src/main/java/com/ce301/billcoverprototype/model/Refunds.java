package com.ce301.billcoverprototype.model;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Refunds implements Parcelable {

    public final static Creator<Refunds> CREATOR = new Creator<Refunds>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Refunds createFromParcel(android.os.Parcel in) {
            return new Refunds(in);
        }

        public Refunds[] newArray(int size) {
            return (new Refunds[size]);
        }

    };
    @SerializedName("object")
    @Expose
    private String object;
    @SerializedName("data")
    @Expose
    private List<Object> data = null;
    @SerializedName("has_more")
    @Expose
    private Boolean hasMore;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("url")
    @Expose
    private String url;

    protected Refunds(android.os.Parcel in) {
        this.object = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Object.class.getClassLoader()));
        this.hasMore = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.totalCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Refunds() {
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(object);
        dest.writeList(data);
        dest.writeValue(hasMore);
        dest.writeValue(totalCount);
        dest.writeValue(url);
    }

    public int describeContents() {
        return 0;
    }

}
