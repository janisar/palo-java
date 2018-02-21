package ee.ardel.paloserver.impl;

import ee.ardel.paloserver.dao.NameRepository;
import ee.ardel.paloserver.model.Name;
import ee.ardel.paloserver.service.impl.NameServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class NameServiceImplTest {

    @Mock
    private NameRepository nameRepository;

    @InjectMocks
    private NameServiceImpl nameService;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void shouldSaveName() {
        String firstName = "name";
        String lastName = "lastName";
        ArgumentCaptor<Name> nameArgumentCaptor = ArgumentCaptor.forClass(Name.class);

        Name name = nameService.saveName(firstName, lastName);

        verify(nameRepository).save(nameArgumentCaptor.capture());
        Name savedName = nameArgumentCaptor.getValue();

        assertEquals(savedName.getFirstName(), firstName);
        assertEquals(savedName.getLastName(), lastName);

        assertNotNull(name.getId());
    }
}