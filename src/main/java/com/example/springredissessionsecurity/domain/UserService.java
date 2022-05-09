package com.example.springredissessionsecurity.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
	private final EntityManager em;


	@Transactional
	public User initService(){
		User user = User.builder().userId("kbh").pw("pw").build();
		em.persist(user);
		return user;
	}
}
