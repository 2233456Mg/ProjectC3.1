package com.ciclo3.projectc3.Service;

import com.ciclo3.projectc3.Entities.Reservation;
import com.ciclo3.projectc3.Entities.Score;
import com.ciclo3.projectc3.Repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    private ScoreService scoreService;

    public List<Score> getAll(){
        return scoreService.getAll();
    }

    public Optional<Score> getScore(int id){
        return scoreService.getScore(id);
    }

    public Score save (Score score){
        if (score.getIdScore() == null){
            return scoreService.save(score);
        } else {
            Optional<Score> score1 = scoreService.getScore(score.getIdScore());
            if(score1.isPresent()){
                return scoreService.save(score);
            } else {
                return score;
            }
        }
    }
    
}
