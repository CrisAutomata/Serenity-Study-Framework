package com.demo.test.config;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class serenityConfig {
  public static final  EnvironmentVariables ENV_VARIABLES =
      SystemEnvironmentVariables.createEnvironmentVariables();

  public static final String ENV_URL =
      EnvironmentSpecificConfiguration.from(ENV_VARIABLES).getProperty("investigation.url");

}
