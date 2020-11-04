package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

    @Autowired
    AccountService accountService;

    @RequestMapping("/getAccountsList")
    public ModelAndView getAccountsList(){
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("accountsList");
        modelView.addObject("listOfAccounts", accountService.viewAllAccounts());
        return modelView;
    }

    @RequestMapping("/accountDetails")
    public ModelAndView getAccountDetails(){
        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("viewAccountDetails");
        modelView.addObject("details", accountService.viewAccountDetails());
        return modelView;
    }

}
