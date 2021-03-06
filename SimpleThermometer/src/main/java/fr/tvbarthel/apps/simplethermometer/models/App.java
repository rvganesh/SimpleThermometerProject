package fr.tvbarthel.apps.simplethermometer.models;

/**
 * A sery simple class representing an application.
 */
public class App {
    private Integer mNameResourceId;
    private Integer mLogoResourceId;
    private Integer mPackageNameResourceId;

    public Integer getNameResourceId() {
        return mNameResourceId;
    }

    public void setNameResourceId(Integer nameResourceId) {
        mNameResourceId = nameResourceId;
    }

    public Integer getLogoResourceId() {
        return mLogoResourceId;
    }

    public void setLogoResourceId(Integer logoResourceId) {
        mLogoResourceId = logoResourceId;
    }

    public Integer getPackageNameResourceId() {
        return mPackageNameResourceId;
    }

    public void setPackageNameResourceId(Integer packageNameResourceId) {
        mPackageNameResourceId = packageNameResourceId;
    }
}