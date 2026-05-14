package edu.iesam.renfe.domain;

import java.util.ArrayList;

public interface TrainRepository {

    void add(Train train);
    void delete(String trainId);
    ArrayList<Train> findAll();
}
