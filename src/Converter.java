public class Converter {

    double convertToDistanseKm(int steps){
        return steps * 75 / 100000;
    }

    double convertToKKallories(int steps){
        return steps * 50 / 1000;
    }
}
