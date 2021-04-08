package com.demo.crudapp.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AccountControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private AccountController target;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @org.junit.Test
    public void viewHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute("message", "hello world"));
    }

    @org.junit.Test
    public void showNewAccountPage() throws Exception {
        mockMvc.perform(get("/new"))
                .andExpect(status().isOk());
    }

    @org.junit.Test
    public void saveAccount() throws Exception {
        mockMvc.perform(get("/save"))
                .andExpect(status().isOk());
    }

    @org.junit.Test
    public void showEditAccountPage() throws Exception {
        mockMvc.perform(get("/edit/{id}"))
                .andExpect(status().isOk())
                .andExpect(view().name("edit_account"));
    }

    @org.junit.Test
    public void deleteAccount() throws Exception {
        mockMvc.perform(get("/delete/{id}"))
                .andExpect(status().isOk());
    }
}