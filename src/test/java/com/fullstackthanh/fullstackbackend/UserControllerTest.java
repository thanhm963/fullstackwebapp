package com.fullstackthanh.fullstackbackend;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.fullstackthanh.fullstackbackend.repository.UserRepository;
//A Mock can  mimic the behavior of great repository while having no logic of its own.
@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @Mock
    //this mock will mimic the userrepository dependency while having no logic of its own.
    private UserRepository userRepository;
}
