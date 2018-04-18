package com.mkcorp.ethicworld;

import com.mkcorp.ethicworld.beans.Comp;
import com.mkcorp.ethicworld.services.GetDataService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfiguration.class }, loader = AnnotationConfigContextLoader.class)
public class GetDataControllerTest {

    @Autowired
    GetDataService getDataService;
    @Test
    public void getCompByIdTest() throws IOException {
        Comp c = getDataService.getCompById(1L);
        Assert.assertTrue(c.getName().contains("Monsanto"));
        Assert.assertFalse(c.getName().contains("Lu"));

    }
}
