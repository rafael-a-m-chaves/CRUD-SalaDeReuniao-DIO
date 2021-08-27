package com.digital.crud.saladereuniao.saladereuniao.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import com.digital.crud.saladereuniao.saladereuniao.exception.ResourceNotFundException;
import com.digital.crud.saladereuniao.saladereuniao.model.Room;
import com.digital.crud.saladereuniao.saladereuniao.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class RoomController {

    @Autowired
    private  RoomRepository roomRepository;

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return  roomRepository.findAll();
    }

    @GetMapping("/room/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable(value = "id") Long roomId) throws ResourceNotFundException {
        Room room = roomRepository.findById(roomId)
                .orElseThrow(()-> new ResourceNotFundException("Room not Found:: " + roomId));
        return ResponseEntity.ok().body(room);
    }

    @PostMapping("/room")
    public Room createRoom(@Valid @RequestBody Room room){
        return roomRepository.save(room);
    }

    @PutMapping("/room/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable(value = "id") Long roomId, @Valid @RequestBody
                                            Room roomDetails) throws ResourceNotFundException {
        Room room = roomRepository.findById(roomId)
                .orElseThrow(()-> new ResourceNotFundException("Room Not found for this id:: "+roomId));
        room.setName(roomDetails.getName());
        room.setDate(roomDetails.getDate());
        room.setStarHour(roomDetails.getStarHour());
        room.setEndHour(roomDetails.getEndHour());
        final Room updateRoom = roomRepository.save(room);
        return ResponseEntity.ok(updateRoom);
    }

    public Map<String, Boolean> deleteRoom (@PathVariable(value = "id") Long roomId) throws ResourceNotFundException{
        Room room = roomRepository.findById(roomId)
                .orElseThrow(() -> new ResourceNotFundException("Room not found for this id:: "+roomId));
        roomRepository.delete(room);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
