
/*
* This software is the confidential and proprietary information of
* Cargill, ("Confidential Information"). You shall not
* disclose such Confidential Information and shall use it only in
* accordance with the terms of the license agreement you entered into
* with Cargill.
* Created by Sapient
*/

package com.cargill.dxo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * The Class Application.
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

  /**
   * Instantiates a new application.
   */
  public Application() {
    super();
  }
  /**
   * The main method.
   *
   * @param args
   *          the arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
