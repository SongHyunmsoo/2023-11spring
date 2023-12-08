package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItme(new Apple()); //1. 형변환의 번거로움

        Object obj = box.getItme();

        if(obj instanceof Pear){ // 2. 타입 안정성이 떨어진다.
            Pear pear = (Pear) box.getItme();
        }

    }
}
