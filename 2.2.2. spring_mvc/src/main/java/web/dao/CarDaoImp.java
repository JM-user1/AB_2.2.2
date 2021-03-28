package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<Car> getCars(@RequestParam(value = "count", required = false) int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
