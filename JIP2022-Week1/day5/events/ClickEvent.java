package day5.events;

import java.util.Date;
import java.util.EventObject;

public class ClickEvent extends EventObject {
    private int buttonId;
    private Date date;

    public ClickEvent(Button source, int id, Date date) {
        super(source);
        this.buttonId = id;
        this.date = date;

    }

    public void setButtonId(int buttonId) {
        this.buttonId = buttonId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public int getButtonId() {
        return buttonId;
    }

    public ClickEvent(Object source) {
        super(source);
    }
}
