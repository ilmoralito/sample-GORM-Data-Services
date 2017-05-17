package grailsdataservices

import groovy.transform.CompileStatic
import grails.gorm.services.Service
import grails.gorm.services.Join

@Service(Post)
@CompileStatic
interface PostService {

    @Join('comments')
    Post find(Serializable id)

    List<Post> list(Map args)

    Post save(String title, String body)

    Post update(Serializable id, String title, String body)

    Post delete(Serializable id)
}
