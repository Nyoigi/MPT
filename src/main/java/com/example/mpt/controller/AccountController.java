package com.example.mpt.controller;

import com.example.mpt.model.Account;
import com.example.mpt.model.Role_us;
import com.example.mpt.model.Tb_user;
import com.example.mpt.repository.AccountRepository;
import com.example.mpt.repository.RoleUsRepository;
import com.example.mpt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Account")
public class AccountController {

    @Autowired
    private final AccountRepository accountRepository;
    @Autowired
    private final RoleUsRepository roleUsRepository;
    @Autowired
    private final UserRepository userRepository;

    public AccountController(AccountRepository accountRepository,
                             RoleUsRepository roleUsRepository, UserRepository userRepository) {
        this.accountRepository = accountRepository;
        this.roleUsRepository = roleUsRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/MainPage")
    public String AccountMain(Model model){
        Iterable<Account> accountIterable = accountRepository.findAll();
        model.addAttribute("accountlist", accountIterable);
        Iterable<Role_us> role_usIterable  = roleUsRepository.findAll();
        model.addAttribute("rolelist", role_usIterable);
        Iterable<Tb_user> userIterable  = userRepository.findAll();
        model.addAttribute("userlist", userIterable);
        return "administrator/account/main-page";
    }
//    @PostMapping ("/MainPage")
//    public String addAccount(@RequestParam String email,
//                             @RequestParam String password,
//                             @RequestParam String nameRole,
//                             @RequestParam Tb_user nameUser, Model model){
//        Role_us role_name = roleUsRepository.findByNameRole(nameRole);
//        Tb_user tb_user = userRepository.findByNameUser(nameUser);
//        System.out.println(role_name.getId());
//        Account account = new Account (email, password, role_name, user_id);
//        accountRepository.save(account);
//
//        return "administrator/account/main-page";
//    }

    @GetMapping("/MainPage/Add")
    public String AccountAdd(Model model){
        Iterable<Role_us> role_usIterable  = roleUsRepository.findAll();
        model.addAttribute("rolelist", role_usIterable);
        Iterable<Tb_user> userIterable  = userRepository.findAll();
        model.addAttribute("userlist", userIterable);
        return "administrator/account/main-page";
    }

}
