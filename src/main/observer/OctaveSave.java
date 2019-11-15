package observer;

import java.util.Observable;
import java.util.Observer;

public class OctaveSave implements Observer {



    @Override
    public void update(Observable o, Object arg) {
        //change the files to different set here
        System.out.println("sound files changes to reflect new octave");
    }
}
