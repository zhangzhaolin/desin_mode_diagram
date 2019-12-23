interface Mediator {
    notify(sender: Component, event: String);
}

class ConcreteMediator implements Mediator {

    notify(sender: Component, event: String) {

    }

}

class Component {
    private dialog: Mediator;

    public Component(dialog: Mediator) {
        this.dialog = dialog;
    }


    public setDialog(value: Mediator) {
        this.dialog = value;
    }
}