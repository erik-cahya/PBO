public class Rumus extends utsMain {

    final double kelvin = 273.15; // konstanta

    void konversiCelcius(Float c) {

        double k = c + kelvin;
        double f = (c * 1.8) + 32;
        double r = c * 0.8;

        System.out.println("C = " + c + "\nK = " + k + "\nF = " + f + "\nR = " + r);
    }

    void konversiReamur(Float r) {
        double k = r / 0.8 + kelvin;
        double f = (r * 2.25) + 32;
        double c = r / 0.8;
        System.out.println("C = " + c + "\nK = " + k + "\nF = " + f + "\nR = " + r);
    }

    void konversiFarenheit(Float f) {
        double k = (f + 459.67) / 1.8;
        double r = (f - 32) / 1.8;
        double c = (f - 32) / 1.8;
        System.out.println("C = " + c + "\nK = " + k + "\nF = " + f + "\nR = " + r);
    }

    void konversiKelvin(Float k) {
        double f = (k * 1.8) - 459.67;
        double r = (k - kelvin) * 0.8;
        double c = k - kelvin;
        System.out.println("C = " + c + "\nK = " + k + "\nF = " + f + "\nR = " + r);
    }

}
