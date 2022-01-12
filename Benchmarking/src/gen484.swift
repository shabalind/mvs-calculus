  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: s0
  }
  struct s5 {
    var p0: s2
    var p1: s2
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v2: s2 = v0.p1
    let v3: s0 = v2.p0
    var v4: s0 = v3
    var v6: s0 = v4
    let v8: s0 = v2.p0
    let v27: [[Double]] = v3.p0
    let v16: s0 = v2.p0
    let v20: s2 = s2(p0: v4)
    let v22: [Double] = v27[0]
    let v23: [[Double]] = v16.p0
    let v26: s0 = v2.p0
    var v24: s2 = v20
    var v40: s0 = v16
    let v21: [Double] = v23[0]
    let v71: [[Double]] = v6.p0
    let v37: [Double] = v71[0]
    let v43: [[Double]] = [v21, v37, v22]
    let v72: [[Double]] = v16.p1
    let v45: [[Double]] = v40.p0
    v6.p1 = v72
    var v55: [[Double]] = v72
    v4.p0 = v27
    let v50: s0 = v24.p0
    let v78: [[Double]] = v8.p0
    v6 = v50
    v4.p0 = v45
    let v34: [Double] = v43[2]
    var v97: s0 = v26
    var v112: [[Double]] = v72
    v97.p0 = v78
    var v53: s0 = v97
    v4.p1 = v112
    v24.p0 = v53
    v24.p0 = v16
    let v107: Double = v34[0]
    v4.p1 = v55
    v6.p1 = v55
    return v107
  }
  func benchmark() {
    let v0: s5 = s5(p0: s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]])), p1: s2(p0: s0(p0: [[3.0]], p1: [[4.0], [5.0]])))
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
