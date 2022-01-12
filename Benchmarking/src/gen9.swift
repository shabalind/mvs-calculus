  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s3 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s4 {
    var p0: s0
    var p1: [s0]
  }
  func f20(_ v0: s4) -> s4 {
    let v7: [s0] = v0.p1
    var v3: [s0] = v7
    var v4: [s0] = v7
    let v5: [s4] = [v0, v0, v0, v0, v0, v0, v0]
    let v6: s0 = v0.p0
    let v8: s0 = v3[1]
    let v14: [s0] = v0.p1
    let v1: s0 = v4[0]
    let v2: [s0] = v0.p1
    var v9: [s0] = v14
    var v12: s0 = v1
    var v17: s0 = v6
    var v13: s0 = v1
    let v19: s4 = v5[3]
    var v23: s0 = v6
    v9[0] = v12
    let v24: [[Double]] = v17.p1
    var v18: s0 = v8
    v17.p1 = v24
    v4[0] = v6
    let v27: s0 = v0.p0
    v3[0] = v13
    v18.p1 = v24
    let v37: s0 = v14[2]
    v18.p1 = v24
    let v28: s0 = v9[0]
    var v20: [s4] = v5
    let v16: [[Double]] = v28.p1
    let v38: [[[Double]]] = [v24, v24, v24, v24, v16, v16, v24]
    v18 = v28
    var v33: [s0] = v2
    v17.p1 = v16
    v12.p1 = v16
    v20[6] = v0
    var v22: s4 = v0
    let v50: [[Double]] = v27.p1
    let v25: [[[Double]]] = [v24, v16, v16, v16, v50, v24, v50]
    let v42: [[Double]] = v37.p0
    let v57: [s0] = v19.p1
    let v43: s4 = v20[2]
    let v72: [[Double]] = v8.p0
    let v108: s0 = v57[2]
    v33[1] = v1
    let v68: [[Double]] = v38[6]
    let v36: [[Double]] = v108.p1
    let v29: s4 = v20[6]
    var v40: [s4] = v20
    v40[5] = v22
    v40[2] = v43
    var v70: [s0] = v33
    v12.p1 = v36
    var v75: [[Double]] = v72
    v13.p1 = v24
    v18.p1 = v68
    v12.p0 = v75
    v22.p0 = v1
    v20 = v40
    let v65: [[Double]] = v25[1]
    v3[0] = v18
    v12.p0 = v42
    v17.p1 = v65
    var v140: [s4] = v5
    var v60: s4 = v43
    v20[1] = v29
    v22.p0 = v28
    v60.p1 = v7
    v40 = v140
    v18.p0 = v75
    v12.p0 = v42
    v60.p0 = v18
    v18.p0 = v42
    v60.p1 = v9
    v3[2] = v23
    v60 = v0
    v23.p0 = v42
    v13.p1 = v68
    v22.p0 = v1
    v18.p0 = v42
    v33[0] = v28
    v22.p1 = v70
    return v60
  }
  func f18(_ v0: s0) -> s0 {
    let v2: [s0] = [v0, v0, v0]
    let v4: s0 = v2[0]
    var v14: [s0] = v2
    let v3: s0 = v2[2]
    let v12: s1 = s1(p0: v4, p1: v3)
    var v6: s1 = v12
    let v13: s0 = v2[0]
    var v9: [s0] = v2
    v14[2] = v3
    v6.p0 = v3
    var v42: s1 = v6
    let v50: s0 = v42.p1
    let v31: [[s0]] = [v2, v2, v9, v14]
    v14[1] = v0
    var v64: [[s0]] = v31
    let v169: [s0] = v64[2]
    v6.p0 = v13
    v9[0] = v50
    let v112: s4 = s4(p0: v3, p1: v169)
    let v157: s4 = f20(v112)
    let v128: s4 = f20(v157)
    let v105: s0 = v128.p0
    return v105
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: [[s3]], _ v2: Double) -> Double {
    let v4: [s3] = v1[0]
    var v6: Double = v2
    let v12: s3 = v4[0]
    let v18: [s0] = v12.p1
    let v19: s0 = v18[2]
    let v21: s0 = f18(v19)
    let v10: [[Double]] = v21.p0
    var v44: Double = v6
    let v38: [Double] = v10[0]
    let v69: Double = v38[0]
    var v85: Double = v69
    v85 = v69
    v85 = v44
    return v85
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), p1: s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])), s1(p0: s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]]), p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))]
    let v1: [[s3]] = [[s3(p0: [s0(p0: [[16.0]], p1: [[17.0], [18.0], [19.0]])], p1: [s0(p0: [[20.0]], p1: [[21.0], [22.0], [23.0]]), s0(p0: [[24.0]], p1: [[25.0], [26.0], [27.0]]), s0(p0: [[28.0]], p1: [[29.0], [30.0], [31.0]])])], [s3(p0: [s0(p0: [[32.0]], p1: [[33.0], [34.0], [35.0]])], p1: [s0(p0: [[36.0]], p1: [[37.0], [38.0], [39.0]]), s0(p0: [[40.0]], p1: [[41.0], [42.0], [43.0]]), s0(p0: [[44.0]], p1: [[45.0], [46.0], [47.0]])])], [s3(p0: [s0(p0: [[48.0]], p1: [[49.0], [50.0], [51.0]])], p1: [s0(p0: [[52.0]], p1: [[53.0], [54.0], [55.0]]), s0(p0: [[56.0]], p1: [[57.0], [58.0], [59.0]]), s0(p0: [[60.0]], p1: [[61.0], [62.0], [63.0]])])]]
    let v2: Double = 64.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 64.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
