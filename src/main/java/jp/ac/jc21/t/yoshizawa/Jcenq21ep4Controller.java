package jp.ac.jc21.t.yoshizawa;

import io.micronaut.http.annotation.*;

@Controller("/jcenq21ep4")
public class Jcenq21ep4Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}