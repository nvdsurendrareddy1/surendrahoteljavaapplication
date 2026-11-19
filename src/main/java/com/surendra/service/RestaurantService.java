package com.surendra.service;

import com.surendra.dto.RestaurantDto;
import com.surendra.model.Restaurant;
import com.surendra.model.User;
import com.surendra.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);

    public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant) throws Exception;

    public void deleteRestaurant(Long restaurantId) throws Exception;

    public List<Restaurant> getAllRestaurants();

    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id) throws Exception;

    public Restaurant getRestaurantByUserId(Long userId) throws Exception;

    public RestaurantDto addToFavorites(User user, Long restaurantId) throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;


}
