FROM ubuntu:latest
LABEL authors="vinni"

ENTRYPOINT ["top", "-b"]