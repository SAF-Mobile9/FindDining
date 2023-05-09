package com.saf9.mobile.find_dining.repository;

import com.saf9.mobile.find_dining.dto.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository  extends CrudRepository<Comment, Long> {
}
