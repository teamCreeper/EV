package com.evproject.ev.Controller;

import com.evproject.ev.DTO.InfoDTO;
import com.evproject.ev.Service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor //InfoService에 대한 멤버를 사용 가능하게함
public class TestController {

    private final InfoService infoService;

    @GetMapping("/index")
    public String index(Model model){
        List<InfoDTO> infoList = infoService.findAll();
        model.addAttribute("infoList", infoList);
        return "index";
    }

    @PostMapping("/index")
    public String save(@ModelAttribute InfoDTO infoDTO){
        infoService.save(infoDTO);
        return "redirect:/index";
    }
}