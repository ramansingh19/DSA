package OOPs.Problems;

public class Problem_02 {
    public static void main(String[] args) {
        final Cars cars = new ElectricCars();
        System.out.println(cars.drive());
    }
}

class Automobile {
    protected String drive() {   // changed from private → protected
        return "Driving Motorcycle";
    }
}

class Cars extends Automobile {
    @Override
    protected String drive() {
        return "Driving Car";
    }
}

class ElectricCars extends Cars {
    @Override
    public final String drive() {
        return "Driving Electric Car";
    }
}
