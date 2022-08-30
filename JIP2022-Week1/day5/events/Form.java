package day5.events;

public class Form implements MouseListener{
    private Button formButton;

    public Form(){
        if (formButton != null) {
            formButton.addMouseClickListener(this);
        }
    }

    public void setFormButton(Button formButton) {
        this.formButton = formButton;
    }

    @Override
    public void mouseClicked(ClickEvent clickEvent) {
        System.out.println("Button "+formButton.getId()+" is pressed");
        System.out.println("Data: "+formButton.getDate());
    }
}
