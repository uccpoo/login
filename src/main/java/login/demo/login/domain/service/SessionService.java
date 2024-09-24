package login.demo.login.domain.service;

import login.demo.login.domain.dto.Session;
import login.demo.login.domain.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> getAll() {
        return sessionRepository.getAll();
    }
}
