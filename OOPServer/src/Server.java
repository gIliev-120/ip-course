import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Server {
	private static final String CLOSE_COMMAND = "CLOSE";
	private static final int PORT = 4444;

	public static void main(String[] args) throws IOException {
		boolean closing = false;
		// create socket
		try (ServerSocket serverSocket = new ServerSocket(PORT)) {
			System.out.println("Started server on port " + PORT);
			// repeatedly wait for connections, and process
			while (!closing) {
				// a "blocking" call which waits until a connection is requested
				try (Socket clientSocket = serverSocket.accept()) {
					System.out.println("Accepted connection from client: "
							+ clientSocket);
					// open up IO streams
					InputStream inStream = clientSocket.getInputStream();
					OutputStream outStream = clientSocket.getOutputStream();
					try (BufferedReader in = new BufferedReader(
							new InputStreamReader(inStream));
							PrintWriter out = new PrintWriter(outStream, true);) {
						// waits for data and reads it in until connection dies
						// readLine() blocks until the server receives a new
						// line
						// from client
						String s;
						List<String>asd = new ArrayList<String>();
						while(true){
							s = in.readLine();
							try{
								if(s.equals("")){
									break;
								}
								asd.add(s);
							}catch(Exception e) {
								// TODO: handle exception
							}
						}
						
							Request req = RequestParser.parse(asd);
							Response res = new Response(out,req);
							res.respond();
						}
					}
				}
			}
		}
	}

