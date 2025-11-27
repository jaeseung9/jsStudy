package com.ohgiraffers.springdatajpa.menu.controller;

import com.ohgiraffers.springdatajpa.menu.dto.MenuResponseDTO;
import com.ohgiraffers.springdatajpa.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/menus")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    /* 1. 특정 메뉴 코드로 메뉴 조회 */
    @GetMapping("/{menuCode}")
    public ResponseEntity<MenuResponseDTO> findMenuByCode(@PathVariable int menuCode){
        MenuResponseDTO resultMenu = menuService.findMenuByMenuCode(menuCode);
        // 상태 코드 200(ok)와 함께 JSON 반환
        return ResponseEntity.ok(resultMenu);
    }
}
