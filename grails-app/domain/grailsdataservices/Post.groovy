package grailsdataservices

class Post {
    String title
    String body

    static constraints = {
        title blank: false
        body blank: false
    }

    static hasMany = [comments: Comment]

    static mapping = {
        table 'posts'
        body type: 'text'
    }
}
