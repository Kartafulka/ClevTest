package main.java.ru.clevertec.check;
// java -cp src path
// id-quantity
// discountCard=xxxx
// balanceDebitCard=xxxx

import java.util.ArrayList;

public class CheckRunner {

    public static void main(String[] args) {
        if (args.length > 0) {
            ArrayList<String> products = new ArrayList<>();
            int balanceDebitCard=0, discountCard=0;
            for (String i : args) {
                //System.out.println(i);
                if (i.contains("-") && !i.startsWith("-")) {
                    products.add(i);
                } else if (i.contains("discountCard=")) {
                    discountCard = Integer.parseInt(i.replace("discountCard=", ""));
                } else if (i.contains("balanceDebitCard=")) {
                    balanceDebitCard = Integer.parseInt(i.replace("balanceDebitCard=", ""));
                }
            }
            ///TODO раскидать значения в классы последующей логики
            System.out.println("Полученные значения: ");
            System.out.println("продукты: ");
            for (String s : products) {
                System.out.println(s);
            }
            System.out.println("скидочная: " + discountCard);
            System.out.println("баланс: " + balanceDebitCard);
        } else {
            System.out.println("значений не передано");
        }
    }
}
