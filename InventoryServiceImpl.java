package org.dnyanyog.service;

import org.dnynayog.dto.response.InventoryResponse;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    private int orderedItems = 0;
    private int availableItems = 100;
    private double price = 100;

    public InventoryResponse getInventory() {
        return new InventoryResponse();
    }
}