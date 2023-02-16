import java.util.Random;

public class MagicBox<T> {
    int quantity;
    T[] arrayItem;//сама коробка
    public MagicBox(int quantity) {
        this.quantity = quantity;
        arrayItem = (T[]) new Object[quantity];
    }

    public boolean add(T item) {
        for (int i = 0; i < arrayItem.length; i++) {
            if (arrayItem[i] == null) {
                arrayItem[i] = item;
                return true;
            }
        }
        return false;//коробка полна, сообщаем и выходим
    }

    public T pick() {
        int count = 0;
        for (int i = 0; i < arrayItem.length; i++) {
            if (arrayItem[i] == null) {
                count++;
            }
        }
        if (count != 0) {
            throw new RuntimeException("Волшебная коробка не заполнена. Осталось мест: " + count);
        }
        Random random = new Random();
        return arrayItem[random.nextInt(quantity)];
    }
}
