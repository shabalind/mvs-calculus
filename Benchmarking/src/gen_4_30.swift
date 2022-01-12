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
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: s2
    var p1: s1
  }
  struct s9 {
    var p0: s1
    var p1: [[s3]]
  }
  func f47(_ v0: Double) -> Double {
    let v5: Double = v0 / v0
    var v3: Double = v5
    var v13: Double = v3
    v3 = v5
    var v10: Double = v13
    var v1: Double = v10
    var v14: Double = v1
    var v21: Double = v14
    var v20: Double = v21
    return v20
  }
  func f15(_ v0: Double) -> Double {
    let v4: Double = v0 / v0
    let v1: Double = f47(v4)
    let v2: [Double] = [v1, v1, v4, v4]
    let v5: Double = f47(v0)
    var v8: Double = v1
    var v7: [Double] = v2
    let v6: Double = v7[2]
    v7[2] = v1
    v7[2] = v4
    let v9: Double = v2[2]
    var v12: [Double] = v2
    let v14: Double = f47(v9)
    let v10: Double = f47(v0)
    var v11: [Double] = v12
    let v18: Double = v7[1]
    var v21: [Double] = v11
    let v28: Double = v7[3]
    var v16: Double = v6
    let v22: Double = v5 + v4
    let v35: Double = f47(v22)
    var v19: Double = v18
    v16 = v35
    v12[3] = v6
    v12[3] = v19
    let v36: [Double] = [v35, v6, v10, v16]
    v12[2] = v22
    var v39: [Double] = v36
    let v40: Double = f47(v28)
    v12[1] = v5
    let v30: Double = v39[0]
    let v29: Double = v21[3]
    let v41: [[Double]] = [v36, v39, v11, v2, v39]
    v21 = v12
    let v57: Double = v21[3]
    var v55: [[Double]] = v41
    var v83: Double = v8
    v11[0] = v5
    var v54: [[Double]] = v55
    v7[2] = v57
    let v47: Double = f47(v83)
    v55 = v54
    v11[2] = v29
    let v95: Double = v30 * v4
    v21[2] = v28
    v39[2] = v14
    let v34: [Double] = v54[1]
    v11[3] = v47
    var v77: Double = v40
    v21[2] = v77
    v12[2] = v30
    let v66: Double = v34[3]
    v7[0] = v95
    return v66
  }
  @inline(never)
  func f0(_ v0: s9, _ v1: Double) -> Double {
    let v6: s1 = v0.p0
    let v7: s0 = v6.p1
    var v18: Double = v1
    let v21: [[Double]] = v7.p0
    let v47: [Double] = v21[0]
    let v74: Double = v47[0]
    let v117: Double = f15(v74)
    let v129: Double = f47(v18)
    let v146: Double = v117 / v129
    return v146
  }
  func benchmark() {
    let v0: s9 = s9(p0: s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), p1: [[s3(p0: s2(p0: s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]])), p1: s1(p0: s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]]), p1: s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]))), p1: s1(p0: s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), p1: s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])))]])
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
