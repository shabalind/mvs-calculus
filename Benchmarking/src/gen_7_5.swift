  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f11(_ v0: [[Double]]) -> [[Double]] {
    let v7: [[[Double]]] = [v0, v0, v0, v0, v0]
    let v1: [[Double]] = v7[2]
    let v5: [Double] = v0[1]
    let v4: Double = v5[0]
    let v8: [Double] = v1[0]
    let v6: [[Double]] = v7[2]
    var v3: [[Double]] = v0
    v3[1] = v8
    var v20: [[[Double]]] = v7
    var v15: [[Double]] = v1
    v3[0] = v8
    var v13: Double = v4
    var v10: [[Double]] = v3
    let v18: [[Double]] = v20[0]
    let v29: [Double] = v15[1]
    var v23: [Double] = v8
    var v24: [Double] = v29
    v20[3] = v1
    v20[3] = v18
    v3[0] = v23
    v20[1] = v18
    v15[0] = v24
    v15[1] = v29
    v24[0] = v13
    let v25: [[Double]] = v20[0]
    let v43: [Double] = v25[0]
    v3[1] = v23
    v3[1] = v43
    let v64: [[Double]] = [v23, v43, v5]
    v3[0] = v24
    var v59: [[Double]] = v0
    var v39: [[Double]] = v64
    var v136: [[Double]] = v64
    var v47: Double = v4
    v10[1] = v5
    let v88: s0 = s0(p0: v39, p1: v6)
    var v61: s0 = v88
    let v105: [[Double]] = v61.p0
    v61.p0 = v136
    v136[0] = v23
    let v110: [[Double]] = v61.p0
    v24[0] = v47
    let v96: s0 = s0(p0: v110, p1: v10)
    let v98: [Double] = v59[1]
    v136[1] = v29
    v61.p0 = v105
    v61.p0 = v136
    v39[2] = v5
    let v58: [[Double]] = v88.p0
    var v86: [[Double]] = v136
    v61.p0 = v39
    let v171: [[[Double]]] = [v58]
    v61.p0 = v39
    v39 = v136
    let v135: [Double] = v59[1]
    let v196: [[Double]] = v171[0]
    v61.p0 = v86
    v59[0] = v98
    v61.p0 = v196
    let v152: [[Double]] = v96.p1
    v39[1] = v135
    return v152
  }
  func f10(_ v0: s0) -> s0 {
    let v3: [[Double]] = v0.p1
    let v7: [[Double]] = v0.p0
    let v9: s0 = s0(p0: v7, p1: v3)
    return v9
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: Double) -> Double {
    var v5: [[s0]] = v0
    let v7: [s0] = v5[2]
    let v4: s0 = v7[0]
    let v3: [[Double]] = v4.p1
    let v11: s0 = f10(v4)
    let v10: [s0] = v0[0]
    let v12: [[Double]] = f11(v3)
    let v24: [[Double]] = v11.p0
    let v19: [[Double]] = f11(v12)
    let v21: [Double] = v24[0]
    var v31: [[Double]] = v12
    v5[1] = v10
    let v14: [[Double]] = f11(v31)
    let v50: [Double] = v19[1]
    v31[1] = v50
    let v27: [Double] = v14[0]
    v31[0] = v27
    v31[0] = v21
    v31[1] = v50
    let v175: Double = v27[0]
    return v175
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])], [s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
