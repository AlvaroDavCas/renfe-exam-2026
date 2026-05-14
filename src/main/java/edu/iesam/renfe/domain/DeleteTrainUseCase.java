package edu.iesam.renfe.domain;

public class DeleteTrainUseCase {

    TrainRepository trainRepository;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(String trainId){
       trainRepository.delete(trainId);
    }
}
