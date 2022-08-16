package co.develhope.firstApi03;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class StringController {

    @Nullable
    @GetMapping("/strings")
    public String getConcat(String param1, String param2){
         param1 = "mia";
         param2 = "mamma";
        return "the concatenation is:" + param1.concat(param2);
    }

    @Nullable
    @GetMapping("/secondCase")
    public String getOnlyOneString(String param1, String param2){
        param1 = "mia";
        return "the string is" + param1;
    }


}
