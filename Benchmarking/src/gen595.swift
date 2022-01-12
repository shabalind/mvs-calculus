  import Dispatch
  func f66(_ v0: Double) -> Double {
    let v3: [Double] = [v0, v0, v0, v0, v0, v0]
    let v2: [Double] = [v0, v0, v0, v0, v0, v0, v0]
    var v4: [Double] = v3
    var v1: Double = v0
    let v7: Double = v2[6]
    let v11: Double = v7 * v7
    let v13: Double = v2[6]
    let v6: [Double] = [v11, v13, v1, v11]
    var v9: [Double] = v6
    var v19: [Double] = v2
    var v22: [Double] = v4
    var v20: [Double] = v19
    var v29: [Double] = v6
    let v24: Double = v20[4]
    var v21: Double = v1
    let v28: Double = v0 - v24
    let v56: Double = v29[2]
    let v14: Double = v19[2]
    var v34: [Double] = v29
    let v67: Double = v20[6]
    var v47: Double = v7
    var v37: [Double] = v6
    let v61: Double = v3[2]
    v19[1] = v47
    let v31: Double = v20[3]
    let v43: [[Double]] = [v3, v22]
    let v69: Double = v20[1]
    v4[1] = v61
    var v40: [Double] = v9
    v1 = v67
    var v46: [Double] = v29
    v34[2] = v28
    v9[0] = v1
    var v53: [Double] = v19
    v20[0] = v14
    var v42: [Double] = v2
    v40 = v46
    let v106: Double = v2[2]
    var v64: [Double] = v42
    var v118: [Double] = v64
    var v60: [[Double]] = v43
    v64[4] = v21
    v60[0] = v22
    var v63: [Double] = v118
    v63[3] = v106
    v42[5] = v7
    let v128: [Double] = v60[1]
    v22[4] = v106
    v4[5] = v56
    v34 = v37
    v4[5] = v69
    v34[3] = v13
    let v77: Double = v128[0]
    var v171: [Double] = v34
    let v135: Double = v63[2]
    let v121: Double = v19[1]
    v20 = v118
    v19[1] = v121
    v53[5] = v135
    v171[1] = v77
    let v80: Double = v53[6]
    v34 = v40
    v37[1] = v31
    let v152: Double = v171[0]
    v42[6] = v80
    return v152
  }
  func f7(_ v0: [Double]) -> [Double] {
    let v4: Double = v0[0]
    var v6: [Double] = v0
    v6 = v0
    v6[0] = v4
    v6[0] = v4
    let v2: Double = f66(v4)
    v6[0] = v2
    var v1: [Double] = v0
    let v7: Double = f66(v4)
    let v3: Double = v6[0]
    v1[0] = v3
    let v11: Double = f66(v7)
    v1[0] = v11
    let v9: Double = v0[0]
    v6 = v1
    v6[0] = v2
    let v13: Double = v1[0]
    v1 = v0
    v1[0] = v11
    v6[0] = v11
    let v15: Double = f66(v13)
    var v18: Double = v9
    v1[0] = v18
    v1[0] = v13
    v6[0] = v9
    var v60: [Double] = v1
    v6[0] = v15
    return v60
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v2: [Double] = v0[1]
    let v3: [Double] = f7(v2)
    var v11: [Double] = v3
    let v12: Double = v11[0]
    return v12
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
