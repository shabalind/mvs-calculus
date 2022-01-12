  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s1
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v7: s0 = v0.p1
    let v9: [[Double]] = v7.p0
    var v8: [[Double]] = v9
    let v12: [Double] = v9[1]
    let v32: [Double] = v8[1]
    let v13: Double = v12[0]
    v8[1] = v32
    let v48: Double = v32[0]
    var v54: Double = v13
    let v274: Double = v54 - v48
    return v274
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]], p2: [[4.0], [5.0]]), p1: [[s0(p0: [[6.0], [7.0]], p1: [[8.0], [9.0]], p2: [[10.0], [11.0]])], [s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]], p2: [[16.0], [17.0]])], [s0(p0: [[18.0], [19.0]], p1: [[20.0], [21.0]], p2: [[22.0], [23.0]])]]), p1: s0(p0: [[24.0], [25.0]], p1: [[26.0], [27.0]], p2: [[28.0], [29.0]]))
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
