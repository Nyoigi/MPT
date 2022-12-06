package com.example.mpt.controller;

import com.example.mpt.model.Account;
import com.example.mpt.repository.AccountRepository;
import com.example.mpt.repository.RoleUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @Autowired
    private final AccountRepository accountRepository;
    @Autowired
    private final RoleUsRepository roleUsRepository;

    public AccountController(AccountRepository accountRepository,
                             RoleUsRepository roleUsRepository) {
        this.accountRepository = accountRepository;
        this.roleUsRepository = roleUsRepository;
    }

    @GetMapping("/MainPage")
    public String cityMain(Model model){
        Iterable<Account> accountIterable = accountRepository.findAll();
        model.addAttribute("accountlist", accountIterable);

        return "administrator/main-page";
    }
}
