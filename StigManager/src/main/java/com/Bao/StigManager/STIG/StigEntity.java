package com.Bao.StigManager.STIG;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StigEntity {

    @Id
    int StigID;

    int eMassId;
    String ComponentName;
    String Name;
    Integer Version;
    Integer Release;
    boolean Temp;

    public StigEntity(int stigID, int eMassId, String componentName, String name, Integer version, Integer release, boolean temp) {
        StigID = stigID;
        this.eMassId = eMassId;
        ComponentName = componentName;
        Name = name;
        Version = version;
        Release = release;
        Temp = temp;
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

    @Override
    public String toString() {
        return "Stig{" +
                "Name='" + Name + '\'' +
                ", Version=" + Version +
                ", Release=" + Release +
                '}';
    }
}
