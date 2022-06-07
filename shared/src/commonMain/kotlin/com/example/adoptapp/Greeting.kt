package com.example.adoptapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}