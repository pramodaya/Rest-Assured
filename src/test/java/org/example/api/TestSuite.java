package org.example.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test01_Get.class,
        Test02_Post.class,
        Test03_Put.class,
        Test04_Patch.class,
        Test05_Delete.class,
})
public class TestSuite {
    // No additional code is required
}
