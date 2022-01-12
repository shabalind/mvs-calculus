  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [Double]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  func f75(_ v0: Double) -> Double {
    var v5: Double = v0
    var v1: Double = v5
    var v7: Double = v1
    var v2: Double = v7
    var v8: Double = v1
    var v4: Double = v5
    var v10: Double = v1
    var v6: Double = v1
    var v13: Double = v2
    var v9: Double = v0
    var v21: Double = v5
    var v39: Double = v13
    var v36: Double = v9
    let v37: [Double] = [v8, v39, v36, v4]
    var v66: [Double] = v37
    var v49: [Double] = v66
    v66[3] = v10
    var v44: [Double] = v49
    v7 = v6
    v2 = v21
    v66[1] = v10
    v66[2] = v2
    var v91: [Double] = v44
    var v58: [Double] = v91
    let v83: Double = v58[1]
    return v83
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    let v7: Double = f75(v1)
    return v7
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s0(p0: 0.0, p1: [1.0, 2.0, 3.0], p2: [[4.0]]), p1: s1(p0: [s0(p0: 5.0, p1: [6.0, 7.0, 8.0], p2: [[9.0]])], p1: s0(p0: 10.0, p1: [11.0, 12.0, 13.0], p2: [[14.0]])))]]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
