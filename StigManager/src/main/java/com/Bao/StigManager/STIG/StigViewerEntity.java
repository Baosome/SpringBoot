package com.Bao.StigManager.STIG;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StigViewerEntity {

    @Id
    int stigId;
    @Column(name = "name")
    String name;
    String  Version;
    String Release;
    String Link;

    public StigViewerEntity(int stigID, String name, String version,
                            String release, String link) {
        this.stigId = stigID;
        this.name = name;
        Version = version;
        Release = release;
        Link = link;
    }

    public StigViewerEntity() {

    }

    public int getStigId() {
        return stigId;
    }

    public void setStigId(int stigId) {
        this.stigId = stigId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    @Override
    public String toString() {
        return "StigViewerEntity{" +
                "stigId=" + stigId +
                ", name='" + name + '\'' +
                ", Version='" + Version + '\'' +
                ", Release='" + Release + '\'' +
                ", Link='" + Link + '\'' +
                '}';
    }
}
