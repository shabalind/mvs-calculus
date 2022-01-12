  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s2 {
    var p0: [s0]
    var p1: s0
  }
  func f4(_ v0: [Double]) -> [Double] {
    let v6: Double = v0[0]
    let v5: Double = v0[0]
    let v2: Double = v0[0]
    let v1: Double = v0[0]
    var v9: [Double] = v0
    v9 = v0
    v9[0] = v5
    v9[0] = v6
    var v8: Double = v6
    v9[0] = v6
    var v14: Double = v2
    v9 = v0
    let v16: Double = v0[0]
    let v10: Double = v9[0]
    v8 = v14
    var v19: [Double] = v0
    v9[0] = v1
    var v50: [Double] = v9
    var v29: [Double] = v19
    let v15: Double = v29[0]
    var v20: [Double] = v0
    v9[0] = v16
    let v26: [[Double]] = [v0]
    var v24: [Double] = v20
    v9[0] = v15
    let v38: Double = v9[0]
    let v17: [Double] = v26[0]
    var v33: [[Double]] = v26
    var v39: [Double] = v17
    var v58: [[Double]] = v26
    v33 = v26
    v39[0] = v15
    let v44: Double = v19[0]
    var v27: [Double] = v50
    let v23: [Double] = v58[0]
    var v47: [Double] = v50
    let v40: [Double] = v58[0]
    let v22: [Double] = v33[0]
    let v31: [Double] = v33[0]
    var v45: Double = v8
    v27[0] = v45
    let v46: [Double] = v58[0]
    v50[0] = v38
    let v59: [[Double]] = [v0, v24, v27, v29, v46]
    let v70: [[Double]] = [v47, v22, v39, v24, v31, v23]
    let v62: [Double] = v70[1]
    let v112: Double = v29[0]
    v39[0] = v14
    v27[0] = v112
    let v91: [Double] = v59[3]
    v39[0] = v44
    let v28: [[Double]] = [v62, v40, v24, v0, v91, v50, v31]
    let v109: Double = v46[0]
    var v88: [[Double]] = v28
    let v87: [Double] = v88[4]
    v19[0] = v10
    v47[0] = v109
    return v87
  }
  @inline(never)
  func f0(_ v0: [s2], _ v1: s0, _ v2: [s1], _ v3: Double) -> Double {
    var v5: Double = v3
    let v6: [[Double]] = v1.p1
    let v13: [Double] = v6[0]
    let v8: [Double] = f4(v13)
    let v45: [Double] = f4(v8)
    var v31: Double = v5
    let v46: Double = v45[0]
    let v47: Double = v31 - v46
    return v47
  }
  func benchmark() {
    let v0: [s2] = [s2(p0: [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]]))]
    let v1: s0 = s0(p0: [[15.0], [16.0], [17.0]], p1: [[18.0], [19.0]])
    let v2: [s1] = [s1(p0: [s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0], [24.0]])], p1: [[s0(p0: [[25.0], [26.0], [27.0]], p1: [[28.0], [29.0]])], [s0(p0: [[30.0], [31.0], [32.0]], p1: [[33.0], [34.0]])]])]
    let v3: Double = 35.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 35.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
