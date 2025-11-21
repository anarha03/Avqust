package CoffeeShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Order> orders = new HashMap<>();
        ArrayList<Coffee> coffees = new ArrayList<>();
        ArrayList<Sweet> sweets = new ArrayList<>();
        while (true) {
            System.out.println("\n--- SISTEM MENYU ---");
            System.out.println("1. Yeni masa sifariş etsin");
            System.out.println("2. Admin masaları yoxlasın");
            System.out.println("3. Çıxış");
            System.out.print("Seçiminiz: ");
            int secim = sc.nextInt();

            switch (secim) {
                case 1: {
                    System.out.println("Masa nomresini daxil edin:");
                    int masa = sc.nextInt();
                    Order order = new Order(masa, 0, 0, 0);
                    masaSifarisi(order);
                    orders.put(masa, order);
break;
                }
                case 2:{
                    System.out.print("Hansı masa nömrəsini yoxlamaq istəyirsiniz? ");
                    int masa = sc.nextInt();

                    if (orders.containsKey(masa)) {
                        Order order = orders.get(masa);
                        System.out.println("\n--- Masa " + masa + " ---");
                        if (!order.coffees.isEmpty()) listOfCoffees(order.coffees);
                        if (!order.sweets.isEmpty()) listOfSweets(order.sweets);
                        System.out.println("Ümumi hesab: " + order.totalPrice + " AZN");
                        System.out.println("Kalori: " + order.calory + " kcal");
                    } else {
                        System.out.println("Bu masa üçün hələ sifariş yoxdur.");
                    }
                    break;
                }
                case 3:return;
            }


            }

    }
    public static void masaSifarisi(Order order){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("\n--- COFFEE SHOP MENU ---");
            System.out.println("1. Sifaris et");
            System.out.println("2. Umumi hesabi goster");
            System.out.println("3. Hesab iste");
            System.out.println("4. Cixis");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1: {
                    sifaris(order);
                    break;
                }
                case 2: {
                    if (order.totalPrice == 0) {
                        System.out.println(order.number + " nomreli masada heleki sifaris yoxdur.");
                    } else {
                        System.out.println(order.number + " nomreli masanin sifarisleri ve umumi hesab:");
                        if (!order.coffees.isEmpty()) {
                            listOfCoffees(order.coffees);
                        }
                        if (!order.sweets.isEmpty()) {
                            listOfSweets(order.sweets);
                        }
                        System.out.println("Umumi hesab: " + order.totalPrice + " AZN");
                    }
                    break;
                }
                case 3: {
                    if (order.totalPrice == 0) {
                        System.out.println(order.number + " nomreli masada helesi sifaris yoxdur.");
                    } else {
                        System.out.println(order.number + " nomreli masanin sifarisleri ve umumi hesab:");
                        if (!order.coffees.isEmpty()) {
                            listOfCoffees(order.coffees);
                        }
                        if (!order.sweets.isEmpty()) {
                            listOfSweets(order.sweets);
                        }
                        System.out.println("Umumi hesab: " + order.totalPrice + " AZN");
                    }
                    System.out.println("Tesekkur edirik!!!");
                    break;

                }

                case 4: {
                    return;
                }
            }
        }
    }
    public static void sifaris(Order order) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n--- MENU ---");
            System.out.println("--- COFFEES ---");
            System.out.println("1. Espresso - 3.5 AZN");
            System.out.println("2. Americano - 4.0 AZN");
            System.out.println("3. Latte - 4.2 AZN");
            System.out.println("--- SWEETS ---");
            System.out.println("4. Cheescake - 5.0 AZN");
            System.out.println("5. Tiramisu - 4.8 AZN");
            System.out.println("6. Croissant - 3.0 AZN");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int secim = sc.nextInt();
            sc.nextLine();
            switch (secim) {
                case 0: {
                    return;
                }
                case 1: {
                    order.coffees.add(new Coffee("Espresso", 3.5, "Tund ve qati qehve"));
                    order.totalPrice += 3.5;
                    break;
                }
                case 2: {
                    order.coffees.add(new Coffee("Americano", 4.0, "Yumşaq və filtr qəhvə"));
                    order.totalPrice += 4.0;
                    break;
                }
                case 3: {
                    order.coffees.add(new Coffee("Latte", 4.2, "Süd və qəhvə qarışığı, yüngül dad"));
                    order.totalPrice += 4.2;
                    break;
                }
                case 4: {
                    order.sweets.add(new Sweet("Cheescake", 5.0, 320, "Kremli pendir tortu"));
                    order.totalPrice += 5.0;
                    order.calory += 320;
                    break;
                }
                case 5: {
                    order.sweets.add(new Sweet("Tiramisu", 4.8, 290, "Qəhvə dadlı italyan deserti"));
                    order.totalPrice += 4.8;
                    order.calory += 290;
                    break;
                }
                case 6: {
                    order.sweets.add(new Sweet("Croissant", 3.0, 260, "Yagli fransiz bulkasi"));
                    order.totalPrice += 3.0;
                    order.calory += 260;
                    break;
                }
            }
            order.table++;
        }
    }

    public static void listOfCoffees(ArrayList<Coffee> coffees) {
        for (Coffee coffee : coffees) {
            System.out.println(coffee.name + " - " + coffee.price + " AZN");
        }
    }

    public static void listOfSweets(ArrayList<Sweet> sweets) {
        for (Sweet sweet : sweets) {
            System.out.println(sweet.name + " - " + sweet.price + " AZN");
        }
    }
}






        /*Map<String, ArrayList<Integer>> studentMap = new HashMap<>();

        while (true) {
            System.out.println("\n--- Student Score Manager ---");
            System.out.println("1. Add student score");
            System.out.println("2. Calculate average score");
            System.out.println("3. Find top student");
            System.out.println("4. Show all students and scores");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int secim = sc.nextInt();
            sc.nextLine();
                switch (secim) {
                    case 1: {
                        addElement(studentMap);break;
                    }
                    case 2: {
                        ortalamaBallar(studentMap);break;
                    }
                    case 3: {
                        findTopStudent(studentMap);break;
                    }
                    case 4: {
                        objectler(studentMap);break;
                    }
                    case 5: {
                        return;
                    }
                    default:
                        System.out.println("Bu eded olmaz aq");
                }
        }

    }

    public static void addElement(Map<String, ArrayList<Integer>> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Telebenin adini daxil edin:");
        String name = sc.nextLine();
        System.out.println("Telebenin ballarini daxil edin:");
        System.out.print("1: ");
        int bal1 = sc.nextInt();
        System.out.print("2: ");
        int bal2 = sc.nextInt();
        System.out.print("3: ");
        int bal3 = sc.nextInt();
        System.out.print("4: ");
        int bal4 = sc.nextInt();
        ArrayList<Integer> telebeBallari = new ArrayList<>();
        telebeBallari.add(bal1);
        telebeBallari.add(bal2);
        telebeBallari.add(bal3);
        telebeBallari.add(bal4);

        map.putIfAbsent(name, telebeBallari);
    }

    public static void ortalamaBallar(Map<String, ArrayList<Integer>> map) {
        System.out.println("Ortalamasini hesablamag istediyin telebenin adini daxil et:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        ArrayList<Integer> scores = map.get(name);
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("Ortalama bal: " + (sum / scores.size()));
    }
    public static void findTopStudent(Map<String, ArrayList<Integer>> maps){
        double highestAvg=0.0;
        String name =null;
        for (Map.Entry<String, ArrayList<Integer>>map: maps.entrySet()){
            ArrayList<Integer> scores =map.getValue();
            double sum = 0;
            for (int score : scores) {
                sum += score;
            }double average=sum / scores.size();
            if (average>highestAvg){
                highestAvg=average;
                name= map.getKey();
            }
        }
        System.out.println("Top student: " + name + " with average score: " + highestAvg);
    }

    public static void objectler(Map<String, ArrayList<Integer>> maps) {
        for (Map.Entry<String, ArrayList<Integer>>map: maps.entrySet()){
            ArrayList<Integer> scores =map.getValue();
            double sum = 0;
            for (int score : scores) {
                sum += score;
            }
            System.out.println(map.getKey()+"'s points-"+map.getValue());
            System.out.println(map.getKey()+"'s average point-"+(sum/scores.size()));
        }*/




