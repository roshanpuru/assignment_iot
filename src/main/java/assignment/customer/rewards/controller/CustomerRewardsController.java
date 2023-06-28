package assignment.customer.rewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import assignment.customer.rewards.service.impl.CustomerRewardImpl;

@RestController
public class CustomerRewardsController {
    
    @Autowired
    private CustomerRewardImpl customerRewardImpl;

    @RequestMapping(value = "/rewards/user/{name}/month/{month}", method = RequestMethod.GET)
    public Integer save(@PathVariable("name") String name, @PathVariable("month") int month){
        return customerRewardImpl.getRewardsByMonth(name, month);      
    }
}
