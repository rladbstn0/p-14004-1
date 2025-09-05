package com.back.domain.member.memberLog.eventListener

import com.back.domain.post.postComment.event.PostCommentWrittenEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class MemberLogEventListener() {
    @EventListener
    fun handle(event: PostCommentWrittenEvent){
        println("${event.actorDto.id}번 회원이 ${event.postDto.id}번 글에 ${event.postCommentDto.id}번 댓글을 작성했습니다.")
    }
}