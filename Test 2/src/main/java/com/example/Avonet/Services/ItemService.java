package com.example.Avonet.Services;

import com.example.Avonet.Controllers.DTO.ItemDTO;
import com.example.Avonet.repositories.Entities.Item;
import com.example.Avonet.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public void addItem(ItemDTO dto){
        itemRepository.save(new Item(dto.getItemName()));
    }
    public ItemDTO getOneItem(int id){
        Item item=itemRepository.findById(id).get();
        return new ItemDTO(item.getItemId(), item.getItemName());
    }
    public LinkedList<ItemDTO> giveAllItem(){
        LinkedList<ItemDTO> list=new LinkedList<>();
        for (Item item : itemRepository.findAll()) {
            list.add(new ItemDTO(item.getItemId(), item.getItemName()));
        }
        return list;

    }

    public void updateItem(ItemDTO dto){
        Item item=itemRepository.findById(dto.getItemId()).get();
        item.setItemName(dto.getItemName());
        itemRepository.save(item);
    }

    public void deleteOneItem(int id){
        Item item=itemRepository.findById(id).get();
        itemRepository.delete(item);
    }

}
