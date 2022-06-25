#!/usr/bin/env bash
#
# Initial database with localstack
# Created by:
#   Andre Ferreira <andre.dev.linux@gmail.com>

aws dynamodb \
  create-table \
  --cli-input-json file://src/main/resources/initial-database/games.json \
  --endpoint-url=http://localhost:4566