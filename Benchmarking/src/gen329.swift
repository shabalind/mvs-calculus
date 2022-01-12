  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f50(_ v0: s1) -> s1 {
    var v37: s1 = v0
    return v37
  }
  func f41(_ v0: s0) -> s0 {
    var v7: s0 = v0
    var v8: s0 = v0
    var v2: s0 = v7
    var v3: s0 = v8
    let v10: [[Double]] = v3.p1
    let v4: [[Double]] = v2.p1
    v7.p1 = v4
    var v1: [[Double]] = v10
    var v12: [[Double]] = v4
    var v6: [[Double]] = v12
    let v22: [s0] = [v8, v0, v0, v7, v2, v2]
    let v31: [[Double]] = v2.p0
    let v19: [Double] = v1[0]
    let v28: [[Double]] = v0.p0
    v2 = v7
    v1[0] = v19
    var v18: [s0] = v22
    let v16: [Double] = v4[0]
    v7.p0 = v31
    v18[2] = v0
    let v24: [[Double]] = v3.p0
    var v21: [Double] = v16
    v18[0] = v3
    let v37: [[Double]] = v8.p1
    let v29: s0 = v22[4]
    v7.p1 = v6
    let v60: [Double] = v4[0]
    let v62: [[Double]] = v2.p0
    let v35: [[Double]] = v7.p1
    v6[0] = v19
    let v39: Double = v19[0]
    v1[0] = v21
    v7.p1 = v35
    v3.p0 = v24
    var v32: [[Double]] = v62
    v3.p0 = v62
    v2.p0 = v28
    v3.p0 = v32
    let v57: [[Double]] = v0.p1
    v6[0] = v60
    var v40: Double = v39
    let v61: [[Double]] = v29.p1
    v2.p1 = v37
    v7.p0 = v32
    v7.p1 = v35
    v7.p1 = v57
    v2.p1 = v61
    v21[0] = v40
    let v74: s0 = v18[5]
    v2.p0 = v31
    return v74
  }
  func f21(_ v0: s1, _ v1: s1) -> s1 {
    var v3: s1 = v1
    var v7: s1 = v3
    let v5: [s0] = v7.p0
    let v9: s1 = f50(v7)
    var v10: [s0] = v5
    v3.p0 = v10
    return v9
  }
  func f13(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v3: [[Double]] = v0.p0
    v6.p0 = v3
    var v12: s0 = v0
    let v20: s0 = f41(v6)
    v6 = v12
    let v25: s0 = f41(v20)
    return v25
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: Double) -> Double {
    var v8: [s0] = v0
    v8 = v0
    let v12: s0 = v8[0]
    v8[0] = v12
    v8 = v0
    let v11: s0 = f13(v12)
    let v17: [[Double]] = v11.p1
    v8[0] = v11
    let v24: s0 = v8[0]
    let v68: [Double] = v17[0]
    let v19: s0 = v8[0]
    v8[0] = v19
    let v23: s1 = s1(p0: v0, p1: v11)
    let v50: s0 = f13(v24)
    v8[0] = v50
    var v73: [Double] = v68
    let v30: s1 = f21(v23, v23)
    var v32: Double = v2
    let v47: Double = v68[0]
    v73[0] = v47
    v8[0] = v12
    let v84: Double = v73[0]
    let v80: s0 = v30.p1
    v8[0] = v80
    let v98: Double = v84 + v32
    return v98
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]
    let v1: [s0] = [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])]
    let v2: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
