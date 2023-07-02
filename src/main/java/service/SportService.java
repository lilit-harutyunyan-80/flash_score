package service;
import model.Sport;


import java.util.List;


public interface SportService {

    List<Sport> getEightSport();
    List<Sport> getAllSport();

    List<Sport> getSportByName(String name);

}
