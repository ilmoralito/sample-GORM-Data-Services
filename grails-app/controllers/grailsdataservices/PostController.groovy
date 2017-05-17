package grailsdataservices

import static org.springframework.http.HttpStatus.NOT_FOUND
import grails.validation.ValidationException
import groovy.transform.CompileStatic

class PostController {
    PostService postService

    def index() {
        respond postService.list()
    }

    def create() {
        respond new Post(params)
    }

    def save() {
        try {
            Post post = postService.save(params.title, params.body)

            flash.message = 'Post created'
            redirect post
        }
        catch(Exception e) {
            respond e.errors, view: 'create'
        }
    }

    def show() {
        respond postService.find(params.id)
    }

    def edit() {
        respond postService.find(params.id)
    }

    def update() {
        try {
            Post post = postService.update(params.id, params.title, params.body)

            if (!post) {
                notFound()
            }

            flash.message = 'Post updated'
            redirect post
        }
        catch(Exception e) {
            respond e.errors, view: 'edit'
        }
    }

    def delete() {
        Post post = postService.delete(params.id)

        if (!post) {
            notFound()
        } else {
            flash.message = 'Post deleted'
            redirect action: 'index', method: 'GET'
        }
    }

    protected notFound() {
        flash.message = 'Post not found'
        redirect action: 'index', status: NOT_FOUND
    }
}
