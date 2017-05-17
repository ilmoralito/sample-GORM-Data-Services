package grailsdataservices

class Comment {
    String body
    Date dateCreated
    Date lastUpdated

    static constraints = {
        body blank: false
    }

    static belongsTo = [post: Post]

    static mapping = {
        body type: 'text'
    }
}
