  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f58(_ v0: s1, _ v1: [s0]) -> s1 {
    let v5: [[s0]] = [v1, v1, v1, v1]
    let v4: [s0] = v5[0]
    let v10: s0 = v1[1]
    let v9: [[s0]] = [v1, v4]
    let v21: s0 = v4[2]
    let v46: [s0] = v9[0]
    let v12: [[Double]] = v10.p0
    var v39: [[Double]] = v12
    let v14: [[Double]] = v21.p1
    var v30: [[Double]] = v39
    let v18: [s0] = v0.p1
    var v34: [s0] = v18
    let v32: [s0] = v0.p1
    var v61: [[Double]] = v14
    var v31: s1 = v0
    let v40: [Double] = v39[0]
    v31.p0 = v46
    let v29: [Double] = v30[0]
    let v76: s0 = v34[0]
    let v63: [[Double]] = v76.p0
    let v83: s0 = s0(p0: v63, p1: v61)
    var v51: [s0] = v32
    v61[0] = v29
    let v170: [s0] = v0.p1
    v39[0] = v40
    v30[0] = v29
    v31.p1 = v170
    let v94: [s0] = v31.p1
    v31.p0 = v4
    var v65: s1 = v31
    v51[1] = v83
    v65.p1 = v51
    v65.p1 = v51
    v65.p1 = v94
    v31.p1 = v32
    return v65
  }
  func f55(_ v0: s1) -> s1 {
    return v0
  }
  func f47(_ v0: s1, _ v1: s0) -> s1 {
    var v11: s1 = v0
    var v12: s1 = v11
    return v12
  }
  func f43(_ v0: s1, _ v1: s1) -> s1 {
    let v6: [s0] = v1.p0
    let v9: s1 = f58(v0, v6)
    let v22: s1 = f55(v9)
    let v59: s1 = f55(v22)
    let v24: [s0] = v59.p0
    let v146: s1 = f58(v9, v24)
    let v101: s1 = f55(v146)
    return v101
  }
  func f35(_ v0: s1, _ v1: s1) -> s1 {
    var v6: s1 = v0
    let v7: [s0] = v1.p0
    let v5: [s0] = v6.p1
    v6.p0 = v7
    let v4: s0 = v7[0]
    var v11: s0 = v4
    var v8: [s0] = v7
    let v18: [s0] = v6.p0
    let v17: [[Double]] = v4.p1
    let v15: [[Double]] = v4.p1
    var v21: [[Double]] = v17
    let v10: s0 = v7[0]
    var v16: s0 = v10
    let v12: s0 = s0(p0: v17, p1: v15)
    v11.p0 = v15
    v6.p0 = v7
    let v14: s0 = v18[0]
    v8[2] = v10
    v8[0] = v12
    var v34: [[Double]] = v15
    v8[0] = v10
    let v23: [Double] = v17[0]
    let v52: s1 = s1(p0: v8, p1: v5)
    v11.p1 = v34
    v11.p1 = v21
    let v19: s1 = f43(v0, v6)
    v21[0] = v23
    let v25: [[Double]] = v11.p1
    v8[1] = v12
    v11.p1 = v21
    var v22: [[Double]] = v25
    let v42: [[Double]] = v16.p0
    let v35: [s0] = v19.p0
    let v69: s0 = s0(p0: v42, p1: v21)
    v22[0] = v23
    let v68: [Double] = v17[0]
    let v50: s1 = f47(v52, v4)
    v8 = v35
    let v54: s1 = f47(v0, v69)
    v21[0] = v68
    v16.p1 = v22
    v16.p1 = v34
    v11 = v14
    let v66: s1 = f43(v50, v54)
    v8[1] = v69
    return v66
  }
  func f12(_ v0: s1) -> s1 {
    let v6: s1 = f35(v0, v0)
    let v2: [s0] = v6.p1
    let v5: s1 = f55(v0)
    let v8: s1 = f43(v6, v5)
    let v41: [s0] = v5.p0
    let v32: s1 = f43(v8, v5)
    let v56: s1 = f35(v0, v32)
    var v126: s1 = v56
    v126.p1 = v2
    v126.p0 = v41
    let v64: s1 = f55(v126)
    return v64
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s1], _ v2: Double) -> Double {
    let v6: s1 = v1[1]
    let v9: s1 = f12(v6)
    let v8: [s0] = v9.p0
    let v28: s0 = v8[0]
    let v24: [[Double]] = v28.p0
    let v16: [Double] = v24[0]
    let v23: Double = v16[0]
    return v23
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]])
    let v1: [s1] = [s1(p0: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]]), s0(p0: [[6.0]], p1: [[7.0]])], p1: [s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])]), s1(p0: [s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]]), s0(p0: [[16.0]], p1: [[17.0]])], p1: [s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]])]), s1(p0: [s0(p0: [[22.0]], p1: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0]]), s0(p0: [[26.0]], p1: [[27.0]])], p1: [s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])])]
    let v2: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
