package com.devsuperior.services;

import com.devsuperior.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class OrderService {


    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discount = order.getBasicValue() *  (order.getDiscountPercentage() / 100);
        return  (order.getBasicValue() - discount) + shippingService.shipment(order);
    }
}
