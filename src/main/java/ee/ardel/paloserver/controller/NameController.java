package ee.ardel.paloserver.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static ee.ardel.paloserver.util.AsciiUtil.calculateStringAsciiSum;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    @ResponseBody
    @RequestMapping(method = POST)
    public Integer saveName(@RequestParam(value = "name") String name) {
        if (name != null && StringUtils.isNotBlank(name)) {

            return calculateStringAsciiSum(name);
        } else {
            throw new IllegalArgumentException("Name must not be null!");
        }
    }
}
