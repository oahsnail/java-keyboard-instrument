package model;

import java.util.List;

public class B {
    private List<A> as;

    public void addA(A a) {
        if (!as.contains(a)) {
            as.add(a);
            a.addB(this);
        }
    }
}
