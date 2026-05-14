package edu.iesam.renfe.mock;

import edu.iesam.renfe.domain.Train;
import edu.iesam.renfe.domain.TrainRepository;

import java.util.ArrayList;

public class TrainMockRepository implements TrainRepository {
    @Override
    public void add(Train train) {

    }

    @Override
    public void delete(String trainId) {

    }

    @Override
    public ArrayList<Train> findAll() {
        return null;
    }
}
