package com.Bao.StigManager.STIG;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StigViewerEntity {

    @Id
    int StigId;

    String Name;
    String  Version;
    String Release;
    String Link;

    public StigViewerEntity(int stigID, String name, String version,
                            String release, String link) {
        StigId = stigID;
        Name = name;
        Version = version;
        Release = release;
        Link = link;
    }

    public StigViewerEntity() {

    }

    public int getStigId() {
        return StigId;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getRelease() {
        return Release;
    }

    public void setRelease(String release) {
        Release = release;
    }

    public void setStigId(int stigId) {
        StigId = stigId;
    }


    @Override
    public String toString() {
        return "StigEntity{" +
                "StigId=" + StigId +
                ", Name='" + Name + '\'' +
                ", Version=" + Version +
                ", Release=" + Release +
                '}';
    }
}
