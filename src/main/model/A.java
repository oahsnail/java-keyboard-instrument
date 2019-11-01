package model;

import java.util.List;

public class A {
    private List<B> bs;

    public void addB(B b) {
        if (!bs.contains(b)) {
            bs.add(b);
            b.addA(this);
        }
    }
}

