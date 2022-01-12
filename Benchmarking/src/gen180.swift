  import Dispatch
  func f29(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v6: [[[Double]]] = [v1, v1, v1, v1]
    var v7: [[[Double]]] = v6
    let v17: [[Double]] = v6[2]
    v7[0] = v17
    let v33: [[Double]] = v7[1]
    v7 = v6
    var v82: [[[Double]]] = v7
    v7[1] = v17
    v7 = v82
    return v33
  }
  func f26(_ v0: [[Double]]) -> [[Double]] {
    return v0
  }
  func f17(_ v0: [[Double]]) -> [[Double]] {
    let v4: [[Double]] = f26(v0)
    let v13: [[Double]] = f26(v4)
    let v1: [[Double]] = f26(v4)
    var v18: [[Double]] = v1
    v18 = v13
    let v54: [[Double]] = f26(v18)
    return v54
  }
  func f15(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v5: [[Double]] = f17(v1)
    let v28: [[Double]] = f26(v5)
    let v60: [[Double]] = f17(v28)
    return v60
  }
  func f10(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v7: [Double] = v0[1]
    var v3: [[Double]] = v0
    var v6: [Double] = v7
    let v2: Double = v7[0]
    v6[0] = v2
    let v13: [[Double]] = f15(v0, v3)
    let v5: [Double] = v13[1]
    var v16: [Double] = v5
    let v54: [[Double]] = [v6, v16]
    var v26: [[Double]] = v54
    let v37: [[Double]] = f29(v26, v1)
    let v46: [Double] = v1[1]
    v26[1] = v46
    return v37
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: Double) -> Double {
    let v3: [[Double]] = f26(v0)
    let v4: [[Double]] = f10(v0, v3)
    let v5: [Double] = v4[2]
    var v7: [Double] = v5
    let v2: [Double] = v3[0]
    v7[0] = v1
    v7[0] = v1
    v7[0] = v1
    v7[0] = v1
    v7[0] = v1
    v7[0] = v1
    let v10: Double = v1 / v1
    var v15: Double = v1
    let v11: Double = v2[0]
    v7[0] = v11
    v15 = v11
    v7[0] = v10
    let v29: Double = v7[0]
    let v16: Double = v29 * v15
    let v43: [Double] = [v1, v16, v10]
    v7[0] = v16
    v7[0] = v11
    let v37: Double = v43[2]
    v7[0] = v29
    return v37
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
