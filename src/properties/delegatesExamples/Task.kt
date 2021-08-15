package properties.delegatesExamples

class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
}