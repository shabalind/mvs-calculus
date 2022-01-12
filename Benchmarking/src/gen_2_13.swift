  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: Double
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s4 {
    var p0: s0
    var p1: [s1]
  }
  func f75(_ v0: s1) -> s1 {
    return v0
  }
  func f72(_ v0: Double) -> Double {
    var v2: Double = v0
    var v1: Double = v0
    var v5: Double = v1
    var v6: Double = v0
    var v10: Double = v1
    let v8: [Double] = [v0, v2, v1, v6]
    var v11: Double = v6
    var v3: [Double] = v8
    v3[1] = v1
    v3 = v8
    v3[1] = v5
    let v9: Double = v8[2]
    var v18: [Double] = v3
    var v28: [Double] = v3
    let v13: [[Double]] = [v8, v28, v3]
    let v17: [Double] = v13[0]
    var v20: [[Double]] = v13
    v3[2] = v10
    var v14: [[Double]] = v20
    v20[0] = v17
    v14[1] = v28
    let v21: [Double] = v14[2]
    var v19: [Double] = v3
    v18[1] = v0
    let v12: [Double] = v13[0]
    var v29: [Double] = v17
    let v23: Double = v12[3]
    let v27: [Double] = v14[1]
    let v22: [[Double]] = [v27, v18, v17, v12, v17, v29, v17]
    v3[3] = v5
    v14[0] = v8
    v18[2] = v6
    var v31: [[Double]] = v22
    let v56: [Double] = v20[1]
    v19[1] = v1
    v14[0] = v27
    v31[6] = v56
    v29[0] = v11
    v10 = v9
    let v67: [[[Double]]] = [v31, v22, v22, v22, v31, v31]
    var v66: [[Double]] = v22
    let v52: [[Double]] = v67[1]
    v31 = v66
    let v44: [[[Double]]] = [v31, v52, v66, v52, v31, v22, v66]
    v20[2] = v17
    var v42: [[[Double]]] = v44
    let v76: [[Double]] = v67[4]
    v29[3] = v0
    let v43: [[Double]] = v42[5]
    v42[6] = v31
    v14[2] = v19
    v3[2] = v23
    v14[1] = v29
    v31 = v43
    v20 = v14
    v31 = v66
    let v81: [Double] = v76[4]
    let v103: Double = v3[3]
    v10 = v11
    let v59: Double = v21[0]
    v14[1] = v81
    v19[3] = v103
    return v59
  }
  func f69(_ v0: s0) -> s0 {
    let v7: [[Double]] = v0.p0
    let v2: Double = v0.p1
    let v4: [Double] = v7[0]
    let v12: Double = v0.p1
    var v17: Double = v2
    let v14: [[Double]] = v0.p0
    let v9: [[Double]] = v0.p0
    let v18: Double = v4[0]
    let v20: Double = f72(v17)
    let v24: Double = f72(v18)
    var v38: [[Double]] = v9
    let v27: [[Double]] = v0.p0
    v38[0] = v4
    let v32: Double = f72(v24)
    let v35: s0 = s0(p0: v38, p1: v20)
    let v28: [[Double]] = v35.p0
    var v23: s0 = v35
    v23.p0 = v14
    let v55: [Double] = v27[0]
    v23.p0 = v38
    v38[0] = v55
    v23.p1 = v32
    v23.p1 = v12
    v23.p0 = v28
    return v23
  }
  func f68(_ v0: s4, _ v1: s1) -> s4 {
    var v8: s4 = v0
    let v11: [s1] = v8.p1
    var v24: s4 = v0
    let v9: [[s1]] = [v11, v11]
    let v12: [s1] = v9[0]
    let v31: s0 = v24.p0
    var v29: s0 = v31
    v8.p1 = v11
    let v27: s4 = s4(p0: v29, p1: v12)
    return v27
  }
  func f51(_ v0: s1, _ v1: [[s0]]) -> s1 {
    let v6: s1 = f75(v0)
    let v3: s1 = f75(v6)
    let v8: s1 = f75(v6)
    var v2: [[s0]] = v1
    let v5: [[s0]] = v6.p1
    var v14: [[s0]] = v2
    let v41: [s0] = v5[0]
    let v51: [s0] = v14[0]
    let v38: s1 = s1(p0: v51, p1: v5)
    let v54: [s0] = v8.p0
    let v65: s1 = f75(v38)
    let v47: [s0] = v3.p0
    v14[0] = v47
    let v79: s1 = f75(v65)
    var v118: [[s0]] = v1
    let v73: [s0] = v118[0]
    v14 = v1
    v14[0] = v51
    var v367: s1 = v79
    v367.p0 = v41
    v367.p0 = v73
    v367.p0 = v54
    return v367
  }
  func f24(_ v0: s1, _ v1: s0) -> s0 {
    var v6: s0 = v1
    var v3: s1 = v0
    var v7: s1 = v3
    let v4: [s1] = [v3, v0, v0, v7]
    let v5: Double = v6.p1
    var v8: Double = v5
    let v9: [[s0]] = v7.p1
    let v11: Double = f72(v8)
    let v2: [s0] = v9[0]
    v7.p1 = v9
    let v16: s0 = f69(v1)
    var v17: s1 = v3
    v3.p1 = v9
    v6.p1 = v11
    var v21: s0 = v6
    let v33: s0 = f69(v1)
    let v15: s0 = f69(v21)
    let v24: s1 = v4[1]
    let v23: s0 = f69(v6)
    let v29: [s0] = v7.p0
    var v14: s0 = v16
    let v18: s1 = f75(v7)
    let v19: [[s0]] = v18.p1
    let v31: Double = f72(v11)
    var v52: [s0] = v29
    let v22: s1 = v4[3]
    let v49: [[s0]] = v17.p1
    v52[0] = v23
    let v26: Double = v33.p1
    v52[0] = v33
    v6.p1 = v11
    v52[0] = v14
    v52[0] = v15
    let v32: Double = f72(v26)
    let v41: [[s0]] = [v52]
    let v30: s1 = f51(v22, v41)
    let v51: [s0] = v3.p0
    var v45: [[s0]] = v19
    let v39: [s0] = v49[0]
    let v37: s0 = v52[0]
    v7.p0 = v39
    v21.p1 = v32
    v3.p0 = v51
    var v66: [s0] = v39
    v66[0] = v21
    let v36: s0 = f69(v23)
    let v58: [[s0]] = v30.p1
    v52[0] = v36
    var v46: s1 = v24
    let v91: [[s0]] = v24.p1
    v46.p0 = v2
    v3.p0 = v66
    v7.p0 = v2
    v14 = v21
    v6.p1 = v31
    v66[0] = v36
    v7.p1 = v49
    v6 = v36
    v21 = v36
    v7.p0 = v39
    v46.p1 = v58
    let v85: Double = v23.p1
    let v235: [[s0]] = v30.p1
    v14.p1 = v85
    v17.p1 = v91
    v52[0] = v1
    v3.p1 = v45
    let v349: [s0] = v46.p0
    v17.p1 = v235
    v7.p0 = v52
    v3.p0 = v52
    v3.p0 = v349
    return v37
  }
  @inline(never)
  func f0(_ v0: s4, _ v1: Double) -> Double {
    var v7: s4 = v0
    let v3: [s1] = v7.p1
    let v11: [s1] = v7.p1
    let v15: s1 = v3[0]
    v7.p1 = v3
    let v19: s4 = f68(v7, v15)
    let v20: s0 = v19.p0
    let v13: s1 = v11[0]
    let v9: s1 = f75(v13)
    let v33: [s1] = v7.p1
    v7.p1 = v33
    v7.p1 = v33
    let v14: [s1] = v19.p1
    let v57: s0 = f24(v9, v20)
    v7.p1 = v14
    let v97: s0 = v19.p0
    v7.p0 = v97
    v7.p0 = v97
    let v115: [[Double]] = v57.p0
    v7.p1 = v33
    let v138: [Double] = v115[0]
    let v144: Double = v138[0]
    return v144
  }
  func benchmark() {
    let v0: s4 = s4(p0: s0(p0: [[0.0]], p1: 1.0), p1: [s1(p0: [s0(p0: [[2.0]], p1: 3.0)], p1: [[s0(p0: [[4.0]], p1: 5.0)], [s0(p0: [[6.0]], p1: 7.0)], [s0(p0: [[8.0]], p1: 9.0)]])])
    let v1: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
