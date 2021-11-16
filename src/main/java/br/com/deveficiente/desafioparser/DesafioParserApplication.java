package br.com.deveficiente.desafioparser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioParserApplication {

	public static void main(String[] args) throws URISyntaxException, IOException {
		Path arquivoMarkdown = Paths.get(DesafioParserApplication.class
				.getResource("/arquivo.md").toURI());
		
		List<String> inputLines = Files.readAllLines(arquivoMarkdown);
		
		System.out.println(inputLines);

	}

}
