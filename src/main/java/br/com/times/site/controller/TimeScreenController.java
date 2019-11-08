package br.com.times.site.controller;

import br.com.times.site.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("time-screen")
public class TimeScreenController {

    @Autowired private TimeService timeService;

    @GetMapping("{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        var time = timeService.findOne(id).get();
        model.addAttribute("time", time);
        return "time";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("timeList", timeService.findAll());
        return "times";
    }
}
