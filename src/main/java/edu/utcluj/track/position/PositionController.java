package edu.utcluj.track.position;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author radu.miron
 * @since 18.10.2016
 */
@RestController
@RequestMapping(value = "/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @RequestMapping(method = RequestMethod.POST)
    public Position save(@RequestBody Position position) {
        return positionService.savePosition(position);
    }

    @RequestMapping(method = RequestMethod.GET)
    public void test() {
        System.out.println("whatever");
    }
}
