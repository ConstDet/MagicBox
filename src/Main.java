public class Main {
    public static void main(String[] args) {
        int maxQuantity = 4;
        //стринги
        MagicBox<String> magicBox = new MagicBox<>(maxQuantity);
        magicBox.add("Petya");
        try {
            String resString = magicBox.pick();//ошибка
        } catch (RuntimeException e) {
            System.out.println("Ошибка заполнения коробки: " + e);
        }
        for (int i = 0; i < maxQuantity; i++){
            if (!magicBox.add("Sasha " + i)) {
                break;
            }
        }
        System.out.println(magicBox.pick());

        //инты
        MagicBox<Integer> magicBoxInt = new MagicBox<>(maxQuantity);
        magicBoxInt.add(100);
        try {
            int resInteger = magicBoxInt.pick();//ошибка
        } catch(RuntimeException e) {
            System.out.println("Ошибка заполнения коробки: " + e);
        }
        for (int i = 0; i < maxQuantity; i++) {
            if (!magicBoxInt.add(100 + i)) {
                break;
            }
        }
        System.out.println(magicBoxInt.pick());
    }
}