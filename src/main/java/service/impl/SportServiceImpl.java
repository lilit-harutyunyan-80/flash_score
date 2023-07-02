package service.impl;


import lombok.RequiredArgsConstructor;
import model.Sport;
import org.springframework.stereotype.Service;
import repository.SportRepository;
import service.SportService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class SportServiceImpl implements SportService {
    private final SportRepository sportRepository;

    @Override
    public List<Sport> getEightSport() {
        return sportRepository.findTop8ByOrderById();
    }

    @Override
    public List<Sport> getAllSport() {
        return sportRepository.findAll();
    }

    @Override
    public List<Sport> getSportByName(String name) {
        return sportRepository.findAllBySportNames(name);
    }

}

