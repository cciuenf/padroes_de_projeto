public class Cliente {
    public static void main(String[] args) throws Exception {
        String factoryClass = "GnomeFactory";
        AbstractFactory factory = (AbstractFactory)
            Class.forName(factoryClass).newInstance();

        Label label = factory.createLabel();
        label.setText("Teste");
        label.show();

        Combo combo = factory.createCombo();
        combo.setOptions("Rio de Janeiro", "Espírito Santo", "São Paulo");
        combo.select("Rio de Janeiro");
        combo.show();
    }
}

