package xyz.sandersonsa.sb_demo_api.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/principal")
public class Principal {

    @GetMapping("/hostname")
    public ResponseEntity<String> getHostname() throws UnknownHostException {
        String hostname = InetAddress.getLocalHost().getHostName();
        return new ResponseEntity<>(hostname, HttpStatus.OK);
    }

}
