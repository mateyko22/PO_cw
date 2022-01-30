package zadania6;

import java.util.ArrayList;

public class IntegerSet {
    ArrayList<Boolean> tab;

    public IntegerSet()
    {
        tab = new ArrayList<>();
        for (int i=0; i<99; i++)
        {
            tab.add(false);
        }
    }
}
