package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basicValue = order.getBasicValue();

        if (basicValue < 100) {
            return 20.00;
        } else if (basicValue >= 100 && basicValue <= 200) {
            return 12.00;
        } else {
            return 0.00;
        }
    }

}
