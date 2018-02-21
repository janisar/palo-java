package ee.ardel.paloserver.controller;

import ee.ardel.paloserver.model.Name;
import ee.ardel.paloserver.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static ee.ardel.paloserver.util.AsciiUtil.*;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    @Autowired
    private NameService nameService;

    @ResponseBody
    @RequestMapping(method = POST)
    public Integer saveName(@RequestParam(value = "firstName") String firstName,
                            @RequestParam(value = "lastName") String lastName) {
        if (isNotBlank(firstName) && isNotBlank(lastName)) {
            Name name = nameService.saveName(firstName, lastName);

            String fullName = name.getFullName();
            return countMaxConsecutiveZeros(intToBinaryString(calculateStringAsciiSum(fullName)));
        } else {
            throw new IllegalArgumentException("Names must not be null!");
        }
    }
}
