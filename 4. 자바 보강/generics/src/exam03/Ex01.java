package exam03;

import exam02.Fruit;

public class Ex01 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox =new FruitBox<>();
        appleBox.add(new Apple()); // Apple,Fruit,Object 만 가능
        appleBox.add(new Apple());

        Juicier.make(appleBox);

        FruitBox<Fruit> pearBox = new FruitBox<>();
        pearBox.add(new Pear());
        pearBox.add(new Pear());

        Juicier.make(pearBox);

    }
}
