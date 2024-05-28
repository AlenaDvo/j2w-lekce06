package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 *
 */
@Controller
@RequestMapping("/cokolada")
public class CokoladaController {

    private final Random random = new Random();
    @GetMapping("")
    public Object index() {
        ModelAndView view = new ModelAndView("/cokolada/formular");
        view.addObject("form", new CokoladaForm());
        return view;
    }

    @PostMapping("")
    public Object objednavka(@Valid @ModelAttribute("form") CokoladaForm form, BindingResult bindingResult) {
//        tohle to tam predulozi form form
        if (bindingResult.hasErrors()) {
            return "/cokolada/formular";
        }
        return new ModelAndView("/cokolada/objednano")
                .addObject("kod", Math.abs(random.nextInt()))
                .addObject("email", form.getEmail());
//        return "/cokolada/formular";
    }
}