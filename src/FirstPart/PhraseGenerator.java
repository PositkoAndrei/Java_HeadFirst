package FirstPart;

public class PhraseGenerator {

    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "трех - званный", "30000 - футовый", "взаимный", "обоюдный выигрыш", "фронтенд", "на основе веб - технологий", "проникающий", "умный", "шесть сигм", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец", "пункт следования"};

        //Сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int theeLength = wordListThree.length;

        //Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * theeLength);

        //Теперь строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " +
                wordListThree[rand3];

        //Выводим фразу на экран
        System.out.println("Все, что нам нужно, - это " + phrase);
    }
}
