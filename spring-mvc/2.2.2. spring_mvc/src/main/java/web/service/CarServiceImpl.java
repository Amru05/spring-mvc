package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> cars;

    public CarServiceImpl(List<Car> cars) {
        this.cars = cars;
    }

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Volvo", 90, 10000));
        cars.add(new Car("Opel", 100, 5000));
        cars.add(new Car("BMW", 6, 12000));
        cars.add(new Car("Lada", 14, 500));
        cars.add(new Car("Gaz", 21, 900));

    }

    @Override
    public List<Car> getCars(int count) {
        if (count>=5){
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
