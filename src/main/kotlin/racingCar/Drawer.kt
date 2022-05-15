package racingCar

interface IDrawer {
    fun paint(carPositions: List<Int>): String
}

class Drawer {
    fun paint(carPositions: List<Int>): String {
        return carPositions.joinToString(separator = "\n") { "-".repeat(it) }
    }
}