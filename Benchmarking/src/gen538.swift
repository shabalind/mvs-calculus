  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
    var p4: [Double]
  }
  func f55(_ v0: [Double]) -> [Double] {
    var v3: [Double] = v0
    let v1: Double = v0[0]
    var v6: Double = v1
    let v4: Double = v0[1]
    let v2: Double = v3[0]
    v3[0] = v1
    let v10: Double = v0[0]
    v3[0] = v6
    var v5: Double = v2
    var v9: Double = v2
    var v8: [Double] = v0
    v3[0] = v1
    v8[1] = v1
    v8[0] = v4
    let v13: Double = v3[0]
    var v21: [Double] = v0
    v21[0] = v4
    v3[0] = v4
    let v45: Double = v8[1]
    var v12: [Double] = v3
    let v25: Double = v3[0]
    let v34: Double = v8[1]
    var v23: Double = v25
    v3[1] = v25
    v8[1] = v34
    let v29: Double = v0[0]
    v8[1] = v1
    v8[1] = v25
    v8[0] = v45
    v21[1] = v9
    var v43: Double = v1
    let v24: Double = v0[1]
    var v50: Double = v1
    let v16: Double = v3[1]
    let v18: Double = v12[1]
    var v19: [Double] = v8
    let v66: [[Double]] = [v3, v19, v12, v3]
    var v33: Double = v13
    let v55: [Double] = v66[2]
    var v83: [[Double]] = v66
    let v57: Double = v43 + v9
    let v82: Double = v21[0]
    let v72: [[Double]] = [v12, v8, v12, v55]
    let v31: [Double] = v83[0]
    v43 = v16
    var v74: [[Double]] = v83
    v12[0] = v82
    let v56: [Double] = v74[3]
    let v54: [Double] = v66[1]
    var v42: [Double] = v56
    v8[1] = v10
    v3[1] = v50
    let v60: [Double] = v72[0]
    var v91: [Double] = v42
    v12 = v91
    var v38: [Double] = v60
    var v63: Double = v5
    v91[1] = v63
    v74[2] = v19
    let v51: Double = v31[0]
    let v69: Double = v31[1]
    var v76: Double = v51
    v12[0] = v33
    v8[0] = v24
    let v90: Double = v21[1]
    var v152: [Double] = v38
    let v180: [Double] = v66[3]
    v3[0] = v76
    let v103: [Double] = [v18, v57, v45, v24, v6, v69, v63]
    let v73: Double = v103[3]
    v74[1] = v180
    v8[1] = v90
    v8[1] = v69
    v152[0] = v9
    v38[1] = v1
    v74[0] = v54
    v21[0] = v29
    var v151: [Double] = v152
    v151[0] = v82
    v19[1] = v73
    v38[1] = v23
    return v151
  }
  func f53(_ v0: Double) -> Double {
    var v7: Double = v0
    var v5: Double = v0
    var v2: Double = v5
    let v6: [Double] = [v0, v0]
    var v8: [Double] = v6
    let v10: Double = v6[1]
    let v9: [Double] = f55(v8)
    let v13: Double = v9[1]
    let v11: Double = v6[1]
    v8[0] = v2
    v8[1] = v0
    let v21: [Double] = [v13, v13, v11, v0, v13, v10, v10]
    var v27: [Double] = v21
    v27[6] = v11
    var v15: [Double] = v21
    v2 = v7
    var v25: [Double] = v15
    v27 = v25
    v7 = v11
    let v68: Double = v27[3]
    return v68
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v6: Double = f53(v1)
    let v3: [Double] = v0.p4
    let v11: Double = v3[1]
    var v4: Double = v11
    v4 = v11
    let v15: Double = v4 / v6
    var v49: Double = v15
    return v49
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0]], p2: [[3.0]], p3: [[4.0]], p4: [5.0, 6.0])
    let v1: Double = 7.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 7.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
