package properties.properties

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(f) {
            field = f
            counter++
        }
}
