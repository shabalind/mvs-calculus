// swift-tools-version:4.0

import PackageDescription

let package = Package(
    name: "benchmarks",
    products: [
        .executable(name: "Bounce", targets: ["Bounce"]),
        .executable(name: "Mandelbrot", targets: ["Mandelbrot"]),
        .executable(name: "Nbody", targets: ["Nbody"]),
        .executable(name: "Permute", targets: ["Permute"]),
        .executable(name: "Queens", targets: ["Queens"]),
    ],
    dependencies: [
    ],
    targets: [
        .target(
            name: "Bounce",
            dependencies: ["Benchmark", "Random"]),
        .target(
            name: "Mandelbrot",
            dependencies: ["Benchmark"]),
        .target(
            name: "Nbody",
            dependencies: ["Benchmark"]),
        .target(
            name: "Permute",
            dependencies: ["Benchmark"]),
        .target(
            name: "Queens",
            dependencies: ["Benchmark"]),
        .target(
            name: "Random",
            dependencies: ["Benchmark"]),
        .target(
            name: "Benchmark",
            dependencies: []),
    ]
)
