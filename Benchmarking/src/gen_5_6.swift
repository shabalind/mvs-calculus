  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f118(_ v0: s0) -> s0 {
    var v6: s0 = v0
    let v2: [[Double]] = v6.p0
    let v1: [[Double]] = v0.p1
    let v8: [[Double]] = v6.p1
    let v4: [Double] = v1[1]
    var v7: [[Double]] = v2
    let v14: [[Double]] = v6.p0
    let v11: [[Double]] = v0.p0
    let v15: [[Double]] = v0.p1
    var v16: s0 = v6
    var v34: [[Double]] = v2
    var v21: s0 = v0
    v16.p0 = v11
    let v18: [[Double]] = v21.p1
    let v17: [[Double]] = v6.p0
    let v28: [Double] = v15[1]
    v7[1] = v28
    v7[0] = v28
    v34 = v14
    v6.p1 = v1
    let v23: [Double] = v17[0]
    let v54: [[Double]] = v0.p1
    var v29: [[Double]] = v54
    let v84: [[Double]] = v6.p1
    v16.p0 = v34
    let v38: [Double] = v8[1]
    let v43: [[Double]] = v16.p0
    var v36: [[Double]] = v18
    var v30: [[Double]] = v43
    let v35: [Double] = v15[1]
    v6.p0 = v7
    let v56: [[Double]] = [v35, v4, v38, v38, v23]
    let v104: [Double] = v84[1]
    v36[0] = v28
    v29 = v84
    v21.p1 = v29
    v21.p1 = v36
    v6.p0 = v7
    var v122: [[Double]] = v56
    v16.p1 = v36
    v29 = v36
    v122 = v56
    var v42: [[Double]] = v30
    v42[1] = v104
    let v161: [Double] = v122[4]
    v34[1] = v161
    let v201: s0 = s0(p0: v42, p1: v54)
    var v94: s0 = v201
    return v94
  }
  func f107(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p0
    let v2: [Double] = v4[2]
    let v6: Double = v2[0]
    let v3: [[Double]] = v0.p0
    let v14: [[Double]] = v0.p1
    let v13: [Double] = v4[1]
    let v20: [Double] = v3[1]
    let v12: [[Double]] = v0.p1
    let v11: [Double] = v7[0]
    var v15: [[Double]] = v14
    v15[0] = v11
    var v29: s0 = v0
    let v17: s0 = f118(v29)
    v29.p1 = v12
    let v34: s0 = f118(v17)
    let v24: s0 = f118(v29)
    var v23: [Double] = v20
    let v35: [[Double]] = v34.p1
    v29.p1 = v14
    v15[1] = v23
    v23[0] = v6
    v15[0] = v20
    let v39: [[Double]] = v34.p1
    let v32: Double = v13[0]
    v15[0] = v2
    let v124: [[[Double]]] = [v14, v35, v15, v39, v35]
    let v52: [[Double]] = v124[2]
    v15 = v52
    v15[1] = v20
    let v79: s0 = s0(p0: v4, p1: v52)
    let v72: s0 = f118(v34)
    v23[0] = v32
    v23[0] = v6
    let v160: [s0] = [v72, v24, v24, v17, v34, v79, v0]
    let v130: s0 = v160[1]
    return v130
  }
  func f49(_ v0: s0) -> s0 {
    var v2: s0 = v0
    var v3: s0 = v0
    let v1: s0 = f107(v2)
    let v9: [[Double]] = v2.p0
    let v6: s0 = f118(v1)
    let v5: s0 = f118(v2)
    var v7: [[Double]] = v9
    let v8: [[Double]] = v3.p1
    let v4: [[Double]] = v5.p0
    let v11: s0 = f118(v6)
    let v12: s0 = f107(v3)
    var v18: s0 = v12
    let v10: s0 = f107(v5)
    let v14: [Double] = v4[1]
    var v13: [[Double]] = v7
    let v20: [[[Double]]] = [v4, v7]
    v7[0] = v14
    let v21: s0 = f107(v0)
    let v25: [Double] = v4[2]
    let v17: s0 = f107(v10)
    let v39: [[Double]] = v5.p0
    let v26: s0 = f118(v17)
    v7[0] = v25
    let v32: [[Double]] = v1.p0
    let v53: s0 = f107(v26)
    let v36: [[Double]] = v11.p1
    let v19: s0 = f118(v18)
    v18.p0 = v32
    var v31: [[Double]] = v8
    var v28: [[[Double]]] = v20
    v31[1] = v25
    let v35: [[Double]] = v3.p1
    let v29: [[Double]] = v28[1]
    let v34: s0 = f107(v19)
    let v44: [[Double]] = v19.p1
    v18.p0 = v7
    let v40: [Double] = v7[2]
    let v27: [Double] = v44[0]
    v3.p0 = v4
    let v54: [Double] = v31[1]
    v7[0] = v27
    v7[2] = v40
    let v51: [[Double]] = v12.p0
    let v62: [[Double]] = v34.p0
    v28[1] = v13
    var v91: [[Double]] = v39
    let v74: [[Double]] = v21.p1
    v3.p1 = v36
    var v137: [Double] = v54
    let v125: [[Double]] = v53.p0
    let v69: s0 = f118(v5)
    v7 = v51
    v3.p0 = v13
    v3.p1 = v44
    v2.p0 = v125
    v18.p0 = v13
    let v80: [[Double]] = v19.p1
    v2.p1 = v8
    v13 = v91
    v31 = v80
    v2.p0 = v62
    v13[0] = v137
    v91 = v7
    let v94: s0 = s0(p0: v29, p1: v36)
    v3.p1 = v8
    v3.p1 = v35
    v3.p1 = v74
    let v87: [[Double]] = v69.p0
    v2.p0 = v87
    return v94
  }
  func f4(_ v0: s0) -> s0 {
    let v1: s0 = f107(v0)
    var v4: s0 = v0
    var v5: s0 = v1
    let v6: s0 = f49(v4)
    let v3: [s0] = [v1, v4, v5, v6]
    let v7: [[Double]] = v4.p1
    v5.p1 = v7
    let v10: [[Double]] = v1.p0
    v4.p1 = v7
    v5.p0 = v10
    let v84: [[s0]] = [v3, v3]
    v4.p0 = v10
    let v106: [s0] = v84[0]
    var v97: [s0] = v106
    let v77: s0 = v97[2]
    return v77
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: [s0] = [v0, v0, v0, v0, v0, v0, v0]
    let v2: s0 = v7[0]
    let v3: s0 = f4(v0)
    let v6: [[Double]] = v2.p0
    let v9: s0 = f107(v3)
    var v8: [[Double]] = v6
    let v13: [Double] = v8[1]
    v8[2] = v13
    let v16: [Double] = v6[0]
    let v15: s0 = f4(v9)
    let v21: s0 = v7[5]
    let v18: [Double] = v6[2]
    v8 = v6
    let v17: s0 = f107(v15)
    let v63: [Double] = v6[2]
    v8[1] = v63
    var v35: [[Double]] = v8
    var v45: [Double] = v63
    let v29: [[Double]] = v21.p0
    let v60: [Double] = v29[1]
    v35[0] = v45
    let v19: [Double] = v35[0]
    var v83: Double = v1
    v8[0] = v18
    let v101: Double = v19[0]
    let v105: Double = v101 + v83
    let v68: [[Double]] = v17.p0
    v8[2] = v60
    v35[2] = v16
    let v172: [[Double]] = v2.p0
    v8 = v172
    v8 = v68
    return v105
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
