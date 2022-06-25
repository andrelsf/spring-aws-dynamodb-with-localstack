package br.dev.multicode.mcgames.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConvertedEnum;
import java.io.Serializable;
import java.math.BigDecimal;


@DynamoDBTable(tableName = "games")
public class Game implements Serializable {

  private static final long serialVersionUID = -4282115207341771716L;

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

  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }
}
