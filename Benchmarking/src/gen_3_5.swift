  import Dispatch
  func f5(_ v0: [[Double]]) -> [[Double]] {
    return v0
  }
  func f4(_ v0: [[Double]]) -> [[Double]] {
    let v2: [Double] = v0[0]
    var v1: [Double] = v2
    let v3: [Double] = v0[0]
    var v28: [[Double]] = v0
    var v24: [[Double]] = v0
    var v21: [[Double]] = v24
    var v23: [[Double]] = v24
    v21[0] = v1
    var v32: [Double] = v3
    let v39: [[[Double]]] = [v23, v24, v21, v21, v28, v28]
    v21[0] = v32
    let v57: [[Double]] = v39[3]
    return v57
  }
  func f3(_ v0: Double, _ v1: [[Double]], _ v2: [[Double]]) -> Double {
    let v4: [Double] = v2[0]
    var v23: [Double] = v4
    v23[0] = v0
    let v16: Double = v4[0]
    var v20: Double = v16
    let v46: Double = v0 + v20
    var v42: Double = v0
    let v24: Double = v4[0]
    let v102: [Double] = [v20, v46, v42]
    let v83: Double = v102[2]
    let v107: Double = v23[0]
    let v179: Double = v83 * v24
    v20 = v107
    return v179
  }
  func f2(_ v0: [[Double]]) -> [[Double]] {
    let v10: [[Double]] = f5(v0)
    let v30: [[Double]] = f5(v10)
    let v25: [[Double]] = f5(v30)
    var v38: [[Double]] = v25
    let v43: [[Double]] = f5(v38)
    let v114: [[[Double]]] = [v43]
    var v45: [[[Double]]] = v114
    let v62: [[Double]] = v45[0]
    let v145: [[Double]] = f5(v62)
    return v145
  }
  func f1(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]]) -> [[Double]] {
    let v8: [[Double]] = f4(v2)
    let v4: [Double] = v1[2]
    let v7: [[Double]] = f5(v0)
    var v5: [[Double]] = v1
    let v10: [[Double]] = f2(v7)
    let v18: [Double] = v10[1]
    let v13: [[Double]] = f5(v10)
    let v30: [Double] = v8[0]
    let v16: [Double] = v13[0]
    v5[2] = v4
    var v21: [[Double]] = v1
    v21[0] = v16
    let v53: [Double] = v7[0]
    v21[0] = v4
    v21[1] = v30
    let v28: [[[Double]]] = [v21, v5]
    v21[2] = v53
    let v37: [[Double]] = v28[0]
    let v79: [Double] = v37[0]
    var v62: [[Double]] = v2
    v62[0] = v18
    var v111: [[Double]] = v62
    let v57: [[Double]] = v28[0]
    let v76: [Double] = v57[1]
    v62[0] = v79
    v5[1] = v76
    return v111
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v7: Double = v3 / v3
    var v6: [[Double]] = v1
    let v9: [[Double]] = f1(v0, v2, v1)
    let v10: Double = f3(v7, v0, v1)
    let v15: [Double] = v9[0]
    let v11: [[Double]] = f4(v6)
    v6[0] = v15
    let v8: Double = f3(v10, v0, v6)
    let v12: [[Double]] = f5(v0)
    let v35: Double = v8 - v7
    let v38: Double = f3(v35, v12, v11)
    return v38
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0]]
    let v2: [[Double]] = [[3.0], [4.0], [5.0]]
    let v3: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
