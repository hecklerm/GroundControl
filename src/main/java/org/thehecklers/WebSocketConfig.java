package org.thehecklers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

/**
 * Created by markheckler on 1/19/2016.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Autowired
    private DataHandler dataHandler;
    @Autowired
    private ControlHandler controlHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(dataHandler, "/data").setAllowedOrigins("*");
        registry.addHandler(controlHandler, "/control").setAllowedOrigins("*");
    }
}
