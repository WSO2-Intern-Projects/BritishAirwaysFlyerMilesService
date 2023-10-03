package com.british_ariways.services.BritishAirwaysFlyerMilesService.service.implementation;

import com.british_ariways.services.BritishAirwaysFlyerMilesService.repository.CustomerRepository;
import com.british_ariways.services.BritishAirwaysFlyerMilesService.service.FlyerMilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyerMilesServiceImpl implements FlyerMilesService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Long findTotalMilesFlown(String customerId) {
        return customerRepository.fetchTotalMilesFlown(customerId);
    }

}
