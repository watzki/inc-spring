package com.example.demo.member;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MemberConfig {

    @Bean
    CommandLineRunner commandLineRunner(MemberRepository memberRepository) {
        return args -> {
            Member star = new Member ("Datu", "Estrella", "Buklod", 5, 6, true, false, false, false, false, false, false, false, false, false);
            Member eyah = new Member ("Datu", "Eyah", "Binhi", 5, 6, false, false, true, false, false, false, false, false, false, false);

            memberRepository.saveAll(List.of(star, eyah));
        };
    }
}
