package com.gdsc.knu.service;

import com.gdsc.knu.entity.User;
import com.gdsc.knu.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    /**
     * 사용자의 생성은 OAuth2UserService에서 이루어진다.
     * 그에 따라 read, update, delete만 구현한다.
     */

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

}
