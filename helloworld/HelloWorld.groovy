public class HelloWorld {
	public static void main(String[] args) {
		args.each { name ->
			println name
			new File(name + '.txt').text = "Xurupitas"
		}
    }
}