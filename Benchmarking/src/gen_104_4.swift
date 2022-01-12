  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f74(_ v0: [s0]) -> [s0] {
    let v4: s0 = v0[0]
    var v5: s0 = v4
    let v1: s0 = v0[0]
    let v6: [[Double]] = v4.p1
    let v8: [Double] = v6[0]
    let v9: s0 = v0[0]
    var v3: s0 = v5
    let v2: [Double] = v6[1]
    let v14: [[Double]] = v9.p1
    var v15: [[Double]] = v14
    v5.p0 = v6
    v15[1] = v2
    v5.p0 = v6
    let v19: s0 = v0[0]
    var v21: [s0] = v0
    var v24: s0 = v3
    var v51: s0 = v5
    v51.p1 = v15
    v21[0] = v1
    v15[1] = v8
    var v57: [s0] = v21
    v21[0] = v51
    v57[0] = v24
    v5.p1 = v6
    v21[0] = v19
    v21[0] = v9
    return v57
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    let v3: [s0] = v0[0]
    let v6: [s0] = f74(v3)
    var v11: [s0] = v6
    let v8: [s0] = f74(v11)
    let v10: [s0] = f74(v8)
    let v24: s0 = v8[0]
    var v29: s0 = v24
    let v25: [[Double]] = v29.p1
    let v43: s0 = v10[0]
    var v47: [[Double]] = v25
    let v63: [[Double]] = v29.p0
    v29.p0 = v63
    let v39: [[Double]] = v43.p0
    v29.p1 = v25
    v29.p0 = v39
    let v117: [Double] = v47[1]
    v11[0] = v43
    v29.p1 = v47
    let v72: Double = v117[0]
    return v72
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]])], [s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])], [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]])]]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
