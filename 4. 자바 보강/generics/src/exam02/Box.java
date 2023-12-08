package exam02;

public class Box <T extends Fruit>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }
    public void PrintItem(){
        // T - > Object, 객체를 만드는 시점 -> 투입된 타입으로 형변환
        // T -> Fruit, 객체를 만드는 시점 -> 투입된 타입으로 형변환
        item.print();
    }
}
