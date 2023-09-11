package com.example.dfc;

import com.documentum.com.DfClientX;
import com.documentum.com.IDfClientX;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfSessionManager;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfLoginInfo;

public class Main {

    public static void main(String[] args) throws DfException {
        IDfClientX clientX = new DfClientX();
        IDfClient client = clientX.getLocalClient();
        IDfLoginInfo dfLoginInfo = clientX.getLoginInfo();
        dfLoginInfo.setUser("d2admin");
        dfLoginInfo.setPassword("AAAAEBDRJZEZcV1en0VO+FF0MOj+en7Dt45qelxzTQpfCMmw");
        IDfSessionManager sessionManager = client.newSessionManager();
        sessionManager.setIdentity(IDfSessionManager.ALL_DOCBASES, dfLoginInfo);
        System.out.println("Session Obj:" + sessionManager.getSession("eRegistry"));
    }
}
