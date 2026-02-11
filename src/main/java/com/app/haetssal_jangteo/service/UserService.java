package com.app.haetssal_jangteo.service;

import com.app.haetssal_jangteo.common.enumeration.Provider;
import com.app.haetssal_jangteo.dto.UserDTO;
import com.app.haetssal_jangteo.repository.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class UserService {
    private final UserDAO userDAO;

//    이메일검사. 쓸숭있나요? => true
    public boolean checkEmail(String memberEmail) {
        return userDAO.findByUserEmail(memberEmail).isEmpty();
    }

//    햇살로 회원가입
    public void haetssalJoin(UserDTO userDTO) {
        userDTO.setAuthProvider(Provider.HAETSSAL);
        userDAO.save(userDTO);
        userDAO.saveOAuth(userDTO.toOAuthVO());
    }

//    카카오로 회원가입
    public void kakaoJoin(UserDTO userDTO) {
        userDTO.setAuthProvider(Provider.SOCIAL);
        userDAO.save(userDTO);
        userDAO.saveOAuth(userDTO.toOAuthVO());
    }
}
