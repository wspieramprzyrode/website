package pl.wspieramprzyrode.website.ui;

import org.junit.jupiter.api.Test;

import io.quarkiverse.quinoa.testing.QuinoaTestProfiles;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.TestProfile;

@QuarkusTest
@TestProfile(QuinoaTestProfiles.EnableAndRunTests.class)
public class UiTests {
    @Test
    public void runTest() {
        // you don't need anything here, it will run your package.json "test"
    }

}
