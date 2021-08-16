package org.nir.conferences.repositories;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nir.conferences.models.Session;
import org.nir.conferences.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;


@DataJpaTest(showSql = false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RepositoriesTests
{
	
	@Autowired private SessionRepository sessionRepository;
	
	
	//DONE
	@Test
	@DisplayName("When list all Sessions")
	public void testListAll()
	{
		//GIVEN
		
		//WHEN
		
		List<Session> sessions = this.sessionRepository.findAll();
		
		//THEN
		assertThat(sessions.size()).isGreaterThan(0);
		
		
		sessions.forEach(System.out::println);
		
				
	}
}
