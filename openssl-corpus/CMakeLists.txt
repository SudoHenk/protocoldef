cmake_minimum_required(VERSION 3.3)
project("OpenSSL Corpus")

#set(ENV{AFL_USE_ASan} 1)

set(CMAKE_C_STANDARD 99)
set(CMAKE_C_COMPILER gcc)
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -m32")
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -fsanitize=address")
set(CMAKE_CXX_COMPILER afl-clang-fast++)
#set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fsanitize=address")

set(OPENSSL_VERSION openssl-OpenSSL_1_0_1f)

include_directories(${OPENSSL_VERSION}/include)

configure_file(server.pem server.pem COPYONLY)
configure_file(server.key server.key COPYONLY)

add_executable(openssl_corpus corpus.c)
target_link_libraries(openssl_corpus ${CMAKE_DL_LIBS} "${CMAKE_SOURCE_DIR}/${OPENSSL_VERSION}/libssl.a" "${CMAKE_SOURCE_DIR}/${OPENSSL_VERSION}/libcrypto.a")
