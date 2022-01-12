  import Dispatch
  func f8(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    var v4: [[Double]] = v0
    let v3: [[[Double]]] = [v0, v4, v4, v0, v1]
    var v7: [[Double]] = v1
    let v6: [[Double]] = v3[4]
    var v8: [[Double]] = v7
    var v9: [[[Double]]] = v3
    v9[3] = v6
    var v5: [[[Double]]] = v9
    let v11: [Double] = v8[0]
    v4[1] = v11
    v9[1] = v1
    var v17: [[[Double]]] = v9
    let v20: [[Double]] = v5[4]
    v17[3] = v20
    var v42: [[[Double]]] = v5
    v9 = v5
    v9[3] = v4
    v17 = v42
    let v39: [[Double]] = v17[3]
    var v51: [[Double]] = v1
    v5[1] = v8
    v17[0] = v51
    return v39
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v2: [[Double]] = f8(v0, v0)
    var v5: [[Double]] = v2
    let v9: [[Double]] = f8(v0, v5)
    let v6: [Double] = v5[0]
    v5[1] = v6
    let v18: [Double] = v0[1]
    let v11: [Double] = v5[1]
    let v14: [[Double]] = [v6, v6, v11, v6]
    let v10: [[Double]] = f8(v0, v9)
    v5[1] = v6
    let v15: [[Double]] = f8(v5, v10)
    let v35: [[Double]] = f8(v9, v10)
    let v21: [[Double]] = f8(v9, v35)
    var v22: [[Double]] = v14
    let v42: [[Double]] = f8(v15, v21)
    let v33: [[Double]] = f8(v2, v42)
    let v58: [Double] = v33[1]
    let v48: Double = v58[0]
    let v47: [Double] = v22[2]
    v22[1] = v18
    let v53: [Double] = v33[0]
    v5[1] = v47
    v5[1] = v53
    return v48
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
