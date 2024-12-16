package com.dmboats.dmboats_website;

import com.dmboats.dmboats_website.controllers.Viking_4_6_F_Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(Viking_4_6_F_Controller.class)
class VikingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testVikingPage() throws Exception {
        mockMvc.perform(get("/viking_4_6_f"))
                .andExpect(status().isOk())
                .andExpect(view().name("viking_4_6_f"));
    }
}