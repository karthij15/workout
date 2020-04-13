package com.kj.main;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.component.slack.SlackComponent;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		//final CamelContext camel = new DefaultCamelContext();
    //final SlackComponent slackComponent = (SlackComponent) camel.getComponent("slack");
final SlackComponent slackComponent = (SlackComponent) this.getContext().getComponent("slack");
		slackComponent.setWebhookUrl(/* "https://hooks.slack.com/services/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"*/
		"https://hooks.slack.com/services/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");
	//	from("file:D://delete/inputFolder?noop=true").to("file:D://delete/outputFolder");
	  from("timer:test?period=2000").setBody(simple("Check!")).to("slack:#seyarkai-manidhargal");
	}
}
