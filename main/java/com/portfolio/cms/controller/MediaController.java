package com.portfolio.cms.controller;
import com.portfolio.cms.entity.Media;
import com.portfolio.cms.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/media")
public class MediaController {

    @Autowired
    private MediaService mediaService;

    // GET all media files
    @GetMapping
    public List<Media> getAllMedia() {
        return mediaService.getAllMedia();
    }

    // GET media by ID
    @GetMapping("/{id}")
    public Media getMediaById(@PathVariable Long id) {
        return mediaService.getMediaById(id);
    }

    // POST add media
    @PostMapping
    public Media addMedia(@RequestBody Media media) {
        return mediaService.addMedia(media);
    }

    // PUT update media
    @PutMapping("/{id}")
    public Media updateMedia(@PathVariable Long id, @RequestBody Media media) {
        return mediaService.updateMedia(id, media);
    }

    // DELETE media
    @DeleteMapping("/{id}")
    public void deleteMedia(@PathVariable Long id) {
        mediaService.deleteMedia(id);
    }
}
