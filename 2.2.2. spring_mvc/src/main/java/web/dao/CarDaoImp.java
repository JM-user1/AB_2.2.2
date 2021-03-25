package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{

    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Antony Stark","Audi e-tron", 825656));
        cars.add(new Car("Ivan Rudsky","BWM", 575848));
        cars.add(new Car("Evgeny Petrov","Toyota", 423423));
        cars.add(new Car("Petr Klimov","Lada", 356824));
        cars.add(new Car("Dmitry Borovkski","Mersedes", 223432));
    }
    @Override
    public List<Car> getCars(int car) {
        if (car > 5) {
            return cars.subList(0, cars.size());
        } else {
            return cars.subList(0, car);
        }
    }
}
