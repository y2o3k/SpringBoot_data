package hello.hellospring;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	public void save(){
		Member member = new Member();
		member.setName("spring");
		repository.save(member);

		Member result = repository.findById(member.getId()).get();
		//System.out.println("result	== member) = " + (result == member));
		//Assertions.assertEquals(member.result);
		assertTat(member).isEqualTo(result);


	}

}
