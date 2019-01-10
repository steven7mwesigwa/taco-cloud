package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Steven Mwesigwa @steven7mwesigwa
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
