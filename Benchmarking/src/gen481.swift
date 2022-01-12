  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: s0
    var p1: [[s1]]
  }
  struct s4 {
    var p0: s2
    var p1: s0
  }
  func f39(_ v0: Double) -> Double {
    var v1: Double = v0
    let v7: Double = v0 + v1
    var v8: Double = v1
    var v5: Double = v1
    var v3: Double = v1
    let v13: Double = v1 * v5
    var v9: Double = v0
    v5 = v8
    v3 = v8
    let v10: [Double] = [v7]
    var v11: [Double] = v10
    v11[0] = v13
    let v17: Double = v11[0]
    let v30: Double = v11[0]
    v11[0] = v30
    v11[0] = v3
    var v14: Double = v8
    var v16: [Double] = v10
    v16[0] = v7
    let v36: Double = v10[0]
    var v34: Double = v7
    var v24: Double = v9
    v16[0] = v14
    v16[0] = v17
    var v21: Double = v24
    let v70: Double = v16[0]
    var v46: [Double] = v16
    let v59: [Double] = [v21, v30, v70, v1]
    let v37: Double = v46[0]
    v46[0] = v36
    var v71: [Double] = v59
    v16[0] = v36
    var v31: [Double] = v59
    var v55: Double = v24
    let v52: Double = v59[3]
    v11[0] = v37
    let v26: Double = v71[3]
    v16[0] = v34
    let v100: [[Double]] = [v31, v59, v31]
    v46[0] = v52
    v31[3] = v3
    v71[3] = v3
    v11[0] = v55
    v16[0] = v13
    let v128: [Double] = v100[2]
    v46[0] = v26
    let v136: Double = v128[0]
    v5 = v52
    return v136
  }
  @inline(never)
  func f0(_ v0: [s4], _ v1: Double) -> Double {
    let v13: Double = v1 / v1
    let v4: Double = f39(v13)
    var v76: Double = v4
    var v60: Double = v76
    return v60
  }
  func benchmark() {
    let v0: [s4] = [s4(p0: s2(p0: s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0], [3.0]]), p1: [[s1(p0: [s0(p0: [[4.0]], p1: [[5.0]], p2: [[6.0], [7.0]])], p1: [[s0(p0: [[8.0]], p1: [[9.0]], p2: [[10.0], [11.0]])]])], [s1(p0: [s0(p0: [[12.0]], p1: [[13.0]], p2: [[14.0], [15.0]])], p1: [[s0(p0: [[16.0]], p1: [[17.0]], p2: [[18.0], [19.0]])]])], [s1(p0: [s0(p0: [[20.0]], p1: [[21.0]], p2: [[22.0], [23.0]])], p1: [[s0(p0: [[24.0]], p1: [[25.0]], p2: [[26.0], [27.0]])]])]]), p1: s0(p0: [[28.0]], p1: [[29.0]], p2: [[30.0], [31.0]]))]
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
