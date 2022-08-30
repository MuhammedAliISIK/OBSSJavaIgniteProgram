package day5.events;

import java.util.ArrayList;
import java.util.Date;

public class Button {
    ArrayList<MouseListener> arrEvent = new ArrayList<>();
    private int id;
    private Date date;
    public Button(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void addMouseClickListener(MouseListener mouseListener){
        arrEvent.add(mouseListener);

    }
    public void removeMouseClickListener(MouseListener mouseListener){
        arrEvent.remove(mouseListener);
    }
    public void click(){
        for(MouseListener listener: arrEvent){
            listener.mouseClicked(new ClickEvent(this,this.id,this.date));
        }
    }
}
