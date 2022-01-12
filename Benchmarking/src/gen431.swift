  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f40(_ v0: [s0]) -> [s0] {
    var v5: [s0] = v0
    var v2: [s0] = v5
    let v3: s0 = v0[0]
    var v8: s0 = v3
    let v7: [[Double]] = v8.p0
    let v1: [Double] = v7[0]
    v2[0] = v3
    let v6: [Double] = v7[0]
    v5[1] = v8
    v8.p0 = v7
    v2[0] = v8
    v8.p0 = v7
    v8.p0 = v7
    var v10: [Double] = v1
    let v11: [[Double]] = v3.p0
    let v14: [[Double]] = v3.p1
    let v12: [[Double]] = v8.p0
    let v13: [[[Double]]] = [v11, v7, v12, v11, v11, v7]
    var v20: [Double] = v10
    var v19: [[Double]] = v7
    v8.p1 = v14
    let v27: [Double] = v7[0]
    v8.p1 = v14
    v5[0] = v3
    var v17: [[[Double]]] = v13
    v19 = v12
    let v29: [[Double]] = v3.p1
    v8.p1 = v14
    let v21: [[Double]] = v8.p1
    let v24: [[Double]] = v3.p0
    let v40: [[Double]] = v17[2]
    var v18: [[Double]] = v40
    v8.p0 = v24
    v18[0] = v6
    v8.p0 = v19
    let v43: s0 = v0[1]
    var v28: s0 = v3
    v28.p1 = v29
    v18[0] = v20
    var v31: s0 = v43
    let v59: Double = v10[0]
    let v30: [[Double]] = v8.p1
    var v50: [[Double]] = v21
    v31.p0 = v18
    let v39: [[s0]] = [v5, v2, v2, v5, v5, v0]
    let v72: s0 = v0[1]
    v20 = v1
    v8.p0 = v40
    var v63: [[Double]] = v30
    v63[0] = v1
    let v56: s0 = v5[1]
    let v70: [[Double]] = v56.p1
    v10[0] = v59
    v31.p1 = v14
    let v62: [[Double]] = v72.p1
    let v58: [[Double]] = v17[1]
    let v60: [[Double]] = v17[5]
    v8.p1 = v14
    v31.p0 = v58
    v18[0] = v27
    v28.p1 = v70
    v31.p1 = v63
    let v33: [[Double]] = v28.p0
    let v76: s0 = s0(p0: v58, p1: v62)
    let v68: Double = v27[0]
    v8.p0 = v60
    let v77: [s0] = v39[2]
    let v69: Double = v59 * v68
    v31.p1 = v30
    let v122: [[Double]] = v31.p0
    v20[0] = v69
    v8.p0 = v122
    v63 = v50
    var v116: [s0] = v2
    v116[1] = v76
    v8.p0 = v33
    v116 = v77
    return v116
  }
  func f37(_ v0: s0) -> s0 {
    let v4: [[Double]] = v0.p1
    var v6: s0 = v0
    var v5: [[Double]] = v4
    v6.p1 = v4
    let v2: [Double] = v5[1]
    v6.p1 = v5
    v6.p1 = v5
    let v3: [[Double]] = v6.p1
    v5[0] = v2
    var v1: s0 = v6
    v1.p1 = v3
    v1 = v0
    let v38: [[Double]] = v1.p1
    v1.p1 = v38
    v1.p1 = v38
    var v46: s0 = v1
    v6 = v0
    return v46
  }
  func f36(_ v0: s0, _ v1: s0) -> s0 {
    let v2: [[Double]] = v1.p0
    var v5: [[Double]] = v2
    let v8: s0 = f37(v0)
    let v9: [Double] = v2[0]
    let v15: [[Double]] = v8.p1
    v5 = v2
    var v12: [[Double]] = v15
    v12[0] = v9
    let v33: [Double] = v12[0]
    var v13: [[Double]] = v5
    v5[0] = v33
    var v28: [[Double]] = v13
    let v70: s0 = s0(p0: v28, p1: v12)
    v12[1] = v33
    v13[0] = v33
    let v65: [Double] = v28[0]
    v12[0] = v65
    return v70
  }
  func f35(_ v0: s0, _ v1: s0) -> s0 {
    let v5: s0 = f36(v0, v0)
    let v4: s0 = f37(v1)
    let v6: s0 = f36(v0, v5)
    let v2: s0 = f37(v5)
    var v7: s0 = v0
    let v3: [[Double]] = v2.p0
    let v13: s0 = f37(v5)
    let v12: [[Double]] = v4.p0
    let v15: [[Double]] = v6.p0
    v7.p0 = v12
    let v24: s0 = f37(v7)
    let v22: s0 = f36(v5, v4)
    let v63: [Double] = v12[0]
    var v36: [[Double]] = v3
    let v32: [[Double]] = v7.p1
    v36[0] = v63
    let v17: [[Double]] = v5.p1
    v7.p1 = v17
    let v28: [[Double]] = v13.p1
    v7.p0 = v15
    let v87: [Double] = v28[0]
    var v90: [[Double]] = v36
    let v43: [Double] = v17[1]
    let v102: [[Double]] = v22.p0
    v7.p0 = v90
    var v85: s0 = v24
    let v134: [[Double]] = v13.p0
    v85.p0 = v102
    v85.p1 = v32
    let v137: s0 = f36(v85, v85)
    v7.p0 = v90
    v90[0] = v87
    let v65: [[Double]] = v4.p1
    v36 = v134
    v90 = v15
    v7.p1 = v65
    v36[0] = v43
    v7.p0 = v36
    return v137
  }
  func f29(_ v0: [s0]) -> [s0] {
    var v6: [s0] = v0
    let v3: [s0] = f40(v6)
    let v1: s0 = v0[1]
    let v4: s0 = f37(v1)
    let v13: s0 = v3[1]
    let v10: [s0] = f40(v3)
    let v25: [s0] = f40(v10)
    let v41: s0 = f35(v13, v4)
    let v22: [s0] = f40(v25)
    v6[1] = v41
    return v22
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v8: [s0] = f29(v0)
    let v11: s0 = v8[1]
    let v3: Double = v1 + v1
    let v30: Double = v3 + v1
    let v20: [[Double]] = v11.p0
    var v35: [[Double]] = v20
    let v40: [Double] = v35[0]
    let v27: Double = v40[0]
    var v54: [Double] = v40
    let v37: Double = v54[0]
    let v72: Double = v3 * v37
    v54[0] = v30
    v54[0] = v37
    var v148: Double = v27
    v54[0] = v148
    return v72
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0]]), s0(p0: [[3.0]], p1: [[4.0], [5.0]])]
    let v1: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
