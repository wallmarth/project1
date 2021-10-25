#!/bin/bash
echo "addition of two numbers"
read -p "Enter two digits" a b
echo "sum of two number=" `expr $a + $b`

