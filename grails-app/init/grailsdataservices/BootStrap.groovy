package grailsdataservices

class BootStrap {

    def init = { servletContext ->
        new Post(
            title: 'Title number one',
            body: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ex sint exercitationem, soluta enim delectus quasi eos pariatur tenetur id magnam ipsum consequatur ducimus, sit placeat porro, eum sapiente! Ipsum, voluptas.'
        )
        .addToComments(new Comment(body: 'Lorem ipsum dolor sit amet olo'))
        .addToComments(new Comment(body: 'Lorem ipsum dolor sit amet ojo'))
        .addToComments(new Comment(body: 'Lorem ipsum dolor sit amet'))
        .save(failOnError: true)

        new Post(
            title: 'Title number two',
            body: 'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iure sit consequatur, officia at facilis illum nisi pariatur est cupiditate tempora dicta autem nihil accusantium excepturi atque in veritatis repudiandae quis?'
        )
        .addToComments(new Comment(body: 'Consectetur adipisicing elit'))
        .addToComments(new Comment(body: 'Consectetur adipisicing elit'))
        .addToComments(new Comment(body: 'Consectetur adipisicing elit'))
        .addToComments(new Comment(body: 'Consectetur adipisicing elit'))
        .addToComments(new Comment(body: 'Consectetur adipisicing elit'))
        .save failOnError: true
    }
    def destroy = {
    }
}
