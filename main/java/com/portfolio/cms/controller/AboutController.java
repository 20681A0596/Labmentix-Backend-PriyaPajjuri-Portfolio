package com.portfolio.cms.controller;
import com.portfolio.cms.entity.About;
import com.portfolio.cms.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("api/about")
public class AboutController {
    @Autowired private AboutService service;

    @GetMapping
    public List<About> getAll() { return service.getAll(); }

    @PostMapping
    public About add(@RequestBody About about) { return service.save(about); }
}