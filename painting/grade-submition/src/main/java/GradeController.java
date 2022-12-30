import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    
    @GetMapping("/hello")
    public String getForm() {
        return "somehtmlView";
    }
}
