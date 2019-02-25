package practice.example.service;

import org.springframework.stereotype.Service;

@Service
public class AccountOpeningService {

    public String openAccount(String name, String accountType, String address) {
        System.out.println("request received to open account");
        // Do some process and store data to database
        String response = accountType + " account Opened for " + name + " with " + address + " address";
        return response;
    }
}