package csorba.norberth.lab2;

import csorba.norberth.lab1.encapsulation.FileReaderService;
import csorba.norberth.lab1.encapsulation.IReaderService;
import csorba.norberth.lab2.adapter.CarPartInterpreter;
import csorba.norberth.lab2.adapter.ICarPartInterpreter;
import csorba.norberth.lab2.models.CarPart;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        adapter();
    }

    private static void adapter() {
        IReaderService readerService = new FileReaderService();
        ICarPartInterpreter carPartInterpreter = new CarPartInterpreter();
        try {
            List<CarPart> carParts = carPartInterpreter
                    .interpretCarParts(readerService.read("src\\main\\java\\csorba\\norberth\\lab2\\carparts.txt"));
            carParts.forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
