#!/bin/bash

[ -f .extensions/kotlin.vsix ] && exit 0

mkdir -p .extensions/
curl -L -o .extensions/kotlin.vsix https://download-cdn.jetbrains.com/kotlin-lsp/0.253.10629/kotlin-0.253.10629.vsix
