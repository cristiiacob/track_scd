package edu.utcluj.track.position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author radu.miron
 * @since 18.10.2016
 */
@Service
public class PositionService {
    @Autowired
    private PositionRepository positionRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Position savePosition(Position position) {
        position.setCreateTime(new Date(System.currentTimeMillis()));
        return positionRepository.save(position);
    }
}
