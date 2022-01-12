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
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: [[s2]], _ v2: [s0], _ v3: Double) -> Double {
    let v8: s0 = v2[0]
    let v6: [[Double]] = v8.p0
    var v11: [[Double]] = v6
    let v15: [Double] = v11[1]
    let v29: [Double] = v6[1]
    v11[2] = v29
    let v34: [Double] = v11[0]
    let v81: Double = v34[0]
    let v109: Double = v81 + v81
    v11[1] = v15
    return v109
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]))
    let v1: [[s2]] = [[s2(p0: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), p1: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]))], [s2(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]]))]]
    let v2: [s0] = [s0(p0: [[24.0], [25.0], [26.0]], p1: [[27.0]])]
    let v3: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
