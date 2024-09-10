package com.Bao.StigManager.STIG;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StigEntity {

    @Id
    int StigId;

    int eMassId;
    String ComponentName;
    String Name;
    Integer Version;
    Integer Release;

    public StigEntity(int stigID, int eMassId, String componentName, String name, Integer version, Integer release) {
        StigId = stigID;
        this.eMassId = eMassId;
        ComponentName = componentName;
        Name = name;
        Version = version;
        Release = release;
    }

    public StigEntity() {

    }

    public int getStigId() {
        return StigId;
    }

    public int geteMassId() {
        return eMassId;
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

    public void setStigId(int stigId) {
        StigId = stigId;
    }

    public void seteMassId(int eMassId) {
        this.eMassId = eMassId;
    }

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String componentName) {
        ComponentName = componentName;
    }

    @Override
    public String toString() {
        return "StigEntity{" +
                "StigId=" + StigId +
                ", eMassId=" + eMassId +
                ", ComponentName='" + ComponentName + '\'' +
                ", Name='" + Name + '\'' +
                ", Version=" + Version +
                ", Release=" + Release +
                '}';
    }
}
