  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  func f50(_ v0: s0) -> s0 {
    return v0
  }
  func f45(_ v0: s0, _ v1: s0) -> s0 {
    let v7: s0 = f50(v1)
    var v8: s0 = v0
    let v3: [[Double]] = v7.p0
    let v6: [[Double]] = v1.p0
    v8.p0 = v6
    v8.p0 = v6
    v8 = v0
    let v5: [Double] = v6[1]
    let v2: [[Double]] = v8.p0
    var v10: [[Double]] = v2
    v8.p0 = v3
    v8.p0 = v10
    v8.p0 = v6
    let v20: s0 = f50(v0)
    let v35: Double = v5[0]
    let v23: s0 = f50(v20)
    v8.p0 = v3
    var v25: s0 = v23
    v25.p1 = v35
    v25.p0 = v2
    let v38: s0 = f50(v25)
    return v38
  }
  func f44(_ v0: s0) -> s0 {
    var v4: s0 = v0
    let v3: [[Double]] = v4.p0
    let v2: Double = v0.p1
    let v8: s0 = f45(v0, v0)
    let v5: s0 = f50(v4)
    let v1: [s0] = [v0]
    var v14: s0 = v8
    v4.p1 = v2
    let v13: [[Double]] = v5.p0
    let v16: Double = v4.p1
    let v15: s0 = v1[0]
    let v28: [Double] = v13[1]
    var v20: [Double] = v28
    v4 = v15
    let v40: Double = v14.p1
    var v65: [[Double]] = v3
    v65[1] = v20
    var v71: Double = v40
    let v70: s0 = s0(p0: v65, p1: v40)
    v4.p1 = v71
    v14.p1 = v40
    v65[1] = v28
    v4.p1 = v16
    v65[1] = v20
    let v93: s0 = f45(v70, v5)
    return v93
  }
  func f42(_ v0: s0) -> s0 {
    let v5: Double = v0.p1
    let v2: Double = v5 + v5
    let v4: Double = v0.p1
    var v1: Double = v4
    var v8: Double = v5
    let v9: [[Double]] = v0.p0
    let v7: s0 = f44(v0)
    let v10: s0 = f50(v7)
    var v17: s0 = v0
    v17.p1 = v2
    let v20: s0 = f45(v10, v17)
    let v32: s0 = f45(v17, v20)
    v1 = v8
    let v26: s0 = f45(v32, v10)
    v17.p0 = v9
    let v87: s0 = f45(v20, v26)
    v17.p1 = v1
    return v87
  }
  func f41(_ v0: s0) -> s0 {
    var v3: s0 = v0
    let v9: s0 = f45(v0, v0)
    var v6: s0 = v3
    var v5: s0 = v6
    var v8: s0 = v9
    var v7: s0 = v8
    var v4: s0 = v0
    let v2: s0 = f42(v6)
    var v10: s0 = v7
    let v11: [[Double]] = v3.p0
    let v25: [Double] = v11[2]
    let v1: [Double] = v11[1]
    let v13: [[Double]] = v0.p0
    var v12: [[Double]] = v13
    var v16: s0 = v3
    v4.p0 = v11
    let v18: s0 = f42(v4)
    let v22: [Double] = v12[1]
    var v35: [Double] = v25
    let v23: Double = v25[0]
    var v14: s0 = v16
    let v24: Double = v18.p1
    let v26: Double = v9.p1
    var v15: Double = v23
    v3 = v2
    var v43: [Double] = v35
    v12[2] = v43
    v43[0] = v24
    v14.p0 = v11
    let v32: s0 = f45(v0, v2)
    let v34: s0 = f50(v10)
    var v58: [Double] = v22
    let v72: s0 = f44(v8)
    let v28: Double = v1[0]
    let v47: s0 = f42(v72)
    var v46: Double = v28
    let v68: Double = v34.p1
    v43 = v35
    let v39: Double = v5.p1
    v4.p1 = v46
    v43[0] = v26
    let v49: Double = v43[0]
    v35[0] = v49
    v58[0] = v15
    v58[0] = v46
    let v57: s0 = f45(v5, v4)
    v16 = v32
    v12[2] = v58
    v4.p1 = v68
    let v228: [Double] = v11[0]
    var v104: [Double] = v25
    var v82: [[Double]] = v13
    v12[2] = v22
    let v38: s0 = f45(v14, v57)
    v82[1] = v104
    v58 = v228
    let v157: [[Double]] = v47.p0
    v3.p1 = v23
    v7.p0 = v157
    v35[0] = v68
    v43[0] = v39
    v16.p0 = v82
    v5.p0 = v157
    var v169: [Double] = v58
    let v149: Double = v0.p1
    v4.p1 = v149
    v82[1] = v169
    v58[0] = v46
    v82[2] = v43
    return v38
  }
  func f40(_ v0: s0) -> s0 {
    let v5: [[Double]] = v0.p0
    var v7: s0 = v0
    let v4: [Double] = v5[2]
    let v9: Double = v4[0]
    let v6: s0 = f45(v7, v0)
    v7.p0 = v5
    let v8: s0 = f41(v6)
    let v19: [[Double]] = v8.p0
    let v18: Double = v4[0]
    v7.p1 = v18
    let v13: [[Double]] = v6.p0
    v7.p1 = v9
    let v37: s0 = f45(v8, v8)
    v7.p0 = v19
    v7.p0 = v13
    let v29: s0 = f42(v6)
    var v48: s0 = v29
    let v53: s0 = f45(v37, v48)
    return v53
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v6: s0 = f40(v0)
    let v19: [[Double]] = v6.p0
    let v17: [Double] = v19[0]
    let v21: Double = v17[0]
    return v21
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: 3.0)
    let v1: [s0] = [s0(p0: [[4.0], [5.0], [6.0]], p1: 7.0)]
    let v2: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
