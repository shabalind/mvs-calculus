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
    var p0: [s0]
    var p1: [[s1]]
  }
  func f76(_ v0: Double) -> Double {
    var v2: Double = v0
    var v4: Double = v0
    var v8: Double = v4
    let v1: Double = v8 / v2
    v2 = v4
    var v5: Double = v2
    var v10: Double = v1
    var v6: Double = v2
    var v7: Double = v1
    v5 = v8
    var v20: Double = v5
    let v21: [Double] = [v10, v6, v5, v7, v4]
    var v32: [Double] = v21
    v32[3] = v20
    let v29: Double = v32[0]
    return v29
  }
  func f34(_ v0: Double) -> Double {
    let v5: Double = f76(v0)
    let v2: Double = f76(v5)
    var v1: Double = v5
    let v19: Double = v2 * v1
    let v16: Double = f76(v5)
    let v29: Double = f76(v16)
    var v20: Double = v29
    let v13: [Double] = [v20, v29, v19]
    let v23: Double = v13[0]
    return v23
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s2, _ v2: Double) -> Double {
    var v3: Double = v2
    var v57: Double = v3
    let v19: Double = f34(v57)
    let v41: Double = f76(v19)
    return v41
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]
    let v1: s2 = s2(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]])], p1: [[s1(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))]])
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
