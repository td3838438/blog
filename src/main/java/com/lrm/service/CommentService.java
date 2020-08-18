package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

/**
 * @author mallooc
 * @version 1.0
 * @date 2020/8/11 11:51
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
