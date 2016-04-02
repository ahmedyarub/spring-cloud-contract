package io.codearte.accurest.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import io.codearte.accurest.config.TestFramework;

@Mojo(name = "generateSpecs", defaultPhase = LifecyclePhase.GENERATE_TEST_SOURCES)
public class GenerateSpecsMojo extends AbstractGenerateVerificationCodeMojo {

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Generating Spock Specifications source code for Accurest contract verification");
		generateVerificationCode(TestFramework.SPOCK);
	}

}
