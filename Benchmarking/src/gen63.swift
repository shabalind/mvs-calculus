  import Dispatch
  func f69(_ v0: [[Double]]) -> [[Double]] {
    return v0
  }
  func f63(_ v0: [[Double]]) -> [[Double]] {
    let v2: [[Double]] = f69(v0)
    let v7: [[Double]] = f69(v0)
    var v4: [[Double]] = v0
    let v5: [Double] = v7[0]
    let v11: [[Double]] = f69(v2)
    let v20: [[Double]] = f69(v11)
    var v12: [Double] = v5
    let v24: [Double] = v2[0]
    let v45: [[Double]] = f69(v4)
    let v31: Double = v24[0]
    let v25: [[Double]] = f69(v20)
    let v37: [[Double]] = f69(v45)
    let v49: [Double] = v25[0]
    let v96: Double = v49[0]
    var v65: Double = v96
    var v114: [Double] = v12
    v12[0] = v96
    var v93: Double = v31
    let v78: [Double] = v37[0]
    var v97: [Double] = v114
    v114[0] = v65
    var v100: [[Double]] = v7
    var v95: [Double] = v78
    v114 = v95
    v65 = v93
    v100[0] = v97
    return v100
  }
  func f39(_ v0: [Double], _ v1: [[Double]]) -> [[Double]] {
    let v2: [[[Double]]] = [v1, v1, v1]
    var v6: [[[Double]]] = v2
    v6 = v2
    let v3: [[Double]] = v6[0]
    let v16: [[Double]] = f63(v3)
    let v32: [[Double]] = f63(v1)
    v6[0] = v32
    return v16
  }
  func f13(_ v0: [[Double]]) -> [[Double]] {
    var v7: [[Double]] = v0
    var v8: [[Double]] = v0
    let v9: [Double] = v8[0]
    let v4: [[Double]] = [v9, v9, v9, v9, v9, v9]
    var v11: [[Double]] = v4
    let v16: [[Double]] = f39(v9, v7)
    var v26: [[Double]] = v11
    v7 = v0
    var v10: [Double] = v9
    let v27: Double = v9[0]
    var v18: Double = v27
    var v30: [Double] = v10
    let v25: [Double] = v4[0]
    let v22: [Double] = v26[4]
    let v24: [[Double]] = f63(v8)
    let v29: [[Double]] = f39(v22, v16)
    v8[0] = v30
    v11[0] = v30
    v30[0] = v18
    v7 = v24
    v11[2] = v25
    return v29
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    let v4: [Double] = v2[0]
    let v13: [[Double]] = f13(v2)
    let v23: [Double] = v13[0]
    var v14: [Double] = v4
    v14 = v23
    v14[0] = v3
    let v118: Double = v14[0]
    var v54: Double = v118
    var v90: Double = v54
    v14[0] = v54
    return v90
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0], [2.0]]
    let v2: [[Double]] = [[3.0]]
    let v3: Double = 4.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 4.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
