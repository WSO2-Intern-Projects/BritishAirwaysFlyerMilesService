package com.british_ariways.services.BritishAirwaysFlyerMilesService.service;

import org.springframework.stereotype.Service;

@Service
public interface FlyerMilesService {
//    public BritishAirwaysTb create(BritishAirwaysTb customer);

    public Long findTotalMilesFlown(String customerId);
}
