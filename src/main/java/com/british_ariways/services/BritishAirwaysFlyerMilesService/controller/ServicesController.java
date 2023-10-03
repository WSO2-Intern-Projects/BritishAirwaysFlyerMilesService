package com.british_ariways.services.BritishAirwaysFlyerMilesService.controller;

import com.british_ariways.services.BritishAirwaysFlyerMilesService.service.FlyerMilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/FlyerMilesService")
public class ServicesController {

    @Autowired
    FlyerMilesService flyerMilesService;

    @GetMapping(path="/milesFlown/{customerId}" ,produces = { "application/xml" })
    public miles search(@PathVariable String customerId) {
        Long totalMilesFlown= flyerMilesService.findTotalMilesFlown(customerId);

        miles response = new miles();
        response.setCustomerId(customerId);
        response.setMilesFlown(totalMilesFlown);
        return response;
    }

}
