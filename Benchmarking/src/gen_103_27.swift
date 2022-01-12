  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [[s1]]
    var p1: s1
  }
  struct s6 {
    var p0: s2
    var p1: s0
  }
  struct s8 {
    var p0: [s0]
    var p1: [s6]
  }
  @inline(never)
  func f0(_ v0: [[s8]], _ v1: Double) -> Double {
    let v5: [s8] = v0[0]
    var v2: [[s8]] = v0
    let v7: [s8] = v2[0]
    let v6: s8 = v7[0]
    let v8: [s6] = v6.p1
    let v34: s6 = v8[1]
    let v15: s2 = v34.p0
    let v36: s1 = v15.p1
    v2[0] = v7
    v2[0] = v5
    let v61: Double = v1 + v1
    let v67: s0 = v36.p1
    let v89: [[Double]] = v67.p0
    let v64: [Double] = v89[2]
    let v108: Double = v64[0]
    let v79: Double = v61 + v108
    return v79
  }
  func benchmark() {
    let v0: [[s8]] = [[s8(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])], p1: [s6(p0: s2(p0: [[s1(p0: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]))]], p1: s1(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]))), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])), s6(p0: s2(p0: [[s1(p0: s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]]), p1: s0(p0: [[28.0], [29.0], [30.0]], p1: [[31.0]]))]], p1: s1(p0: s0(p0: [[32.0], [33.0], [34.0]], p1: [[35.0]]), p1: s0(p0: [[36.0], [37.0], [38.0]], p1: [[39.0]]))), p1: s0(p0: [[40.0], [41.0], [42.0]], p1: [[43.0]]))])]]
    let v1: Double = 44.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 44.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
