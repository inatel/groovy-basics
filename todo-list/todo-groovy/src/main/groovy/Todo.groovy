public class Todo {

    def id
    def done = false
    def description
	
	static void main(args) {
		def todos = [
			new Todo([description: "Learn Groovy!!!"]),
			new Todo([description: "Learn AngularJS!!!"])
		]		
		
		todos.each { todo ->
			println "${todo.description} ${todo.done}"
		}
	}
}
