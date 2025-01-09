package com.example.sample_dfc.config;

import com.documentum.com.DfClientX;
import com.documentum.com.IDfClientX;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfSessionManager;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfLoginInfo;

import org.apache.commons.text.StringEscapeUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DFCSessionConfig {

    @Bean
    public static IDfSessionManager getSessionManager() throws DfException {
        IDfClientX clientX = new DfClientX();
        IDfClient client = clientX.getLocalClient();
        IDfLoginInfo dfLoginInfo = clientX.getLoginInfo();
        dfLoginInfo.setUser("d2admin");
        dfLoginInfo.setPassword("password");
        IDfSessionManager sessionManager = client.newSessionManager();
        sessionManager.setIdentity(IDfSessionManager.ALL_DOCBASES, dfLoginInfo);
        return sessionManager;
    }

    public static void main(String[] args) {
        System.out.println(StringEscapeUtils.unescapeHtml4("Development &amp; Partnerships"));
    }


}
