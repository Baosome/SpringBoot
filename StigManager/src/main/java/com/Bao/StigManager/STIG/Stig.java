package com.Bao.StigManager.STIG;

public class Stig {
    private String Name;

    private Integer Version;

    private Integer Release;

    public Stig(String name, Integer version, Integer release) {
        Name = name;
        Version = version;
        Release = release;
    }

    public Stig() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer version) {
        Version = version;
    }

    public Integer getRelease() {
        return Release;
    }

    public void setRelease(Integer release) {
        Release = release;
    }

    @Override
    public String toString() {
        return "Stig{" +
                "Name='" + Name + '\'' +
                ", Version=" + Version +
                ", Release=" + Release +
                '}';
    }
}
