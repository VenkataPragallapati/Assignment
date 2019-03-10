package com.example.demo;

import org.junit.Rule;

public abstract  class AbstractTest {
    @Rule
    public SystemOutResource sysOut = new SystemOutResource();

}

