public class Todo {

    def id
    def done = false
    def description
	
	static void main(args) {
		def todos = [
			new Todo("Learn Groovy!!!"),
			new Todo("Learn AngularJS!!!")
		]		
		
		todos.each { todo ->
			println "${todo.description} ${todo.done}"
		}
	}
}
