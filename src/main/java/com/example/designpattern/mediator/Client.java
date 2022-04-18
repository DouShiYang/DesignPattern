package com.example.designpattern.mediator;

public class Client {


    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();


        //定义同事对象

        Button button = new Button();
        ListButton listButton = new ListButton();
        Combobox combobox = new Combobox();
        TextBox textBox = new TextBox();

        button.setMediator(mediator);
        listButton.setMediator(mediator);
        combobox.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.setAddButton(button);
        mediator.setListButton(listButton);
        mediator.setComobox(combobox);
        mediator.setTextBox(textBox);


        button.changed();
        System.out.println("---------------");


    }
}
