cmake_minimum_required(VERSION 3.22)
project(cyberarmor_shell LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_library(cyberarmor SHARED src/cyberarmor_shell.cpp)

find_library(log-lib log)
target_link_libraries(cyberarmor ${log-lib})

# Strip symbols in release to slow down reverse engineering.
target_link_options(cyberarmor PRIVATE $<$<CONFIG:Release>:-s>)
