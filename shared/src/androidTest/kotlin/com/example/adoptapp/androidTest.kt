package com.example.adoptapp

import kotlin.test.Test
import kotlin.test.assertTrue

class AndroidGreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Greeting().greeting().contains("Android"))
    }
}