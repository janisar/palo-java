package ee.ardel.paloserver.service.impl;


import ee.ardel.paloserver.dao.NameRepository;
import ee.ardel.paloserver.model.Name;
import ee.ardel.paloserver.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NameServiceImpl implements NameService {

    @Autowired
    private NameRepository nameRepository;

    @Override
    public Name saveName(String firstName, String lastName) {
        Name name = Name.newBuilder()
                .firstName(firstName)
                .lastName(lastName)
                .build();
        return nameRepository.save(name);
    }
}
