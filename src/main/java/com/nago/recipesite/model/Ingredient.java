package com.nago.recipesite.model;

import com.nago.recipesite.core.BaseEntity;
import com.nago.recipesite.enums.Measurement;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Ingredient extends BaseEntity {
  @NotNull
  @Size(min = 1, max = 26)
  private String name;

  @NotNull
  @Size(min = 1, max = 26)
  private String condition;

  @NotNull
  @NumberFormat
  private double quantity;

  private String measurement;

  @ManyToOne
  private Recipe recipe;

  public Ingredient(){
    super();
  }

  public Ingredient(String name, String condition, double quantity, String measurement) {
    this();
    this.name = name;
    this.condition = condition;
    this.quantity = quantity;
    this.measurement = measurement;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public Recipe getRecipe() {
    return recipe;
  }

  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }
}

