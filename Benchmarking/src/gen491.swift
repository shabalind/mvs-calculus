  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f11(_ v0: s0, _ v1: s0) -> s0 {
    let v3: [s0] = [v1, v0, v1, v0, v1, v1, v0]
    var v2: s0 = v0
    var v5: [s0] = v3
    v5[5] = v1
    let v6: [[Double]] = v0.p0
    let v15: [[[Double]]] = [v6, v6, v6, v6]
    let v11: [[Double]] = v15[0]
    let v7: s0 = v5[1]
    var v10: [[Double]] = v6
    let v12: [[Double]] = v1.p0
    let v8: [[Double]] = v7.p0
    v2.p0 = v12
    var v9: [[Double]] = v8
    var v25: [[Double]] = v9
    let v14: [[Double]] = v7.p1
    let v20: [Double] = v14[0]
    v2.p1 = v14
    let v19: s0 = v5[3]
    v5[6] = v7
    let v47: [[Double]] = v15[1]
    let v17: [Double] = v25[2]
    let v37: Double = v17[0]
    let v22: s0 = s0(p0: v10, p1: v14)
    v25 = v11
    v2.p0 = v47
    let v35: [Double] = v14[0]
    var v64: [Double] = v17
    v64[0] = v37
    let v34: [[Double]] = v22.p0
    v2 = v0
    let v41: [[Double]] = v15[3]
    let v44: [[Double]] = v19.p1
    v25[2] = v35
    v2.p0 = v10
    v5[5] = v2
    v2.p1 = v14
    let v69: [[Double]] = v7.p0
    let v61: [Double] = v69[0]
    let v117: [[Double]] = v2.p1
    v10[0] = v61
    v5[5] = v2
    v2.p1 = v117
    v10[0] = v64
    v2.p0 = v41
    let v145: [[Double]] = v7.p0
    v2.p0 = v145
    v10 = v8
    let v167: s0 = s0(p0: v34, p1: v44)
    v25[0] = v20
    return v167
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: s0, _ v3: Double) -> Double {
    let v9: s0 = f11(v1, v2)
    let v4: [[Double]] = v9.p1
    var v5: Double = v3
    let v11: [Double] = v4[0]
    var v27: [Double] = v11
    let v15: Double = v27[0]
    v27[0] = v5
    return v15
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: s0 = s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])
    let v2: s0 = s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])
    let v3: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
