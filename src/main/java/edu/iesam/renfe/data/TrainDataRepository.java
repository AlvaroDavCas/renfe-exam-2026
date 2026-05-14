package edu.iesam.renfe.data;

import edu.iesam.renfe.domain.Train;
import edu.iesam.renfe.domain.TrainRepository;

public class TrainDataRepository implements TrainRepository {

    TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void add(Train train) {
        trainMemLocalDataSource.save(train);
    }

    @Override
    public void delete(String trainId) {
        trainMemLocalDataSource.delete(trainId);
    }
}
