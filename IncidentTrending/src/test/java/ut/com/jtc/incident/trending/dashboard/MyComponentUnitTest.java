package ut.com.jtc.incident.trending.dashboard;

import org.junit.Test;
import com.jtc.incident.trending.dashboard.api.MyPluginComponent;
import com.jtc.incident.trending.dashboard.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}