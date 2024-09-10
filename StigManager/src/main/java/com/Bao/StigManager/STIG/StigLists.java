package com.Bao.StigManager.STIG;

import java.util.List;

public class StigLists {

    List<StigEntity> myStigList;

    String ComponentName;

    public StigLists(List<StigEntity> myStigList, String componentName) {
        this.myStigList = myStigList;
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
