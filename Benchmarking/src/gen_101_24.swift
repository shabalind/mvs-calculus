  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  func f95(_ v0: Double) -> Double {
    var v7: Double = v0
    var v9: Double = v0
    var v1: Double = v0
    var v6: Double = v0
    var v3: Double = v7
    var v2: Double = v1
    var v13: Double = v2
    let v15: [Double] = [v0, v13, v9, v7, v0, v6, v9]
    var v21: [Double] = v15
    let v17: Double = v21[1]
    v21[4] = v2
    var v12: Double = v3
    let v45: Double = v15[0]
    var v19: Double = v17
    v21[2] = v45
    v21[3] = v1
    var v24: [Double] = v15
    let v35: Double = v24[3]
    let v50: Double = v24[5]
    v24[3] = v45
    let v60: [Double] = [v12]
    v24[6] = v50
    var v70: [Double] = v60
    v24[2] = v19
    v70 = v60
    v70[0] = v35
    v70[0] = v3
    let v53: Double = v70[0]
    v70[0] = v45
    return v53
  }
  func f46(_ v0: Double) -> Double {
    var v7: Double = v0
    var v2: Double = v7
    var v1: Double = v0
    var v6: Double = v1
    let v3: Double = f95(v0)
    var v8: Double = v3
    var v5: Double = v0
    var v9: Double = v8
    let v12: Double = f95(v6)
    let v20: Double = f95(v1)
    var v10: Double = v2
    let v18: [Double] = [v1, v3, v8, v7, v5]
    let v15: Double = v18[4]
    let v28: Double = f95(v15)
    var v24: Double = v12
    var v22: [Double] = v18
    let v16: Double = f95(v10)
    v22[2] = v24
    let v17: Double = f95(v20)
    let v37: Double = v22[0]
    v22[0] = v7
    let v19: Double = v18[0]
    v22[4] = v19
    v2 = v0
    v22[3] = v16
    let v33: Double = f95(v28)
    let v31: Double = v18[3]
    v22[3] = v37
    v22[4] = v17
    let v43: Double = v18[2]
    let v59: Double = v22[0]
    v7 = v17
    let v57: Double = v18[4]
    let v102: Double = v18[2]
    var v50: [Double] = v18
    let v143: Double = f95(v59)
    let v83: Double = f95(v143)
    v22[4] = v7
    v22[3] = v83
    let v97: Double = f95(v102)
    v50[1] = v33
    v10 = v143
    v22[3] = v43
    v2 = v97
    v50[0] = v59
    v50[3] = v31
    let v150: Double = v50[0]
    let v158: Double = f95(v57)
    let v175: Double = v158 - v150
    v22[2] = v9
    return v175
  }
  func f29(_ v0: Double) -> Double {
    let v5: Double = f46(v0)
    var v2: Double = v0
    let v7: Double = f46(v5)
    var v3: Double = v0
    var v10: Double = v7
    let v19: Double = f95(v2)
    let v26: Double = f46(v2)
    let v16: Double = f46(v19)
    let v28: Double = v3 * v19
    var v23: Double = v3
    v3 = v5
    var v32: Double = v26
    let v46: [Double] = [v28, v23, v16, v32, v10]
    let v80: Double = v46[3]
    let v117: Double = f95(v80)
    return v117
  }
  @inline(never)
  func f0(_ v0: [[s2]], _ v1: Double) -> Double {
    var v10: [[s2]] = v0
    var v5: Double = v1
    let v8: Double = f29(v5)
    var v18: [[s2]] = v10
    v10 = v0
    let v3: [s2] = v18[1]
    let v14: s2 = v3[0]
    let v12: s0 = v14.p0
    var v16: s0 = v12
    v18[1] = v3
    let v36: [[Double]] = v16.p1
    v18[1] = v3
    var v26: [[Double]] = v36
    let v20: [[Double]] = v12.p1
    let v22: [Double] = v26[0]
    var v56: [Double] = v22
    v18[0] = v3
    let v54: Double = f29(v8)
    let v35: [[Double]] = v12.p1
    v56[0] = v54
    v16.p1 = v20
    let v77: [s2] = v0[1]
    v18[0] = v77
    let v64: Double = v56[0]
    v16.p1 = v35
    return v64
  }
  func benchmark() {
    let v0: [[s2]] = [[s2(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), p1: s1(p0: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), p1: s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])))], [s2(p0: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), p1: s1(p0: s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), p1: s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])))]]
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
