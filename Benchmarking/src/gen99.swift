  import Dispatch
  func f6(_ v0: [[Double]]) -> [[Double]] {
    let v16: [Double] = v0[1]
    var v12: [[Double]] = v0
    var v29: [Double] = v16
    var v51: [[Double]] = v12
    v12[1] = v29
    return v51
  }
  func f3(_ v0: [[Double]], _ v1: [[Double]]) -> [[Double]] {
    let v8: [[Double]] = f6(v0)
    let v4: [Double] = v8[1]
    var v7: [[Double]] = v0
    let v6: [[Double]] = f6(v0)
    var v9: [Double] = v4
    let v12: [[Double]] = f6(v7)
    let v17: [[[Double]]] = [v8, v8, v1, v6, v12, v8]
    let v18: Double = v9[0]
    v9[0] = v18
    v7[1] = v9
    let v29: [[Double]] = v17[5]
    return v29
  }
  @inline(never)
  func f0(_ v0: Double, _ v1: [[Double]]) -> Double {
    var v2: [[Double]] = v1
    let v7: [[Double]] = f6(v2)
    let v6: [Double] = [v0, v0, v0]
    let v3: [Double] = v7[0]
    v2[1] = v3
    v2[1] = v3
    let v5: [[Double]] = f6(v7)
    let v9: [[Double]] = f3(v2, v1)
    v2 = v1
    let v18: [[Double]] = [v3, v3, v3, v3, v3, v3]
    let v8: [[Double]] = f3(v7, v9)
    let v19: [[Double]] = f3(v7, v1)
    let v25: [[Double]] = f3(v1, v19)
    v2[2] = v3
    v2 = v7
    let v29: [[Double]] = f3(v8, v5)
    var v41: [Double] = v6
    let v36: [[Double]] = f6(v5)
    var v58: [Double] = v3
    var v15: [[Double]] = v18
    let v35: [Double] = v29[1]
    var v24: [Double] = v58
    let v27: [[Double]] = f3(v36, v5)
    var v37: [[Double]] = v15
    v15[5] = v24
    v2 = v25
    let v47: [Double] = v37[3]
    let v39: [Double] = v27[2]
    v15 = v37
    let v88: Double = v47[0]
    v2[0] = v24
    v37[4] = v35
    let v59: Double = v41[0]
    v24[0] = v59
    v37[5] = v39
    v37[2] = v24
    return v88
  }
  func benchmark() {
    let v0: Double = 0.0
    let v1: [[Double]] = [[1.0], [2.0], [3.0]]
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = [[1.0], [2.0], [3.0]]
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
