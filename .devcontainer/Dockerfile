FROM mcr.microsoft.com/devcontainers/base:ubuntu-22.04

RUN apt-get update \
    && apt-get install -y --no-install-recommends \
    gnupg2 \
    curl \
    ca-certificates \
    && curl -fsSL https://apt.corretto.aws/corretto.key | curl -fsSL https://apt.corretto.aws/corretto.key | gpg --dearmor -o /usr/share/keyrings/corretto-keyring.gpg \
    && echo "deb [signed-by=/usr/share/keyrings/corretto-keyring.gpg] https://apt.corretto.aws stable main" > /etc/apt/sources.list.d/corretto.list \
    && apt-get update \
    && apt-get install -y --no-install-recommends openjdk-21-jre-headless \
    && rm -rf /var/lib/apt/lists/*
