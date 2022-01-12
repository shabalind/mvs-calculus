  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f49(_ v0: Double) -> Double {
    var v4: Double = v0
    let v8: Double = v0 / v0
    let v3: Double = v8 + v0
    v4 = v8
    var v5: Double = v3
    var v7: Double = v8
    var v6: Double = v8
    var v1: Double = v6
    var v16: Double = v4
    var v15: Double = v8
    var v10: Double = v3
    var v13: Double = v7
    var v17: Double = v4
    v5 = v0
    var v18: Double = v0
    var v28: Double = v4
    var v11: Double = v1
    let v14: [Double] = [v15, v10, v7, v7, v8, v15, v11]
    var v24: Double = v18
    var v21: [Double] = v14
    v21[1] = v5
    v21[2] = v10
    var v20: [Double] = v14
    var v12: [Double] = v20
    v12[0] = v16
    var v22: [Double] = v21
    v21[1] = v1
    var v29: [Double] = v14
    let v35: Double = v12[0]
    var v53: Double = v3
    v20[3] = v17
    var v44: [Double] = v22
    let v50: [[Double]] = [v44, v14, v44]
    var v48: [[Double]] = v50
    v22[5] = v10
    let v30: [Double] = v50[0]
    let v70: Double = v20[5]
    var v81: [[Double]] = v48
    let v46: [Double] = v81[0]
    v20[1] = v35
    var v49: Double = v3
    v81[1] = v46
    v21 = v29
    v29[3] = v53
    v21[3] = v28
    v44[2] = v49
    var v72: Double = v24
    let v93: [Double] = v81[2]
    v13 = v72
    v22[2] = v7
    v44[2] = v13
    let v130: Double = v93[1]
    v21[1] = v70
    v48[1] = v20
    v44[5] = v6
    v6 = v8
    v12 = v30
    return v130
  }
  func f23(_ v0: Double) -> Double {
    var v5: Double = v0
    let v1: Double = f49(v5)
    var v10: Double = v1
    let v8: [Double] = [v10]
    let v11: Double = f49(v0)
    let v24: [[Double]] = [v8, v8, v8, v8, v8, v8]
    var v16: [[Double]] = v24
    v16[3] = v8
    v16[4] = v8
    let v28: [Double] = v24[1]
    let v42: [Double] = v16[5]
    let v180: Double = v42[0]
    v5 = v11
    v16[1] = v28
    return v180
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: [s0], _ v2: Double) -> Double {
    let v5: Double = f23(v2)
    let v18: Double = f23(v2)
    let v14: Double = f49(v2)
    let v17: Double = f49(v5)
    let v67: Double = v17 * v17
    let v24: Double = v2 + v2
    let v25: Double = f23(v18)
    let v57: [Double] = [v5, v67, v14, v2, v25, v14]
    let v61: Double = v57[3]
    let v38: Double = v24 * v61
    return v38
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])
    let v1: [s0] = [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]), s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]
    let v2: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
