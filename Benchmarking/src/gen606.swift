  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
  }
  func f21(_ v0: s0) -> s0 {
    return v0
  }
  func f16(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v1: Double = v4.p1
    let v8: [[Double]] = v4.p0
    var v3: [[Double]] = v8
    var v6: [[Double]] = v3
    v4.p1 = v1
    let v7: [Double] = v6[0]
    let v9: [[Double]] = v0.p0
    let v15: Double = v7[0]
    var v5: [[Double]] = v9
    var v10: Double = v1
    let v23: [[Double]] = [v7, v7, v7, v7, v7]
    let v16: s0 = f21(v4)
    let v12: [Double] = v23[4]
    let v25: s0 = f21(v16)
    let v14: [Double] = v8[0]
    let v17: [[Double]] = v4.p0
    let v20: s0 = f21(v25)
    let v19: Double = v7[0]
    v4.p1 = v15
    let v29: Double = v15 * v15
    v4.p1 = v10
    let v39: [Double] = v23[4]
    let v38: [[Double]] = v16.p0
    var v37: [[Double]] = v23
    let v42: Double = v20.p1
    let v24: [[Double]] = v0.p0
    var v35: [[Double]] = v17
    v4.p1 = v29
    v4.p1 = v42
    var v34: [[Double]] = v37
    v4.p0 = v24
    var v32: Double = v15
    let v51: [Double] = v5[1]
    v6[0] = v12
    var v49: [[Double]] = v38
    v4.p0 = v35
    let v43: [Double] = v34[4]
    let v31: Double = v29 * v19
    v37[0] = v12
    v37[3] = v14
    let v55: [[Double]] = v4.p0
    let v99: s0 = s0(p0: v3, p1: v31)
    v4.p1 = v32
    var v86: [Double] = v39
    v35[1] = v7
    let v101: s0 = f21(v99)
    v4.p0 = v55
    v5[1] = v43
    v34[1] = v12
    v34[0] = v7
    v3[1] = v51
    v4.p0 = v49
    v5[0] = v86
    return v101
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s1, _ v2: Double) -> Double {
    var v5: s0 = v0
    let v3: s0 = f16(v5)
    var v7: s1 = v1
    let v10: [[Double]] = v3.p0
    v7 = v1
    var v11: [[Double]] = v10
    v11 = v10
    let v8: [Double] = v11[1]
    v5.p1 = v2
    v11[0] = v8
    let v30: [[s0]] = v7.p1
    let v32: [s0] = v30[0]
    let v23: s0 = v32[0]
    v5 = v23
    v11[0] = v8
    v7 = v1
    let v38: Double = v8[0]
    return v38
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: 2.0)
    let v1: s1 = s1(p0: s0(p0: [[3.0], [4.0]], p1: 5.0), p1: [[s0(p0: [[6.0], [7.0]], p1: 8.0)], [s0(p0: [[9.0], [10.0]], p1: 11.0)]])
    let v2: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
