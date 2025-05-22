package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository repository;

    public FruitServiceImpl(FruitRepository repository) {
        this.repository = repository;
    }

    @Override
    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        if (!repository.existsById(fruit.getId())) {
            throw new FruitNotFoundException("Fruit with ID " + fruit.getId() + " not found.");
        }
        return repository.save(fruit);
    }

    @Override
    public void deleteFruit(int id) {
        if (!repository.existsById(id)) {
            throw new FruitNotFoundException("Fruit with ID " + id + " not found.");
        }
        repository.deleteById(id);
    }

    @Override
    public Fruit getFruitById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit with ID " + id + " not found."));
    }

    @Override
    public List<Fruit> getAllFruits() {
        return repository.findAll();
    }
}
