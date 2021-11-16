package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsList {

    private final List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Toyota", 2010, 1500));
        list.add(new Car("Ford", 2012, 1420));
        list.add(new Car("Bugatti", 2015, 2500));
        list.add(new Car("Ferrari", 2011, 1800));
        list.add(new Car("Lamborghini", 2010, 1950));
    }

    public List<Car> select(String count){
        if (count == null) {
            return list;
        } else {
            return list.stream()
                    .limit(Integer.parseInt(count))
                    .collect(Collectors.toList());
        }
    }
}
