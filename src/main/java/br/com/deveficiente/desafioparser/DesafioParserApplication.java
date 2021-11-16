package br.com.deveficiente.desafioparser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DesafioParserApplication {

	public static void main(String[] args) throws URISyntaxException, IOException {
		Path arquivoMarkdown = Paths.get(DesafioParserApplication.class
				.getResource("/arquivo.md").toURI());
		
		List<String> inputLines = Files.readAllLines(arquivoMarkdown);
		
//		o objetivo é construir um parser simples que permita que para
//		cada header encontrado um código cliente que ainda vai ser implementado
//		seja chamado
		

	}

}
