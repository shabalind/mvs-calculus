  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f44(_ v0: s0) -> s0 {
    let v2: [[Double]] = v0.p0
    var v4: [[Double]] = v2
    let v17: s0 = s0(p0: v4, p1: v4)
    return v17
  }
  func f41(_ v0: Double, _ v1: s0) -> Double {
    var v3: s0 = v1
    let v5: [[Double]] = v3.p1
    var v2: [[Double]] = v5
    let v4: s0 = f44(v3)
    v3.p0 = v5
    let v9: [Double] = v5[1]
    let v6: [[[Double]]] = [v2]
    let v7: s0 = f44(v4)
    let v8: Double = v9[0]
    let v16: [[Double]] = v6[0]
    let v17: [Double] = v16[0]
    let v19: s0 = f44(v1)
    v3.p0 = v5
    v2[2] = v17
    v2[1] = v9
    let v26: [[Double]] = v7.p0
    v3.p1 = v16
    let v36: Double = v17[0]
    let v57: [[Double]] = v19.p1
    var v31: Double = v36
    let v53: Double = v31 / v8
    v3.p0 = v57
    v3.p1 = v26
    return v53
  }
  func f15(_ v0: s0) -> s0 {
    let v9: s0 = f44(v0)
    var v28: s0 = v9
    return v28
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: s0 = f44(v0)
    var v8: s0 = v3
    let v2: s0 = f15(v3)
    let v4: [s0] = [v0, v2, v8, v0, v8]
    let v5: s0 = f44(v2)
    let v9: [[Double]] = v5.p0
    var v7: [s0] = v4
    v8.p1 = v9
    let v6: [[Double]] = v8.p1
    v8.p1 = v6
    var v17: [[Double]] = v6
    let v10: [Double] = v17[0]
    let v12: [Double] = v9[2]
    var v31: [[Double]] = v9
    let v21: [Double] = [v1, v1, v1, v1]
    let v39: Double = v12[0]
    var v19: [Double] = v21
    v8.p1 = v6
    let v15: [[Double]] = v2.p1
    let v28: [Double] = v31[1]
    let v50: [[Double]] = v5.p1
    let v33: s0 = v7[2]
    let v59: Double = f41(v39, v5)
    let v20: Double = f41(v59, v33)
    v8.p1 = v15
    let v26: [[Double]] = v33.p1
    let v80: Double = v39 * v39
    let v23: Double = v12[0]
    var v55: [Double] = v12
    let v51: Double = v80 + v23
    v7[2] = v5
    v17[2] = v10
    var v41: [Double] = v21
    let v49: Double = v28[0]
    let v43: Double = v1 * v1
    v8.p1 = v50
    v19[3] = v23
    var v119: [Double] = v12
    let v64: s0 = v7[4]
    v41[0] = v20
    v8.p1 = v26
    v41[1] = v51
    v55[0] = v59
    v41 = v19
    v8.p1 = v17
    let v92: s0 = v7[2]
    let v73: Double = v43 + v23
    v7[1] = v64
    v17[0] = v119
    let v156: [[Double]] = [v41, v21, v19, v41, v19, v41]
    let v105: [Double] = v156[4]
    let v116: Double = v105[0]
    let v140: [[Double]] = v92.p0
    v55[0] = v49
    v19[2] = v73
    v17[0] = v55
    v8.p0 = v140
    return v116
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]])
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
