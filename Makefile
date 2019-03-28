ifndef JX_HOME
override JX_HOME = ~/.jx
endif
GENERATOR_BIN := ${JX_HOME}/bin/openapi-generator-cli
OPENAPI_GENERATOR_VERSION:= 3.3.4
OUTPUT_DIR=client

all: install-generator generate

install-generator:
	@echo "You must install jq first. See https://stedolan.github.io/jq/download/"
	mkdir -p ${JX_HOME}/bin
	curl https://raw.githubusercontent.com/OpenAPITools/openapi-generator/master/bin/utils/openapi-generator-cli.sh \
	> ${GENERATOR_BIN}
	chmod u+x ${GENERATOR_BIN}

generate:
	mkdir -p ${OUTPUT_DIR}
	${GENERATOR_BIN} generate \
	-i https://raw.githubusercontent.com/jenkins-x/jx/master/docs/apidocs/openapi-spec/openapiv2.yaml \
	-g java \
	-o ${OUTPUT_DIR}