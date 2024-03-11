package web.CarService;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> car = new ArrayList<>();

        car.add(new Car("Toyota Camry", "Silver", 2021));
        car.add(new Car("BMW", "Black", 2022));
        car.add(new Car("Honda Civic", "Red", 2020));
        car.add(new Car("Ford Mustang", "Blue", 2019));
        car.add(new Car("Mercedes-Benz E-Class", " White", 2023));

        if (count != null && count >= 1 && count < 5) {
            return car.subList(0, count);
        }
        return car;
    }
}
