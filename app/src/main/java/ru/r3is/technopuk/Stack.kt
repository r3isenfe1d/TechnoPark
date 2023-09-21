package ru.r3is.technopuk

class Stack(private val size: Int) {
    private val stackArray = LongArray(size)
    private var top = -1

    fun push(number: Long) {
        stackArray[++top] = number
    }

    fun pop(): Long {
        return stackArray[top--]
    }

    fun peek(): Long {
        return stackArray[top]
    }

    fun isEmpty(): Boolean {
        return top == -1
    }

    fun isFull(): Boolean {
        return top == size - 1
    }
}