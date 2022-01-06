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
            dependencies: ["Random"]),
        .target(
            name: "Mandelbrot",
            dependencies: []),
        .target(
            name: "Nbody",
            dependencies: []),
        .target(
            name: "Permute",
            dependencies: []),
        .target(
            name: "Queens",
            dependencies: []),
        .target(
            name: "Random",
            dependencies: []),
    ]
)
