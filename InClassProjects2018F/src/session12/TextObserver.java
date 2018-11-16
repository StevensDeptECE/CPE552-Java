package session12;

import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class TextObserver extends Observer {
    ArrayList<Stock> viewlist;
    
    public TextObserver() {
        viewlist = new ArrayList<>();
    }
    public void subscribe(Stock s) {
        super.subscribe(s);
        viewlist.add(s);
    }
    public void update() {
        for (Stock s : viewlist) {
            System.out.println(s);
        }
    }
    public void update(Data d) {
        
    }
    
}
