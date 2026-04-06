package com.example.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.blog.domain.entities.Tag;
import java.util.UUID;

public interface TagRepository extends JpaRepository<Tag, UUID> {


}
