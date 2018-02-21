package ee.ardel.paloserver.service;

import ee.ardel.paloserver.model.Name;
import org.springframework.stereotype.Service;

@Service
public interface NameService {

    Name saveName(String firstName, String lastName);
}
