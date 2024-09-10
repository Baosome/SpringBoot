package com.Bao.StigManager.STIG;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StigLists {

    StigEntity myStig;

    public StigLists() {
    }

    List<StigEntity> StigList = new ArrayList<StigEntity>();

    public void addToList(StigEntity myStig){
        StigList.add(myStig);
    }
}
