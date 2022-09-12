public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService(); // создали объект (переменная service с типом данных BmiService

        // double myImt = service.calculate (90, 180); // вызвали метод и положили результат в переменную myImt
        // System.out.println("ИМТ равен: " + myImt); // вывели результат на печать

        System.out.println(("ИМТ : ") + service.calculate(90, 180)); // сразу на печать фразу и результат


    }
}
