package id.syizuril.app.mengenalburungnusantara;

import android.os.Parcel;
import android.os.Parcelable;

public class Burung implements Parcelable {
    private String name, photo, remarks;
    private String kerajaan, kelas, ordo, familia, genus, spesies, deskripsi;

    public String getKerajaan() {
        return kerajaan;
    }

    public void setKerajaan(String kerajaan) {
        this.kerajaan = kerajaan;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getOrdo() {
        return ordo;
    }

    public void setOrdo(String ordo) {
        this.ordo = ordo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpesies() {
        return spesies;
    }

    public void setSpesies(String spesies) {
        this.spesies = spesies;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.photo);
        dest.writeString(this.remarks);
        dest.writeString(this.kerajaan);
        dest.writeString(this.kelas);
        dest.writeString(this.ordo);
        dest.writeString(this.familia);
        dest.writeString(this.genus);
        dest.writeString(this.spesies);
        dest.writeString(this.deskripsi);
    }

    public  Burung(){
    }

    protected Burung(Parcel in) {
        this.name = in.readString();
        this.photo = in.readString();
        this.remarks = in.readString();
        this.kerajaan = in.readString();
        this.kelas = in.readString();
        this.ordo = in.readString();
        this.familia = in.readString();
        this.genus = in.readString();
        this.spesies = in.readString();
        this.deskripsi = in.readString();
    }

    public static final Parcelable.Creator<Burung> CREATOR = new Parcelable.Creator<Burung>() {
        @Override
        public Burung createFromParcel(Parcel source) {
            return new Burung(source);
        }

        @Override
        public Burung[] newArray(int size) {
            return new Burung[size];
        }
    };

}
