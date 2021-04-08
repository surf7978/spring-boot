package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;

@Configuration
@EnableJpaRepositories(bootstrapMode = BootstrapMode.DEFERRED)
public class RepositoryConfig {
	//@Bean //이거 쓰면 bean생성 시점 정할 수 있음
}
