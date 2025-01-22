package com.example.sample_dfc;

import com.documentum.fc.client.DfServiceException;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfSessionManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SessionTest {

    @Autowired
    IDfSessionManager sessionManager;
    @Test
    void getSessionTest() throws DfServiceException {
        IDfSession session = sessionManager.getSession("eRegistry");
        log.info("session {}",session);
    }
}
