package com.Bao.StigManager.STIG;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StigEntity {

    @Id
    private Integer SystemID;

    private String Name;

    private Integer Version;

    private Integer Release;

    public StigEntity(Integer systemID, String name, Integer version, Integer release) {
        SystemID = systemID;
        Name = name;
        Version = version;
        Release = release;
    }

    public StigEntity() {

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

    public Integer getSystemID() {
        return SystemID;
    }

    public void setSystemID(Integer systemID) {
        SystemID = systemID;
    }
    @Override
    public String toString() {
        return "StigEntity{" +
                "SystemID=" + SystemID +
                ", Name='" + Name + '\'' +
                ", Version=" + Version +
                ", Release=" + Release +
                '}';
    }
}
