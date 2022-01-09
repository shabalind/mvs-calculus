#if os(macOS) || os(iOS) || os(tvOS) || os(watchOS)
import Darwin
#elseif os(Linux)
import Glibc
#endif
import Benchmark

struct Vec3 {
  var x: Double
  var y: Double
  var z: Double

  init(_ x: Double, _ y: Double, _ z: Double) {
    self.x = x
    self.y = y
    self.z = z
  }
}

struct Body {
  var r: Vec3
  var v: Vec3
  var m: Double
  var d: Double

  init(_ r: Vec3, _ v: Vec3, _ m: Double, _ d: Double) {
    self.r = r
    self.v = v
    self.m = m
    self.d = d
  }
} 

func advance(_ bodies: inout [Body], _ n: Int, _ dt: Double) {
  for i in 0 ..< n {
    for j in (i + 1) ..< n {
      let dx = bodies[i].r.x - bodies[j].r.x
      let dy = bodies[i].r.y - bodies[j].r.y
      let dz = bodies[i].r.z - bodies[j].r.z

      let dSquared  = dx * dx + dy * dy + dz * dz
      let magnitude = dt / (dSquared * dSquared.squareRoot())

      bodies[i].v.x = bodies[i].v.x - dx * bodies[j].m * magnitude
      bodies[i].v.y = bodies[i].v.y - dy * bodies[j].m * magnitude
      bodies[i].v.z = bodies[i].v.z - dz * bodies[j].m * magnitude

      bodies[j].v.x = bodies[j].v.x + dx * bodies[i].m * magnitude
      bodies[j].v.y = bodies[j].v.y + dy * bodies[i].m * magnitude
      bodies[j].v.z = bodies[j].v.z + dz * bodies[i].m * magnitude
    }
  }

  for i in 0 ..< n {
    bodies[i].r.x = bodies[i].r.x + dt * bodies[i].v.x
    bodies[i].r.y = bodies[i].r.y + dt * bodies[i].v.y
    bodies[i].r.z = bodies[i].r.z + dt * bodies[i].v.z
  }
} 

func energy(_ bodies: [Body], _ n: Int) -> Double {
  var e = 0.0

  for i in 0 ..< n {
    e = e + 0.5 * bodies[i].m * (
      bodies[i].v.x * bodies[i].v.x +
      bodies[i].v.y * bodies[i].v.y +
      bodies[i].v.z * bodies[i].v.z)

    for j in (i + 1) ..< n {
      let dx = bodies[i].r.x - bodies[j].r.x
      let dy = bodies[i].r.y - bodies[j].r.y
      let dz = bodies[i].r.z - bodies[j].r.z 

      let distance = (dx * dx + dy * dy + dz * dz).squareRoot()
      e = e - (bodies[i].m * bodies[j].m) / distance
    }
  }

  return e
}

func run(_ iterations: Int) -> Int {
  let pi          = 3.1415926535897931
  let planetCount = 5
  let solarMass   = 4.0 * pi * pi
  let daysPerYear = 365.24

  let sun = Body(
    Vec3(0.0, 0.0, 0.0),
    Vec3(0.0, 0.0, 0.0),
    solarMass,
    0.0)

  let jupiter = Body(
    Vec3(4.8414314424647209, -1.16032004402742839, -0.103622044471123109),
    Vec3( 1.66007664274403694e-03 * daysPerYear,
          7.69901118419740425e-03 * daysPerYear,
         -6.90460016972063023e-05 * daysPerYear),
    9.54791938424326609e-04 * solarMass,
    0.0)

  let saturn = Body(
    Vec3(8.34336671824457987, 4.12479856412430479, -4.03523417114321381e-01),
    Vec3(-2.76742510726862411e-03 * daysPerYear,
          4.99852801234917238e-03 * daysPerYear,
          2.30417297573763929e-05 * daysPerYear),
    2.85885980666130812e-04 * solarMass,
    0.0)

  let uranus = Body(
    Vec3(1.28943695621391310e+01, -1.51111514016986312e+01, -2.23307578892655734e-01),
    Vec3( 2.96460137564761618e-03 * daysPerYear,
          2.37847173959480950e-03 * daysPerYear,
         -2.96589568540237556e-05 * daysPerYear),
    4.36624404335156298e-05 * solarMass,
    0.0)

  let neptune = Body(
    Vec3(1.53796971148509165e+01, -2.59193146099879641e+01, 1.79258772950371181e-01),
    Vec3( 2.68067772490389322e-03  * daysPerYear,
          1.62824170038242295e-03  * daysPerYear,
         -9.51592254519715870e-05 * daysPerYear),
    5.15138902046611451e-05 * solarMass,
    0.0)

  var bodies = [sun, jupiter, saturn, uranus, neptune]

  var p = Vec3(0.0, 0.0, 0.0)

  for i in 0..<bodies.count {
    p.x = p.x + bodies[i].v.x * bodies[i].m
    p.y = p.y + bodies[i].v.y * bodies[i].m
    p.z = p.z + bodies[i].v.z * bodies[i].m
  }

  bodies[0].v = Vec3(
    0.0 - p.x / solarMass,
    0.0 - p.y / solarMass,
    0.0 - p.z / solarMass)

  for _ in 0..<iterations { 
    advance(&bodies, planetCount, 0.01)
  }

  return Int(energy(bodies, planetCount) * 100000)
}

benchmark(CommandLine.arguments, run)
