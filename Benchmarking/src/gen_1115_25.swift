  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  struct s7 {
    var p0: [s1]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: [[s7]], _ v2: Double) -> Double {
    let v12: [s1] = v0[0]
    let v7: s1 = v12[0]
    let v8: [s0] = v7.p0
    let v15: s0 = v8[1]
    let v9: s1 = s1(p0: v8, p1: v15)
    let v14: [s0] = v9.p0
    let v39: s0 = v14[1]
    let v48: [[Double]] = v39.p1
    let v58: [Double] = v48[0]
    let v202: Double = v58[0]
    return v202
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]))]]
    let v1: [[s7]] = [[s7(p0: [s1(p0: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])], p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])), s1(p0: [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]])], p1: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]))], p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]))]]
    let v2: Double = 40.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 40.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
