package edu.iesam.renfe.presentation;

import edu.iesam.renfe.data.TrainDataRepository;
import edu.iesam.renfe.data.TrainMemLocalDataSource;
import edu.iesam.renfe.domain.*;

public class TrainView {

    public static void add() {
        Train train = new Train("MD5-001", "9", "4","7", "220");
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        addTrainUseCase.execute(train);
    }

    public static void delete() {
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        deleteTrainUseCase.execute("MD5-001");
    }

    public static void get() {
        GetTrainUseCase getTrainUseCase = new GetTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        System.out.println(getTrainUseCase);
    }
}
