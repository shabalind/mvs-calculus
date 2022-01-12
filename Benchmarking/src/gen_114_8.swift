  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  func f50(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v3: s0 = v0
    var v2: s0 = v0
    v3 = v7
    let v8: [[Double]] = v3.p1
    v2.p1 = v8
    let v4: [Double] = v8[0]
    v2 = v7
    var v6: [[Double]] = v8
    v2.p1 = v8
    v6[0] = v4
    var v14: [[Double]] = v6
    v3.p1 = v6
    let v12: [[Double]] = v0.p0
    var v15: [[Double]] = v12
    v2.p0 = v12
    v15[0] = v4
    v2.p0 = v12
    let v13: s0 = s0(p0: v15, p1: v14)
    var v11: [[Double]] = v14
    let v24: [[[Double]]] = [v11, v14, v14, v6, v8]
    let v43: [Double] = v6[0]
    v3.p1 = v6
    var v19: [[[Double]]] = v24
    v7.p0 = v15
    var v23: [[Double]] = v15
    let v26: [[Double]] = v2.p1
    var v47: [[Double]] = v8
    v2.p1 = v26
    let v32: [[Double]] = v0.p0
    let v65: [[Double]] = v19[2]
    v7.p0 = v32
    let v28: [[Double]] = v7.p0
    var v48: s0 = v0
    v2.p1 = v8
    var v80: s0 = v2
    v2.p0 = v28
    let v70: s0 = s0(p0: v23, p1: v65)
    let v150: [s0] = [v13, v48, v70, v80, v0, v7]
    let v83: [[Double]] = v0.p0
    v2.p1 = v8
    v6[0] = v4
    v48.p1 = v14
    v7.p1 = v47
    v7.p0 = v83
    var v100: [Double] = v43
    let v85: s0 = v150[2]
    v6[0] = v100
    v7.p1 = v8
    v11[0] = v43
    let v69: [[Double]] = v2.p1
    let v145: [[Double]] = v48.p0
    v3.p1 = v69
    v80.p0 = v145
    return v85
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v4: s1 = v0[1]
    let v3: s0 = v4.p0
    let v8: s0 = f50(v3)
    let v17: s0 = f50(v8)
    let v18: [[Double]] = v17.p0
    let v27: [Double] = v18[1]
    let v30: Double = v27[0]
    let v96: Double = v27[0]
    let v58: Double = v96 - v30
    var v132: Double = v58
    return v132
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])]), s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]]), s0(p0: [[18.0], [19.0]], p1: [[20.0]]), s0(p0: [[21.0], [22.0]], p1: [[23.0]])])]
    let v1: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
