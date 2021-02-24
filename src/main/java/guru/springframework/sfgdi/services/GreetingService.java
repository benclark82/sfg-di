package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/26/19.
 */
public interface GreetingService {

    @Autowired
    String sayGreeting();
}
