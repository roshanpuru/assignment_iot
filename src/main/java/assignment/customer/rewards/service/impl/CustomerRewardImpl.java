package assignment.customer.rewards.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment.customer.rewards.object.Customer;
import assignment.customer.rewards.repo.CustomerRepo;
import assignment.customer.rewards.service.ICustomerReward;

@Service
public class CustomerRewardImpl implements ICustomerReward {

    @Autowired
    CustomerRepo customerRepo;

    @Override
    public Integer getRewardsByMonth(String name, int month) {
        List<Customer> list = customerRepo.findByName(name);
        return list.stream()
        .filter(item -> item.getMonth() == month)
        .map(item ->{
            int points =0;
            if(item.getCost() > 50 && item.getCost() <=100){
                points = points + item.getCost() - 50;
            }else if(item.getCost() > 50 && item.getCost() >=100){
                points = points + 50;
            }else if(item.getCost() > 100){
                points = points + 2*(item.getCost() - 100);
            }
            return points;
        }).findFirst().get();
    }
    
}
