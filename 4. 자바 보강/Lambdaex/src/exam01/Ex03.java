package exam01;

public class Ex03 {
    public static void main(String[] args) {
       // Calculator cal = (int num) -> num * num;
        Calculator cal = x ->  x * x;



        int result = cal.square(10);
        System.out.println(result);

    }
}


    /*
    public static void main(String[] args) {
        Calculator cal = new Calculator() {
            public int square(int num){
                return num * num;
            }
        };
    }
}*/

