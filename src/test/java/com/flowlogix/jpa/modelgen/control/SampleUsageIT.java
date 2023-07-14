package com.flowlogix.jpa.modelgen.control;

import jakarta.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.archive.importer.MavenImporter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ArquillianExtension.class)
public class SampleUsageIT {
    @Inject
    SampleUsage sampleUsage;

    @Test
    void sample() {
        assertEquals("key", sampleUsage.keyName());
    }

    @Deployment
    public static WebArchive createDeploymentDev() {
        WebArchive archive = ShrinkWrap.create(MavenImporter.class, "modelgen.war")
                .loadPomFromFile("pom.xml").importBuildOutput()
                .as(WebArchive.class);
        return archive;
    }
}
