aws dynamodb create-table \
    --table-name tasks \
    --attribute-definitions \
        AttributeName=taskListId,AttributeType=S \
        AttributeName=taskId,AttributeType=S \
    --key-schema AttributeName=taskListId,KeyType=HASH AttributeName=taskId,KeyType=RANGE \
    --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1