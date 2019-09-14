set -x
aws dynamodb create-table \
    --table-name general \
    --attribute-definitions \
        AttributeName=PK,AttributeType=S \
        AttributeName=SK,AttributeType=S \
        AttributeName=data,AttributeType=S \
    --key-schema AttributeName=PK,KeyType=HASH AttributeName=SK,KeyType=RANGE \
    --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1 \
    --global-secondary-indexes IndexName=general-gsi,KeySchema=["{AttributeName=SK,KeyType=HASH}","{AttributeName=data,KeyType=RANGE}"],Projection="{ProjectionType=ALL}",ProvisionedThroughput="{ReadCapacityUnits=1,WriteCapacityUnits=1}"

set +x