package com.example.restservice;

/**
 *  Jackson is included by default by the web starter(Spring).
 */
public record Greeting(long id, String content) { }