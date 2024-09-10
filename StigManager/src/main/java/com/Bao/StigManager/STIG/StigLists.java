package com.Bao.StigManager.STIG;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StigLists {

    StigEntity myStig;
    List<StigEntity> myStigList;

    public StigLists() {
    }


    public void addToList(StigEntity myStig){
        myStigList.add(myStig);
    }

    public List<StigEntity> getStigList(){
        return myStigList;
    }
}
