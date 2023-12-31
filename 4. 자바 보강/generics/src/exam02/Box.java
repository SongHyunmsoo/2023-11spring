package exam02;

public class Box <T extends Fruit>{
    private T item; // Object


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

    public <T> void testMethod(T t) { // 지네릭 메서드 - 메서드가 호출 될때 타입이 결정됨

    }
}
