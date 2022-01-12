  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f49(_ v0: s1) -> s1 {
    let v3: [s0] = v0.p1
    let v4: s0 = v0.p0
    let v8: [s0] = v0.p1
    let v1: [[Double]] = v4.p0
    var v5: s1 = v0
    let v10: [Double] = v1[0]
    v5.p1 = v3
    v5.p1 = v3
    let v2: [[s0]] = [v8, v3, v8]
    v5.p1 = v3
    var v14: [[Double]] = v1
    let v16: [s0] = v0.p1
    v14[0] = v10
    let v33: [s0] = v5.p1
    let v43: s0 = s0(p0: v14)
    v14[0] = v10
    let v20: [s0] = v2[2]
    let v32: s1 = s1(p0: v43, p1: v20)
    v5.p1 = v8
    let v48: s0 = v5.p0
    let v44: [[Double]] = v48.p0
    v14 = v44
    let v70: s0 = v16[1]
    v5.p1 = v33
    let v74: [s0] = v32.p1
    var v80: s1 = v5
    v80.p1 = v3
    v5.p0 = v70
    v5.p1 = v74
    return v80
  }
  func f31(_ v0: s1, _ v1: s1) -> s1 {
    let v3: s1 = f49(v1)
    let v8: s0 = v1.p0
    var v12: s1 = v3
    v12.p0 = v8
    return v12
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    var v3: s1 = v0
    let v2: s1 = f49(v3)
    var v5: s1 = v2
    let v11: s1 = f31(v0, v3)
    let v4: s0 = v11.p0
    let v10: [s0] = v5.p1
    let v15: [[Double]] = v4.p0
    var v29: [[Double]] = v15
    v3.p1 = v10
    let v16: [Double] = v29[0]
    var v40: [[Double]] = v15
    v40[0] = v16
    let v79: [Double] = v40[0]
    v5.p1 = v10
    v3.p0 = v4
    let v135: Double = v79[0]
    return v135
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0]]), p1: [s0(p0: [[1.0]]), s0(p0: [[2.0]])])
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
