  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  func f2(_ v0: [Double]) -> [Double] {
    var v2: [Double] = v0
    let v5: Double = v2[0]
    var v1: Double = v5
    let v3: [[Double]] = [v0, v0]
    v2[0] = v1
    v2[0] = v5
    var v9: Double = v1
    var v6: [Double] = v0
    v6[0] = v9
    v6[0] = v1
    var v8: [[Double]] = v3
    let v11: Double = v2[0]
    let v22: [[Double]] = [v0, v6]
    var v21: [[Double]] = v3
    v2[0] = v1
    v21[0] = v6
    v8[1] = v0
    v8[1] = v2
    let v28: [Double] = v22[1]
    var v48: [[Double]] = v8
    let v45: [Double] = v48[0]
    v48[0] = v28
    v2[0] = v11
    v48 = v21
    return v45
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [[s0]], _ v2: Double) -> Double {
    let v5: s1 = v0[0]
    let v3: s0 = v5.p0
    let v14: [[Double]] = v3.p0
    let v49: [Double] = v14[0]
    let v41: [Double] = f2(v49)
    let v21: [Double] = f2(v41)
    let v30: Double = v21[0]
    return v30
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: [[s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])]], p2: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))]
    let v1: [[s0]] = [[s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]])], [s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]])]]
    let v2: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
