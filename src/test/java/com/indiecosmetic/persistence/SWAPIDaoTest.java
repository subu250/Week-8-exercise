package com.indiecosmetic.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SWAPIDaoTest {

    @Test
    void getPetSuccess() {
        SWAPIDao dao = new SWAPIDao();

        assertEquals("cats",dao.getPet().getCategory().getName());


    }
}