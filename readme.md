    docker run --rm -it -p 4566:4566 -p 4510-4559:4510-4559 localstack/localstack

    aws ssm put-parameter --name "/config/app.username" --value "aws" --type "String" --endpoint-url=http://localhost:4566 --overwrite
