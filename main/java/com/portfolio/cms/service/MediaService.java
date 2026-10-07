package com.portfolio.cms.service;
import com.portfolio.cms.entity.Media;
import com.portfolio.cms.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {

    @Autowired
    private MediaRepository mediaRepository;

    // Get all media files
    public List<Media> getAllMedia() {
        return mediaRepository.findAll();
    }

    // Get media by ID
    public Media getMediaById(Long id) {
        return mediaRepository.findById(id).orElse(null);
    }

    // Add new media
    public Media addMedia(Media media) {
        return mediaRepository.save(media);
    }

    // Update media
    public Media updateMedia(Long id, Media media) {
        media.setId(id);
        return mediaRepository.save(media);
    }

    // Delete media
    public void deleteMedia(Long id) {
        mediaRepository.deleteById(id);
    }
}