  import Dispatch
  func f72(_ v0: [[Double]]) -> [[Double]] {
    let v2: [Double] = v0[2]
    var v3: [[Double]] = v0
    v3[2] = v2
    v3[0] = v2
    let v12: [Double] = v3[1]
    var v1: [[Double]] = v0
    v3[2] = v2
    var v5: [[Double]] = v3
    let v7: [Double] = v5[2]
    var v6: [Double] = v2
    var v4: [Double] = v12
    var v9: [Double] = v7
    let v11: [Double] = v1[1]
    let v10: [Double] = v3[0]
    v4 = v7
    v3[2] = v12
    let v18: [Double] = v0[0]
    v5[2] = v12
    var v20: [Double] = v11
    let v24: Double = v10[0]
    v4 = v7
    v20[0] = v24
    var v15: [[Double]] = v1
    let v19: [[[Double]]] = [v3, v0, v15]
    v15[1] = v9
    var v17: Double = v24
    v15[1] = v6
    let v30: [[Double]] = v19[0]
    let v16: [[Double]] = v19[0]
    v3[1] = v20
    v3[0] = v6
    var v31: [[[Double]]] = v19
    let v22: Double = v18[0]
    v31[2] = v5
    v4[0] = v17
    v20[0] = v22
    var v36: [[[Double]]] = v31
    v36[2] = v16
    v1[0] = v12
    v36[2] = v30
    v3[0] = v20
    v9[0] = v22
    v15[0] = v4
    let v46: [[Double]] = v36[0]
    return v46
  }
  func f67(_ v0: [[Double]]) -> [[Double]] {
    let v2: [Double] = v0[0]
    var v4: [Double] = v2
    v4 = v2
    var v3: [[Double]] = v0
    let v5: Double = v2[0]
    var v1: [Double] = v2
    v3[0] = v4
    var v8: [[Double]] = v0
    v8[0] = v1
    let v7: Double = v4[0]
    v1[0] = v5
    var v9: [[Double]] = v3
    let v12: [Double] = v8[1]
    let v15: Double = v2[0]
    v3[0] = v12
    v1[0] = v15
    v4[0] = v15
    v4[0] = v5
    v4[0] = v7
    var v34: [[Double]] = v9
    v9[1] = v12
    return v34
  }
  func f63(_ v0: [[Double]]) -> [[Double]] {
    let v2: [[Double]] = f72(v0)
    var v1: [[Double]] = v2
    let v6: [[Double]] = f72(v1)
    let v3: [[Double]] = f72(v1)
    let v9: [[Double]] = f72(v0)
    let v5: [[Double]] = f72(v3)
    let v11: [[Double]] = f72(v5)
    let v12: [Double] = v3[1]
    let v21: [[Double]] = f72(v5)
    let v8: [[Double]] = f72(v1)
    var v36: [Double] = v12
    var v20: [Double] = v12
    let v10: Double = v12[0]
    v36[0] = v10
    let v18: [[Double]] = f72(v0)
    let v24: [[Double]] = f72(v9)
    let v44: Double = v36[0]
    var v28: Double = v44
    v1[1] = v20
    let v43: [[[Double]]] = [v6, v21, v1, v11, v18, v21, v8]
    var v101: [[[Double]]] = v43
    let v121: [[Double]] = v101[4]
    v20[0] = v28
    v101[6] = v24
    return v121
  }
  func f50(_ v0: [[Double]]) -> [[Double]] {
    let v7: [[Double]] = f67(v0)
    var v2: [[Double]] = v7
    let v5: [[Double]] = f67(v7)
    let v1: [Double] = v7[0]
    let v8: [[Double]] = f67(v2)
    v2[0] = v1
    let v9: [[Double]] = f67(v8)
    let v11: [Double] = v5[1]
    let v17: [Double] = v5[0]
    let v10: Double = v1[0]
    var v15: Double = v10
    let v18: Double = v10 * v15
    v2[0] = v1
    v2[0] = v17
    v2[0] = v11
    let v21: [[Double]] = f67(v8)
    var v32: [Double] = v17
    v2[0] = v17
    v2[0] = v17
    var v40: [[Double]] = v9
    v40[0] = v32
    v32[0] = v18
    v2[0] = v32
    let v57: [Double] = v21[1]
    v40[1] = v57
    return v40
  }
  func f43(_ v0: [[Double]]) -> [[Double]] {
    let v4: [Double] = v0[0]
    var v1: [[Double]] = v0
    let v8: [Double] = v1[0]
    var v7: [Double] = v4
    var v6: [[Double]] = v1
    let v3: [Double] = v6[0]
    v6[0] = v3
    v1[0] = v7
    v1[0] = v8
    v6[1] = v8
    let v10: [Double] = v0[0]
    v6[1] = v10
    let v16: [[Double]] = f67(v6)
    let v17: [Double] = v6[1]
    let v20: [[Double]] = f67(v1)
    v1[1] = v17
    let v15: [[Double]] = f67(v1)
    let v42: [[Double]] = f67(v16)
    let v32: [[Double]] = f67(v15)
    let v29: [[Double]] = f67(v42)
    let v34: [[[Double]]] = [v29, v32, v20]
    let v92: [[Double]] = v34[0]
    let v104: [[Double]] = f67(v92)
    v7 = v8
    return v104
  }
  func f38(_ v0: [[Double]]) -> [[Double]] {
    let v6: [[Double]] = f43(v0)
    let v3: [[Double]] = f43(v6)
    return v3
  }
  func f33(_ v0: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f38(v0)
    let v4: [[Double]] = f38(v5)
    let v6: [Double] = v5[0]
    var v10: [[Double]] = v4
    let v7: [[Double]] = f38(v10)
    let v11: [[Double]] = f50(v7)
    let v3: [[Double]] = f43(v7)
    v10[0] = v6
    v10[0] = v6
    let v18: [[[Double]]] = [v10, v5, v11, v4, v4, v3, v11]
    let v17: [[Double]] = v18[1]
    var v31: [[[Double]]] = v18
    v31[2] = v17
    let v148: [[Double]] = v31[4]
    return v148
  }
  func f2(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v2: [[Double]] = f33(v1)
    let v21: [[Double]] = f67(v1)
    let v38: [[[Double]]] = [v1, v2, v21]
    var v31: [[[Double]]] = v38
    var v15: [[[Double]]] = v31
    let v57: [[[[Double]]]] = [v38, v15, v31, v38, v31, v15]
    let v54: [[[Double]]] = v57[3]
    v15[1] = v21
    let v74: [[Double]] = v54[1]
    return v74
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v3: [Double] = v1[1]
    let v10: [[Double]] = f2(v0, v1)
    var v8: [Double] = v3
    let v11: [Double] = v10[1]
    var v19: [[Double]] = v0
    let v16: Double = v11[0]
    v19[2] = v8
    var v21: [Double] = v11
    var v18: [[Double]] = v19
    var v35: Double = v2
    let v32: [[Double]] = f50(v1)
    let v38: [Double] = v32[1]
    var v49: [Double] = v38
    let v46: Double = v21[0]
    v49[0] = v46
    v18[1] = v3
    let v74: Double = v49[0]
    let v63: [Double] = [v16, v35, v74, v74]
    let v73: [[Double]] = f63(v18)
    var v50: [Double] = v63
    let v66: [Double] = v73[2]
    v21 = v49
    let v91: Double = v50[0]
    let v108: Double = v91 * v16
    v49[0] = v35
    v21 = v66
    return v108
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0]]
    let v2: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
