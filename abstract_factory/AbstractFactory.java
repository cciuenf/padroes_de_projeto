interface Label {
    void setText(String text);
    void show();
}

interface Combo {
    void setOptions(String... options);
    void select(String option);
    void show();
}

class GnomeLabel implements Label {
    private String text;
    public void setText(String text) {
        this.text = text;
    }
    public void show() {
        System.out.println(text + " em um label Gnome");
    }
}

class GnomeCombo implements Combo {
    private String[] options;
    private String selected;

    public void setOptions(String... options) {
        this.options = options;
    }
    public void select(String option) {
        this.selected = option;
    }
    public void show() {
        System.out.println("Selecionado " + selected + " em um combo Gnome");
    }
}


interface AbstractFactory {
    Label createLabel();
    Combo createCombo();
}

class GnomeFactory implements AbstractFactory {
    public Label createLabel() {
        return new GnomeLabel();
    }

    public Combo createCombo() {
        return new GnomeCombo();
    }
}

