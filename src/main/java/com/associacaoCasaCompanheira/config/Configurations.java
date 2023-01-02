package com.associacaoCasaCompanheira.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.associacaoCasaCompanheira.model.Associacao;

@Configuration
public class Configurations {
	
	
	@Bean
	public Associacao associacao() {
		return new Associacao();
	}
	/*
	@Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
        
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
        
    }
    */

}
