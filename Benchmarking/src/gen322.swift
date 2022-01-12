  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  func f76(_ v0: s0) -> s0 {
    let v1: [[Double]] = v0.p1
    let v6: [[Double]] = v0.p2
    let v4: [Double] = v6[0]
    var v2: s0 = v0
    let v5: [Double] = v6[0]
    v2 = v0
    v2 = v0
    var v8: [[Double]] = v6
    let v14: [[Double]] = v0.p0
    let v13: [[Double]] = v0.p3
    let v10: [Double] = v1[0]
    v2 = v0
    v8[0] = v4
    v8[0] = v4
    v2 = v0
    v2.p0 = v14
    let v22: [[Double]] = v0.p1
    v8[0] = v10
    let v19: [[Double]] = v0.p3
    v8[0] = v5
    var v28: [[Double]] = v8
    var v31: [[Double]] = v19
    v2.p0 = v14
    let v34: [[Double]] = v2.p3
    v2.p2 = v19
    var v32: s0 = v0
    v31[0] = v5
    let v38: [[Double]] = v0.p1
    v32.p3 = v34
    var v20: s0 = v0
    let v27: [[Double]] = v20.p0
    v2.p2 = v13
    var v110: [Double] = v4
    v32.p2 = v31
    let v49: [[Double]] = v32.p1
    var v42: [[Double]] = v6
    let v37: s0 = s0(p0: v27, p1: v49, p2: v28, p3: v28)
    v20.p3 = v42
    v20.p1 = v22
    let v52: [[Double]] = v20.p0
    var v71: [[Double]] = v38
    v20.p1 = v71
    v2.p0 = v52
    v42[0] = v110
    return v37
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v2: [s0] = v0[0]
    let v9: s0 = v2[0]
    var v29: s0 = v9
    let v19: [[Double]] = v29.p0
    let v25: s0 = f76(v29)
    let v23: [[Double]] = v25.p2
    var v65: [[Double]] = v23
    let v28: [[Double]] = v9.p1
    let v17: [[Double]] = v29.p0
    v29.p2 = v65
    let v37: [[Double]] = v25.p3
    let v46: [Double] = v17[0]
    v29.p1 = v28
    v29.p1 = v28
    v29.p1 = v28
    v29.p3 = v37
    var v58: [Double] = v46
    let v66: Double = v46[0]
    v29.p0 = v19
    v65[0] = v58
    return v66
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]], p2: [[5.0]], p3: [[6.0]])]]
    let v1: Double = 7.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 7.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
