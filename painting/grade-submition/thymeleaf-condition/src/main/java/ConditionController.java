import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConditionController {
    
    @GetMapping(value = "/con")
    public String getMethodName(Model model) {
        model.addAttribute("sales", 150);
        return "conditions";
    }

}
