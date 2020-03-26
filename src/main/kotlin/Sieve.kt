object Sieve {

    fun primesUpTo(upperBound: Int): List<Int> {

        val remainingList = (2..upperBound).toMutableList()

        if (remainingList.isEmpty()) return emptyList()

        var index = 0

        while (index != remainingList.lastIndex) {

            val prime = remainingList[index]

            remainingList.removeAll(((prime * 2)..upperBound).step(prime))

            index += 1
        }

        return remainingList
    }
}
