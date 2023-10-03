package com.british_ariways.services.BritishAirwaysFlyerMilesService.repository;

import com.british_ariways.services.BritishAirwaysFlyerMilesService.model.BritishAirwaysTb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<BritishAirwaysTb, Integer> {

  @Query(value="SELECT SUM(s.flightDistance) FROM BritishAirwaysTb s WHERE s.customerId=:id")
  public Long fetchTotalMilesFlown(@Param("id") String customerId);
}
