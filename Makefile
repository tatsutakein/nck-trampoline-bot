.PHONY: dev-setup
dev-setup:
	@docker-compose up -d --build

.PHONY: dev-teardown
dev-teardown:
	@docker-compose down
