package com.Bao.StigManager.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class ComponentEntity {

    @Id
    int ComponentId;
    int eMassId;
    String componentType;
    String name;
    String version;
    LocalDate ldaDate;

    public ComponentEntity(int componentId, int eMassId, String componentType, String name, String version, LocalDate ldaDate) {
        ComponentId = componentId;
        this.eMassId = eMassId;
        this.componentType = componentType;
        this.name = name;
        this.version = version;
        this.ldaDate = ldaDate;
    }

    public ComponentEntity() {

    }

    public int getComponentId() {
        return ComponentId;
    }

    public void setComponentId(int componentId) {
        ComponentId = componentId;
    }

    public int geteMassId() {
        return eMassId;
    }

    public void seteMassId(int eMassId) {
        this.eMassId = eMassId;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDate getLdaDate() {
        return ldaDate;
    }

    public void setLdaDate(LocalDate ldaDate) {
        this.ldaDate = ldaDate;
    }

    @Override
    public String toString() {
        return "ComponentEntity{" +
                "ComponentId=" + ComponentId +
                ", eMassId=" + eMassId +
                ", componentType='" + componentType + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", ldaDate=" + ldaDate +
                '}';
    }
}


