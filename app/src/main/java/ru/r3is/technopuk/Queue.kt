package ru.r3is.technopuk

class Queue(private val size: Int) {
    private val queueArray = LongArray(size)
    private var front = 0   // First element in queue
    private var rear = -1   // Place for inserting element in queue
    private var items = 0   // Amount of elements in queue

    fun insert(number: Long) {
        if (this.isFull()) throw Exception()
        if (rear == size - 1) {
            rear = -1
        }
        queueArray[++rear] = number
        items++
    }

    fun remove(): Long {
        val temp = queueArray[front++]
        if (front == size) {
            front = 0
        }
        items--
        return temp
    }

    fun peekFront(): Long {
        return queueArray[front]
    }

    fun isEmpty(): Boolean {
        return items == 0
    }

    fun isFull(): Boolean {
        return items == size
    }

    fun size(): Int {
        return size
    }
}