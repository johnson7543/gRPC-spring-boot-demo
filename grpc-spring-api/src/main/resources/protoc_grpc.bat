@echo off
for %%i in (proto/*.proto) do (
  d:/TestCode/protoc.exe --plugin=protoc-gen-grpc-java=d:/TestCode/protoc-grpc.exe --java_out=../java --grpc-java_out=../java ./proto/%%i
  echo generate %%i to java file successfully!
)

