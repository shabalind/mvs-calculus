  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
  }
  struct s3 {
    var p0: s1
    var p1: s0
  }
  struct s4 {
    var p0: s3
    var p1: [s1]
  }
  struct s6 {
    var p0: s1
    var p1: [[s2]]
  }
  func f92(_ v0: Double) -> Double {
    var v11: Double = v0
    var v15: Double = v11
    let v18: Double = v15 / v11
    return v18
  }
  @inline(never)
  func f0(_ v0: [[s6]], _ v1: [[s4]], _ v2: Double) -> Double {
    let v5: Double = f92(v2)
    let v9: Double = f92(v5)
    let v36: Double = v9 * v2
    return v36
  }
  func benchmark() {
    let v0: [[s6]] = [[s6(p0: s1(p0: s0(p0: [0.0, 1.0, 2.0], p1: [[3.0]]), p1: [[s0(p0: [4.0, 5.0, 6.0], p1: [[7.0]])], [s0(p0: [8.0, 9.0, 10.0], p1: [[11.0]])]]), p1: [[s2(p0: s0(p0: [12.0, 13.0, 14.0], p1: [[15.0]]), p1: [[s1(p0: s0(p0: [16.0, 17.0, 18.0], p1: [[19.0]]), p1: [[s0(p0: [20.0, 21.0, 22.0], p1: [[23.0]])], [s0(p0: [24.0, 25.0, 26.0], p1: [[27.0]])]])], [s1(p0: s0(p0: [28.0, 29.0, 30.0], p1: [[31.0]]), p1: [[s0(p0: [32.0, 33.0, 34.0], p1: [[35.0]])], [s0(p0: [36.0, 37.0, 38.0], p1: [[39.0]])]])]])]])]]
    let v1: [[s4]] = [[s4(p0: s3(p0: s1(p0: s0(p0: [40.0, 41.0, 42.0], p1: [[43.0]]), p1: [[s0(p0: [44.0, 45.0, 46.0], p1: [[47.0]])], [s0(p0: [48.0, 49.0, 50.0], p1: [[51.0]])]]), p1: s0(p0: [52.0, 53.0, 54.0], p1: [[55.0]])), p1: [s1(p0: s0(p0: [56.0, 57.0, 58.0], p1: [[59.0]]), p1: [[s0(p0: [60.0, 61.0, 62.0], p1: [[63.0]])], [s0(p0: [64.0, 65.0, 66.0], p1: [[67.0]])]])])]]
    let v2: Double = 68.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 68.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
