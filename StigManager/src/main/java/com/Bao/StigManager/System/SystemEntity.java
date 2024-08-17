package com.Bao.StigManager.System;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.time.LocalDate;
import java.util.List;

import com.Bao.StigManager.STIG.StigEntity;

import jakarta.persistence.Entity;

@Entity
public class SystemEntity {

    @Id
    private int eMassId;

    private String SystemName;

    private LocalDate  AtoDate;

    @OneToMany
    @JoinColumn(name = "id")
    private List<StigEntity> Stigs;

    public SystemEntity(String systemName, LocalDate atoDate, List<StigEntity> stigs, int eMassId) {
        SystemName = systemName;
        AtoDate = atoDate;
        Stigs = stigs;
        this.eMassId = eMassId;
    }

    public String getSystemName() {
        return SystemName;
    }

    public void setSystemName(String systemName) {
        SystemName = systemName;
    }

    public LocalDate getAtoDate() {
        return AtoDate;
    }

    public void setAtoDate(LocalDate atoDate) {
        AtoDate = atoDate;
    }

    public int geteMassId() {
        return eMassId;
    }

    public void seteMassId(int eMassId) {
        this.eMassId = eMassId;
    }
    
    public List<StigEntity> getStigs() {
        return Stigs;
    }

    public void setStigs(List<StigEntity> stigs) {
        Stigs = stigs;
    }

    @Override
    public String toString() {
        return "SystemEntity [SystemName=" + SystemName + ", AtoDate=" + AtoDate + ", eMassId=" + eMassId + "]";
    }
}
