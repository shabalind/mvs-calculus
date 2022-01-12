  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  func f85(_ v0: s0, _ v1: [Double]) -> s0 {
    let v17: s1 = s1(p0: v0, p1: v0)
    var v33: s0 = v0
    var v32: s1 = v17
    v32.p1 = v33
    let v18: s0 = v32.p0
    return v18
  }
  func f83(_ v0: s1, _ v1: s0) -> s1 {
    let v3: [s1] = [v0, v0, v0, v0, v0, v0]
    let v7: s1 = v3[0]
    let v4: s0 = v7.p1
    let v5: s1 = v3[4]
    let v8: s0 = v5.p1
    let v10: [[Double]] = v4.p0
    var v2: [s1] = v3
    var v15: [s1] = v2
    let v9: [Double] = v10[1]
    v2 = v15
    let v12: s0 = f85(v1, v9)
    v2[3] = v5
    let v24: s1 = v15[0]
    let v22: s0 = f85(v12, v9)
    let v23: s1 = v15[0]
    v2[4] = v24
    let v45: [[Double]] = v1.p1
    var v33: s1 = v23
    v33.p0 = v1
    v2[0] = v24
    v15[1] = v5
    v33.p0 = v12
    let v29: [[Double]] = v1.p0
    let v48: [Double] = v29[1]
    let v50: s1 = v3[2]
    let v70: s0 = f85(v22, v48)
    let v63: [Double] = v45[0]
    var v43: s0 = v8
    let v44: s0 = f85(v70, v63)
    let v140: [[Double]] = v44.p0
    var v80: s1 = v24
    v2 = v3
    v80.p0 = v70
    v15[2] = v23
    v15[5] = v50
    let v111: [[Double]] = v44.p1
    v15[4] = v33
    v43.p1 = v111
    v80.p1 = v43
    v43.p0 = v140
    return v80
  }
  func f82(_ v0: s1) -> s1 {
    let v2: [s1] = [v0, v0, v0, v0, v0]
    let v8: s0 = v0.p1
    let v6: s1 = f83(v0, v8)
    var v5: s0 = v8
    let v7: [[Double]] = v8.p1
    var v4: [s1] = v2
    v4[3] = v6
    v4[2] = v0
    let v3: [[Double]] = v8.p0
    let v10: s1 = f83(v0, v5)
    var v1: s1 = v6
    v5.p1 = v7
    let v13: s1 = v4[3]
    let v12: [Double] = v7[0]
    v4[3] = v10
    var v15: [[Double]] = v3
    v15[0] = v12
    v15[0] = v12
    let v27: s0 = f85(v5, v12)
    let v37: [Double] = v15[0]
    let v35: s0 = f85(v8, v12)
    v5.p0 = v15
    let v29: s0 = f85(v5, v37)
    v1.p1 = v27
    let v23: [Double] = v7[0]
    v1.p1 = v8
    let v47: [[Double]] = v35.p0
    v4[4] = v1
    v5.p0 = v47
    v1.p1 = v5
    let v57: s0 = v13.p1
    let v48: s1 = s1(p0: v29, p1: v57)
    v5.p1 = v15
    v1.p1 = v57
    v15[1] = v23
    v5.p0 = v15
    v1.p1 = v5
    return v48
  }
  func f79(_ v0: s0, _ v1: s0) -> s0 {
    var v7: s0 = v1
    let v3: s1 = s1(p0: v1, p1: v0)
    let v5: s1 = f82(v3)
    var v11: s1 = v5
    var v6: s1 = v11
    let v9: s1 = f83(v11, v1)
    let v4: s1 = f82(v6)
    let v13: s0 = v4.p0
    let v14: s0 = v9.p1
    let v19: s0 = v3.p0
    v6.p0 = v7
    let v30: [[Double]] = v14.p0
    let v26: [Double] = v30[0]
    var v20: [Double] = v26
    var v25: s1 = v5
    let v24: s0 = f85(v1, v20)
    let v33: s1 = f83(v9, v24)
    let v34: [s1] = [v9, v4, v5, v25, v33]
    let v63: [[Double]] = v13.p0
    v7.p1 = v63
    let v27: s1 = v34[4]
    let v46: s0 = v4.p0
    let v49: s0 = v33.p0
    v6.p1 = v19
    let v125: s0 = v5.p1
    let v55: [[Double]] = v46.p0
    let v65: s0 = v27.p0
    v6.p1 = v125
    v7.p0 = v55
    v25.p0 = v49
    return v65
  }
  func f72(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v5: s0 = v4
    let v6: [[Double]] = v5.p1
    let v7: [[Double]] = v0.p0
    v4.p1 = v7
    let v13: [s0] = [v5, v0, v5, v5, v5, v5]
    v4.p1 = v6
    let v17: s0 = v13[3]
    let v35: [[Double]] = v17.p0
    let v45: s0 = f79(v5, v17)
    v5.p1 = v35
    return v45
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: s0, _ v2: Double) -> Double {
    let v4: s0 = f72(v1)
    let v6: [[Double]] = v4.p0
    let v3: [Double] = v6[1]
    let v15: [Double] = v6[0]
    let v24: Double = v3[0]
    let v87: Double = v15[0]
    let v65: Double = v87 + v24
    return v65
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), p1: s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]]))], [s1(p0: s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), p1: s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]))]]
    let v1: s0 = s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
