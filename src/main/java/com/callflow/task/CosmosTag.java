package com.callflow.task;

import springfox.documentation.service.Tag;

import static org.yaml.snakeyaml.tokens.Token.ID.Tag;

public class CosmosTag {
    public static final String  DEMO_COSMOS_TAG_NAME = "Demo Cosmos model";
    public static final Tag DEMO_COSMOS = new Tag(DEMO_COSMOS_TAG_NAME, "Very Basic Demo system withy SWAGGER2");
}
