import java.io.BufferedReader;
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
	Path index = Paths.get("C://Users//lilieva//Desktop//tues_ip//index.html");
	//Path fourOfour = Paths.get("C://Users//lilieva//Desktop//tues_ip//404.html");
	

	public Response(PrintWriter out, Request req) {
		// TODO Auto-generated constructor stub
		this.out = out;
		this.req = req;
	}
		

	public void respond() {
	
		if (req.getMethod().equals("GET")){
					
				if(req.getResource().equals("/index.html")){
					out.println(req.getVersion());
					out.println("200 OK");
					out.println("Content-Type: text/html");
					out.println();
					
					 try {
				            Stream<String> lines = Files.lines(index);
				            lines.forEach(demo ->out.println(demo));
				            lines.close();
				        } catch (IOException ex) {}
				}else{
					out.println(req.getVersion());
					out.println("404 NOT FOUND");
					out.println("Content-Type: text/html");
				
					out.println();
					out.println("<html>");
					out.println("<head>");
					out.println("<tittle>Hello World</tittle>");
					out.println("</head>");
					out.println("<body>");
					out.println("<p>Hello World!I'm from 404.html</p>");
					out.println("</body>");
					out.println("</html>");	
					
				
				}
			}
				

	}
}
