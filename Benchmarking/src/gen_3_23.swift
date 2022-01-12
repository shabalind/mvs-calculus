  import Dispatch
  func f52(_ v0: Double) -> Double {
    var v1: Double = v0
    var v2: Double = v0
    var v4: Double = v1
    var v8: Double = v0
    var v5: Double = v1
    var v3: Double = v8
    var v14: Double = v2
    var v12: Double = v5
    var v10: Double = v5
    var v9: Double = v14
    var v24: Double = v5
    let v6: Double = v2 + v3
    var v18: Double = v2
    let v15: Double = v8 / v6
    var v11: Double = v4
    let v35: Double = v18 * v4
    var v17: Double = v24
    var v20: Double = v5
    var v28: Double = v14
    v10 = v20
    var v25: Double = v12
    var v23: Double = v28
    var v21: Double = v6
    let v55: [Double] = [v35, v17, v21, v28, v8, v10, v15]
    let v49: Double = v55[0]
    v23 = v49
    let v67: [Double] = [v25, v11, v10]
    let v44: [[Double]] = [v67, v67, v67, v67, v67, v67, v67]
    var v57: [Double] = v67
    v57[0] = v23
    var v58: [[Double]] = v44
    v58[0] = v57
    let v304: [Double] = v58[6]
    v57[2] = v9
    let v147: Double = v304[0]
    return v147
  }
  func f34(_ v0: Double) -> Double {
    var v6: Double = v0
    v6 = v0
    let v1: Double = f52(v6)
    let v5: Double = f52(v1)
    var v7: Double = v5
    var v2: Double = v1
    let v10: Double = f52(v2)
    let v16: [Double] = [v5, v1, v2, v0, v7, v10]
    var v30: [Double] = v16
    let v23: Double = v30[4]
    v30[4] = v0
    let v51: Double = f52(v23)
    return v51
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [Double], _ v2: Double) -> Double {
    var v3: [Double] = v1
    let v6: Double = v1[0]
    v3[0] = v2
    var v20: [Double] = v3
    v20[0] = v6
    var v9: Double = v6
    var v24: Double = v2
    v20[0] = v6
    v3[0] = v24
    var v17: Double = v9
    v3[0] = v2
    v20[0] = v24
    v20[0] = v2
    v20[0] = v17
    var v10: [Double] = v20
    let v29: Double = v10[0]
    v10[0] = v6
    let v14: Double = v3[0]
    v20[0] = v14
    v20[0] = v2
    v20[0] = v24
    var v99: Double = v2
    let v230: Double = f34(v24)
    v3[0] = v17
    v3[0] = v9
    v20[0] = v230
    let v128: Double = v29 + v99
    return v128
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [Double] = [3.0]
    let v2: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
