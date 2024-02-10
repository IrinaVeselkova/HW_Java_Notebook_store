public class Notbooks {
    int RAM; // Oперативная память (ОЗУ)
    int HDD; // объем жесткого диска
    String TradeMark; //Марка
    String OpSystem; //Операционная система
    String Colour; //Цвет
    double Price; //Стоимость
    double Rating; //Рейтинг по 5-бальной шкале


    @Override
    public String toString() {
        return "Марка ноутбука: " + TradeMark
                + "\nОперативная память: " + RAM +" GB"
                + "\nОбъем жесткого диска: " + HDD +" GB"
                + "\nОперационная система: " + OpSystem
                + "\nЦвет: " + Colour
                + "\nЦена: " + Price + " руб."
                + "\nРейтинг покупателей: " + Rating;
    }
}
