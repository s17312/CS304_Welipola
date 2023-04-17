package com.example.mybackend0.service;

import com.example.mybackend0.dto.ClientDTO;
import com.example.mybackend0.dto.OrderDTO;
import com.example.mybackend0.entity.Client;
import com.example.mybackend0.entity.Orders;
import com.example.mybackend0.repo.OrderRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;
    
    @Autowired
    private ModelMapper modelMapper;


    public List<OrderDTO> getAllOrder() {
        List<Orders> orderList = orderRepo.findAll();
        return modelMapper.map(orderList, new TypeToken<List<OrderDTO>>(){}.getType());
    }

    public OrderDTO saveOrder(OrderDTO orderDTO) {
        orderRepo.save(modelMapper.map(orderDTO, Orders.class));
        return orderDTO;
    }

    public OrderDTO updateOrder(OrderDTO orderDTO) {
        orderRepo.save(modelMapper.map(orderDTO, Orders.class));
        return orderDTO;
    }

    public boolean deleteOrder(OrderDTO orderDTO) {
        orderRepo.delete(modelMapper.map(orderDTO,Orders.class));
        return true;
    }
}
