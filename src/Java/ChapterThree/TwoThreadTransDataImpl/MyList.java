package Java.ChapterThree.TwoThreadTransDataImpl;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<String> list = new ArrayList<>();
    public void add(){
        list.add("Aaron");
    }

    public int size(){
        return list.size();
    }
}
