package org.fisikes.flow.server.interfaces;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GitCmdApiTest {

    @Autowired
    private GitCmdApi gitCmdApi;


    @Test
    public void test() {

        gitCmdApi.createBranch(null ,"test");
    }
}