package com.example.Avonet.Controllers;

import com.example.Avonet.Controllers.DTO.ItemDTO;
import com.example.Avonet.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.LinkedList;

@RestController
@RequestMapping(value = "item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping(value = "additem")
    public void addItem(@RequestBody ItemDTO dto){
        itemService.addItem(dto);
    }

    @GetMapping(value = "getoneitem/{id}")
    public ItemDTO giveOneItem(@PathVariable int id){
        return itemService.getOneItem(id);
    }

    @GetMapping(value = "getallitem")
    public LinkedList<ItemDTO> giveAllItem(){
        return itemService.giveAllItem();
    }

    @PutMapping(value = "updateitem")
    public void updateOne(@RequestBody ItemDTO dto){
        itemService.updateItem(dto);
    }

    @DeleteMapping(value = "deleteitem/{id}")
    public void deleteOneItem(@PathVariable int id){
        itemService.deleteOneItem(id);
    }



}
