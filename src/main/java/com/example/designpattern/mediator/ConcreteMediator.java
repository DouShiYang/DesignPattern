package com.example.designpattern.mediator;

/**
 * 具体中介者
 * @author jianyang
 */
public class ConcreteMediator extends Mediator{

    /**
     * 维持对各个同事对象的饮用
     */
    public Button addButton;

    public ListButton listButton;

    public TextBox textBox;

    public Combobox comobox;


    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public ListButton getListButton() {
        return listButton;
    }

    public void setListButton(ListButton listButton) {
        this.listButton = listButton;
    }

    public TextBox getTextBox() {
        return textBox;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }

    public Combobox getComobox() {
        return comobox;
    }

    public void setComobox(Combobox comobox) {
        this.comobox = comobox;
    }

    @Override
    void compenentChanged(Component component) {

        if(component==addButton){
            System.out.println("---单击增加按钮-----");
            listButton.update();
            textBox.update();
            comobox.update();
        }

        //从列表框中选择客户
        if(component==listButton){
            System.out.println("---从列表框中选择客户----");
            addButton.update();
            textBox.update();
            comobox.update();
        }

        //从组合框中选择客户
        if(component==comobox){
            System.out.println("---单击增加按钮");
            listButton.update();
            textBox.update();
            addButton.update();
        }
    }
}
