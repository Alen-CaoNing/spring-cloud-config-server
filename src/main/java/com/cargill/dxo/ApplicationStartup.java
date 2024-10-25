
/*
* This software is the confidential and proprietary information of
* Cargill, ("Confidential Information"). You shall not
* disclose such Confidential Information and shall use it only in
* accordance with the terms of the license agreement you entered into
* with Cargill.
* Created by Sapient
*/
package com.cargill.dxo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * The Class ApplicationStartup.
 */
@Component
public class ApplicationStartup
    implements ApplicationListener<ApplicationReadyEvent> {
  /**
   * default constructor.
   */
  public ApplicationStartup() {
    /**
     * constructor body .
     */
  }

  /**
   * This event is executed as late as conceivably possible to indicate that the
   * application is ready to service requests.
   */
  @Override
  public void onApplicationEvent(final ApplicationReadyEvent event) {
  }

}
