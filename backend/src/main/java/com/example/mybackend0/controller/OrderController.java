package com.example.mybackend0.controller;

import com.example.mybackend0.dto.ClientDTO;
import com.example.mybackend0.dto.OrderDTO;
import com.example.mybackend0.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v6/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrder")
    public List<OrderDTO> getOrder(){
        return orderService.getAllOrder();
    }

    @PostMapping("/saveOrder")
    public OrderDTO saveOrder(@RequestBody OrderDTO orderDTO){
        return orderService.saveOrder(orderDTO);
    }

    @PutMapping("/orderClient")
    public OrderDTO updateOrder(@RequestBody OrderDTO orderDTO){
        return orderService.updateOrder(orderDTO);
    }

    @DeleteMapping("/deleteOrder")
    public boolean deleteOrder(@RequestBody OrderDTO orderDTO){
        return orderService.deleteOrder(orderDTO);
    }
}
