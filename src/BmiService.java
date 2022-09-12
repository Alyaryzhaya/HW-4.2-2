public class BmiService {  //создали класс - появился новый тип данных

    public double calculate(int weight, double growth) {  //  создали метод с входящими папаметрами3

        double imt = weight / (growth / 100 * growth / 100); //  логика. вес : рост (м)  в квадрате


        double scale = Math.pow(10, 2);                      // округление до 2 знаков после зпт
        double resultImt = Math.ceil(imt * scale) / scale;


        return resultImt;
    }
}
