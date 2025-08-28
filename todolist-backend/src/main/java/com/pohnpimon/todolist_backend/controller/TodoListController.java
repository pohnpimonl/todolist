package com.pohnpimon.todolist_backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/todolist")
public class TodoListController {

    @PostMapping("/create")
    public String createTodoList(@RequestBody @Valid String req) {
        return "create";
    }

    @PostMapping("/get")
    public List<String> getTodoList(@RequestBody List<String> listId) {
        // แบ่งหน้า
        return new ArrayList<String>();
    }

    @PatchMapping("/update")
    public String updateTodoList(@RequestBody String entity) {
        return "update";
    }
}
