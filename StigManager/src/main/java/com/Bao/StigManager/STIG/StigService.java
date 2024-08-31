package com.Bao.StigManager.STIG;

import java.util.ArrayList;
import java.util.List;

public class StigService {
    private static List<Stig> stigs = new ArrayList<Stig>();

    static {
        //Software
        stigs.add(new Stig("Browser", 4, 3));
        stigs.add(new Stig("Browser", 2, 1));
        stigs.add(new Stig("Browser", 3, 3));

        //Hardware
        stigs.add(new Stig("Router", 1, 3));
        stigs.add(new Stig("Switch", 2, 4));
        stigs.add(new Stig("Windows", 3, 3));
        stigs.add(new Stig("RHEL 7", 4, 2));
    }
}
