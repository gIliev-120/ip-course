import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Response {
	private PrintWriter out;
	private Request req;
	String workingDir = System.getProperty("user.dir");


	public Response(PrintWriter out, Request req) {
		// TODO Auto-generated constructor stub
		this.out = out;
		this.req = req;
	}

	public void pageNotFound() {
		out.print(req.getVersion() + " 404 NOT FOUND");
		out.println("Content-Type: text/html");
		out.println();
		out.println("<html>"
				+ "<head>"
				+ "<title>SORRY :C</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>SORRY PAGE NOT FOUND</h1>"
				+ "</body>"
				+ "</html>");

	}

	public void respond() {
		Path filePath = Paths.get(workingDir + req.getResource());
		System.out.println(filePath.toString());
		if (req.getMethod().equals("GET")) {

			try {
				Stream<String> lines = Files.lines(filePath);

				out.println(req.getVersion() + " 200 OK");
				out.println("Content-Type: text/html");
				out.println();

				lines.forEach(text -> out.println(text));
				lines.close();
			} catch (IOException ex) {
				pageNotFound();
			}
		}
	}
}
