package com.springboot.actuatormonitoring.infocontributor;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ActuatorInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("app_name", "ActuatorMonitoring")
                .withDetail("app_version", "1.0.0")
                .withDetail("build_time", "2023-04-06 01:23:11")
                .withDetail("build_number", "54321");
    }
}
