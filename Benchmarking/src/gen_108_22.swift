  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f29(_ v0: s1) -> s1 {
    var v7: s1 = v0
    var v1: s1 = v7
    var v5: s1 = v1
    let v2: s0 = v0.p1
    let v3: s0 = v5.p1
    var v6: s0 = v3
    let v10: [[Double]] = v2.p0
    v1.p1 = v6
    var v12: s0 = v3
    var v16: s0 = v12
    let v20: [[Double]] = v3.p1
    let v28: [[Double]] = v6.p1
    var v21: s1 = v7
    let v22: s1 = s1(p0: v12, p1: v16)
    let v52: [[Double]] = v2.p1
    v5.p0 = v2
    let v31: s0 = v21.p1
    let v44: s0 = v0.p0
    let v37: [Double] = v52[0]
    let v43: s0 = v22.p0
    var v23: [[Double]] = v10
    let v30: [[Double]] = v31.p0
    v23[0] = v37
    let v46: s0 = s0(p0: v30, p1: v20)
    v21.p0 = v46
    var v32: s1 = v22
    let v51: [[Double]] = v44.p1
    let v72: s0 = v0.p0
    v21.p0 = v6
    v32.p1 = v31
    var v115: s0 = v46
    let v45: [[Double]] = v31.p1
    v7.p0 = v6
    let v129: [[Double]] = v43.p1
    let v79: [[[Double]]] = [v20, v28, v51, v129, v52, v45, v129]
    v6 = v115
    v12.p1 = v52
    let v65: [[Double]] = v79[0]
    v6.p0 = v23
    v115.p1 = v65
    v12 = v16
    v5.p1 = v72
    v5.p0 = v43
    return v32
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v7: s1 = f29(v0)
    let v3: s0 = v7.p0
    let v4: [Double] = [v1, v1, v1, v1]
    let v2: Double = v4[1]
    let v6: [[Double]] = v3.p1
    let v16: [Double] = v6[1]
    var v74: [Double] = v16
    v74[0] = v2
    let v143: Double = v74[0]
    return v143
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]))
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
