package com.Bao.StigManager.STIG;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


public class StigLists {

    List<StigEntity> myStigList;

    String ComponentName;

    public StigLists(List<StigEntity> myStigList, String componentName) {
        this.myStigList = myStigList;
    }

    public int getSizeByComponentName(String componentName) {
        int count = 0;
        for (StigEntity stig : myStigList) {
            if (stig.getComponentName().equals(componentName)) {
                count++;
            }
        }
        return count;
    }

    public List<StigEntity> getMyStigList() {
        return myStigList;
    }

    public String getComponentName() {
        return ComponentName;
    }

    public void setComponentName(String componentName) {
        ComponentName = componentName;
    }

    public void setMyStigList(List<StigEntity> myStigList) {
        this.myStigList = myStigList;
    }

    @Override
    public String toString() {
        return "StigLists{" +
                "myStigList=" + myStigList +
                ", ComponentName='" + ComponentName + '\'' +
                '}';
    }
}
