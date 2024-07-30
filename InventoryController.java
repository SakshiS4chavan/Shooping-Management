package org.dnyanyog.controller;

import org.dnyanyog.service.InventoryService;
import org.dnynayog.dto.response.InventoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/inventory")
    public ResponseEntity<?> getInventory() {
        InventoryResponse inventoryResponse = inventoryService.getInventory();
        return ResponseEntity.ok(inventoryResponse);
    }
}