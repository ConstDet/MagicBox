public class Main {
    public static void main(String[] args) {
        int maxQuantity = 4;
        //стринги
        MagicBox<String> magicBox = new MagicBox<>(maxQuantity);
        magicBox.add("Petya");
        try {
            String rezString = magicBox.pick();//ошибка
        } catch (RuntimeException e) {
            System.out.println("Ошибка заполнения коробки: " + e);
        }
        for (int i = 0; i < maxQuantity; i++){
            if (!magicBox.add("Sasha " + i)) {
                break;
            }
        }
        System.out.println(magicBox.pick());
    }
}