package com.example.asiatenggara.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Bangunan implements Parcelable {
    private String name;
    private String remarks;
    private int photo;
    private String ket;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.remarks);
        parcel.writeString(String.valueOf(this.photo));
        parcel.writeString(this.ket);
    }

    public Bangunan() {
    }

    protected Bangunan(Parcel in) {
        this.name = in.readString();
        this.remarks = in.readString();
        this.photo = Integer.parseInt(in.readString());
        this.ket = in.readString();
    }

    public static final Parcelable.Creator<Bangunan> CREATOR = new Parcelable.Creator<Bangunan>() {
        @Override
        public Bangunan createFromParcel(Parcel source) {
            return new Bangunan(source);
        }

        @Override
        public Bangunan[] newArray(int size) {
            return new Bangunan[size];
        }
    };
}
