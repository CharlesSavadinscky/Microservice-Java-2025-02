package br.edu.atitus.getway_service.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    private final RouteLocator getGatewayRouter;

    ApiGatewayConfig(RouteLocator getGatewayRouter) {
        this.getGatewayRouter = getGatewayRouter;
    }

	@Bean
	RouteLocator getGatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/get")
						.filters(f -> f
								.addRequestHeader("X-USER-NAME", "usarname")
								.addRequestParameter("name", "fulano")
						.uri("http://httpin.org:80"))
				.route(p -> p
						.path("/products/**")
						.uri("lb://product-service"))
				.ro
				.build();
	}
	
}
