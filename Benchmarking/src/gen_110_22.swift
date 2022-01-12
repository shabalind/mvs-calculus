  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s0
    var p1: s1
  }
  func f12(_ v0: Double) -> Double {
    var v4: Double = v0
    var v7: Double = v0
    var v6: Double = v7
    var v2: Double = v4
    var v3: Double = v2
    var v1: Double = v7
    var v18: Double = v3
    let v9: [Double] = [v18, v1, v18, v2, v0]
    var v14: Double = v2
    v2 = v1
    let v12: Double = v9[4]
    v3 = v6
    var v5: [Double] = v9
    var v16: Double = v14
    let v10: Double = v5[1]
    v5[3] = v7
    v5[3] = v14
    v5[4] = v14
    v5[1] = v7
    var v25: [Double] = v5
    var v23: Double = v10
    var v17: [Double] = v25
    var v19: [Double] = v17
    var v33: [Double] = v19
    var v20: Double = v16
    v33[4] = v12
    var v27: Double = v20
    var v35: [Double] = v19
    var v45: [Double] = v17
    let v36: [[Double]] = [v33, v33, v19, v45, v45, v17]
    let v108: [Double] = v36[4]
    var v75: [[Double]] = v36
    let v186: [Double] = v75[4]
    v25 = v33
    let v61: Double = v35[4]
    let v34: [Double] = v75[1]
    let v42: [Double] = v36[1]
    let v145: [Double] = v36[0]
    let v135: [[Double]] = [v35, v35, v108, v34, v186, v42, v145]
    let v68: Double = v23 * v0
    var v85: [Double] = v17
    var v78: [[Double]] = v135
    v17[1] = v61
    v78[2] = v33
    v75[5] = v5
    var v121: [[Double]] = v78
    v75[5] = v35
    let v100: [Double] = v121[1]
    v33[4] = v27
    v35[3] = v4
    let v98: Double = v100[0]
    var v116: [[Double]] = v135
    v116[4] = v85
    v25[1] = v4
    v45[4] = v2
    v121 = v116
    v33[4] = v68
    return v98
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s1]], _ v2: [[s1]], _ v3: Double) -> Double {
    let v8: Double = f12(v3)
    let v11: Double = v3 * v8
    let v44: Double = v3 / v3
    let v61: Double = v11 - v3
    let v150: Double = v44 + v61
    return v150
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0]]), p1: s1(p0: [s0(p0: [[2.0]], p1: [[3.0]]), s0(p0: [[4.0]], p1: [[5.0]])], p1: [s0(p0: [[6.0]], p1: [[7.0]]), s0(p0: [[8.0]], p1: [[9.0]]), s0(p0: [[10.0]], p1: [[11.0]])]))
    let v1: [[s1]] = [[s1(p0: [s0(p0: [[12.0]], p1: [[13.0]]), s0(p0: [[14.0]], p1: [[15.0]])], p1: [s0(p0: [[16.0]], p1: [[17.0]]), s0(p0: [[18.0]], p1: [[19.0]]), s0(p0: [[20.0]], p1: [[21.0]])])], [s1(p0: [s0(p0: [[22.0]], p1: [[23.0]]), s0(p0: [[24.0]], p1: [[25.0]])], p1: [s0(p0: [[26.0]], p1: [[27.0]]), s0(p0: [[28.0]], p1: [[29.0]]), s0(p0: [[30.0]], p1: [[31.0]])])]]
    let v2: [[s1]] = [[s1(p0: [s0(p0: [[32.0]], p1: [[33.0]]), s0(p0: [[34.0]], p1: [[35.0]])], p1: [s0(p0: [[36.0]], p1: [[37.0]]), s0(p0: [[38.0]], p1: [[39.0]]), s0(p0: [[40.0]], p1: [[41.0]])])]]
    let v3: Double = 42.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 42.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
