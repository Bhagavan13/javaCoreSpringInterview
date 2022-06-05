package com.bhagavan.interview.transactionalUnd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentEntity, Long> {

}
