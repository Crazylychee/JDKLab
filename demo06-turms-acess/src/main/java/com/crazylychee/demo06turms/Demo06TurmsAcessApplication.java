package com.crazylychee.demo06turms;

import im.turms.server.common.infra.application.Application;
import im.turms.server.common.infra.cluster.node.NodeType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Application(nodeType = NodeType.GATEWAY)
@SpringBootApplication
public class Demo06TurmsAcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo06TurmsAcessApplication.class, args);
    }

}
