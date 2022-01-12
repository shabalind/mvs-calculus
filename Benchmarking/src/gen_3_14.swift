  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f33(_ v0: Double) -> Double {
    var v5: Double = v0
    var v7: Double = v5
    let v4: [Double] = [v5]
    v5 = v7
    var v2: [Double] = v4
    var v3: [Double] = v2
    var v16: [Double] = v3
    var v8: Double = v0
    v3[0] = v8
    v3[0] = v5
    v2[0] = v7
    v3[0] = v8
    v16[0] = v0
    v3[0] = v5
    let v24: Double = v16[0]
    v3[0] = v24
    return v24
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v7: Double = f33(v1)
    let v9: Double = f33(v7)
    let v10: Double = f33(v1)
    let v13: Double = f33(v9)
    let v25: Double = f33(v13)
    let v24: [Double] = [v9]
    let v30: Double = v24[0]
    let v33: Double = v24[0]
    let v146: [Double] = [v25, v25, v10, v30, v33, v10]
    var v89: [Double] = v146
    let v115: Double = v89[1]
    return v115
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]], p2: [[5.0], [6.0], [7.0]])], p1: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0], [12.0]], p2: [[13.0], [14.0], [15.0]]))
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
