package org.javaacademy.core.homework;

import java.math.BigDecimal;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        name = name.trim();
        name = name.toUpperCase();
        if (name.contains("ОВА ")) {
            System.out.printf("Уважаемая %s%n", name);
        } else if (name.contains("ОВ ")) {
            System.out.printf("Уважаемый %s%n", name);
        } else {
            System.out.println("Неизвестное лицо");
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        boolean isAllWheelWork = isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4;
        if (fuel >= 10
                && isEngineWork
                && isAllWheelWork
                && !hasErrors) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        //Работа на самостоятельное изучение функций класса String.
        //Заменить в строке 'this is' на 'those are',
        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replace("this is", "those are");
        int firstIndex = simply.indexOf('o');
        int secondIndex = simply.indexOf('o', firstIndex + 1);
        System.out.println(secondIndex);
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    public static void advanced() {
//        Задача №4
//        Компания Рога и Копыта производит мясные продукты.
//        Перечень производимых товаров :
//        Колбаса - стоимость(цена) 800 руб,
//        себестоимость при производстве меньше 1000 кг - 412руб,
//        себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
//        себестоимость при производстве от 2000 - 404 руб
//
//        Ветчина - стоимость 350 руб
//        себестоимость при производстве - 275 руб
//
//        Шейка - стоимость 500 руб
//        себестоимость при производстве меньше 500кг - 311 руб
//        себестоимость при производстве больше или равно 500кг - 299 руб
//
//        Финансовые показатели
//        Доход компании считается как умножение стоимости на количество проданных кг
//        Расход компании считается как умношение себестоимости на количество проданных кг + миллион рублей
//        Прибыль до налогов считается как: доход - расход
//        Налоги считаются так:
//         прибыль до налогов больше 2_000_000, облагается ставкой 13%
//         прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
//         прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
//        пример расчета налогов для прибыли до налогов 2_500_000:
//        1_000_000 - налог 80_000 - по ставке 8%
//        1_000_000 - налог 100_000 - по ставке 10%
//        500_000 - 65_000 - по ставке 13%
//        Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
//        Прибыль после налогов: прибыль до налогов - налог.
//
//        Необходимо создать универсальную систему расчетов прибыли после налогов,
//        Т.е на вход подаются данные по количеству произведенных продуктов
//         и печатается прибыль после налогов компании
//        Узнать прибыль после налогов, при продаже:
//        Колбасы 2000кг - это произведено и продано
//        Ветчины 8511кг - это произведено и продано
//        Шейки 6988кг - это произведено и продано
        BigDecimal sausageProduced = new BigDecimal("2000");
        BigDecimal hamProduced = new BigDecimal("8511");
        BigDecimal neckProduced = new BigDecimal("6988");

        BigDecimal sausagePrice = new BigDecimal("800");
        BigDecimal hamPrice = new BigDecimal("350");
        BigDecimal neckPrice = new BigDecimal("500");
        //себестоимость сосисок
        BigDecimal sausageCost;
        if (sausageProduced.compareTo(new BigDecimal("1000")) < 0) {
            sausageCost = new BigDecimal("412");
        } else if (sausageProduced.compareTo(new BigDecimal("2000")) < 0) {
            sausageCost = new BigDecimal("408");
        } else {
            sausageCost = new BigDecimal("404");
        }
        //себестоимость ветчины
        BigDecimal hamCost = new BigDecimal("275");
        //себестоимость шейки
        BigDecimal neckCost;
        if (neckProduced.compareTo(new BigDecimal("500")) < 0) {
            neckCost = new BigDecimal("311");
        } else {
            neckCost = new BigDecimal("299");
        }
        //считаем доход с каждой позиции
        BigDecimal sausageIncome = sausagePrice.subtract(sausageCost).multiply(sausageProduced);
        BigDecimal hamIncome = hamPrice.subtract(hamCost).multiply(hamProduced);
        BigDecimal neckIncome = neckPrice.subtract(neckCost).multiply(neckProduced);
        //общий доход
        BigDecimal income = sausageIncome.add(hamIncome).add(neckIncome);
        System.out.println("Прибыль до налогов: " + income);
        BigDecimal million = new BigDecimal("1000000");
        BigDecimal[] percents = {new BigDecimal("0.08"), new BigDecimal("0.10"), new BigDecimal("0.13")};
        BigDecimal tax = BigDecimal.ZERO;
        BigDecimal incomeForCalculate = new BigDecimal(String.valueOf(income));

        for (int i = 0; i < percents.length; i++) {
            if (incomeForCalculate.compareTo(million) > 0) {
                tax = tax.add(million.multiply(percents[i]));
                incomeForCalculate = incomeForCalculate.subtract(million);
            } else {
                tax = tax.add(incomeForCalculate.multiply(percents[i]));
            }
        }

        System.out.println("Налог: " + tax);
        System.out.println("Прибыль после налогов: " + income.subtract(tax));
    }
}
