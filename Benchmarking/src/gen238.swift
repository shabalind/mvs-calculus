  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
  }
  func f21(_ v0: s0) -> s0 {
    var v7: s0 = v0
    let v5: [[Double]] = v7.p2
    v7.p0 = v5
    var v4: [[Double]] = v5
    let v8: [Double] = v4[1]
    v4[0] = v8
    v7.p2 = v4
    let v3: Double = v8[0]
    let v9: [[Double]] = v7.p0
    let v1: [[Double]] = v0.p1
    let v2: [Double] = [v3]
    var v6: Double = v3
    let v10: [[Double]] = v7.p0
    v7.p0 = v4
    let v13: Double = v2[0]
    v7 = v0
    let v11: [[Double]] = v0.p2
    var v12: [Double] = v2
    let v18: [[Double]] = v7.p1
    let v20: [[Double]] = v0.p1
    v4[1] = v2
    var v25: Double = v13
    let v19: [Double] = v18[0]
    let v14: s0 = s0(p0: v10, p1: v1, p2: v10)
    v4[1] = v12
    var v17: Double = v6
    v4[1] = v19
    let v16: [[Double]] = v14.p2
    v7.p2 = v9
    v4[0] = v19
    v12[0] = v17
    v7.p0 = v11
    let v45: [[Double]] = v14.p1
    var v39: s0 = v14
    let v32: [[Double]] = v0.p1
    let v47: [[Double]] = v39.p0
    v12[0] = v25
    v39.p1 = v18
    v39.p0 = v16
    let v54: s0 = s0(p0: v4, p1: v45, p2: v47)
    v4[1] = v2
    let v51: Double = v8[0]
    v7.p1 = v32
    v39.p0 = v5
    v39.p1 = v20
    v12[0] = v51
    return v54
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v5: s0 = f21(v0)
    let v8: [[Double]] = v5.p0
    let v3: [Double] = v8[0]
    let v31: Double = v3[0]
    var v139: Double = v31
    return v139
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]], p2: [[4.0], [5.0], [6.0]])
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
