package br.dev.multicode.mcgames.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import java.math.BigDecimal;

@DynamoDBTable(tableName = "games")
public class Game {

  @DynamoDBHashKey(attributeName = "game_id")
  private String gameId;

  @DynamoDBAttribute(attributeName = "name")
  private String name;

  @DynamoDBAttribute(attributeName = "description")
  private String description;

  @DynamoDBTypeConvertedEnum
  @DynamoDBAttribute(attributeName = "platform")
  private Platform platform;

  @DynamoDBAttribute(attributeName = "price")
  private BigDecimal price;

  @DynamoDBAttribute(attributeName = "created_at")
  private String createdAt;

  @DynamoDBAttribute(attributeName = "updated_at")
  private String updatedAt;

}
