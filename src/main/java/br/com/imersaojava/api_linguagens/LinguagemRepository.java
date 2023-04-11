package br.com.imersaojava.api_linguagens;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{
    
}
