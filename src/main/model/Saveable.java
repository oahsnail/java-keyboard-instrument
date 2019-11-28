package model;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface Saveable {

    //EFFECTS: Saves
    void save() throws FileNotFoundException, UnsupportedEncodingException;

}
