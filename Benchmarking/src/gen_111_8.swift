  import Dispatch
  func f2(_ v0: [[Double]]) -> [[Double]] {
    var v3: [[Double]] = v0
    let v6: [Double] = v0[2]
    v3[1] = v6
    let v2: [Double] = v3[0]
    v3[1] = v2
    v3[1] = v6
    v3 = v0
    v3 = v0
    v3[1] = v2
    let v4: Double = v2[0]
    let v11: [Double] = v3[2]
    let v9: Double = v11[0]
    var v15: [[Double]] = v3
    var v13: [[Double]] = v15
    let v16: [Double] = v15[0]
    var v27: Double = v9
    v13 = v3
    v13[2] = v11
    v13[0] = v16
    let v32: [Double] = [v4]
    let v19: [Double] = v0[2]
    var v57: [Double] = v11
    v15[2] = v57
    v13 = v0
    v15[2] = v32
    let v23: [Double] = v15[0]
    v57[0] = v27
    v13[2] = v23
    v13[0] = v19
    return v13
  }
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: Double) -> Double {
    var v7: [[Double]] = v0
    let v4: [Double] = v2[0]
    v7[2] = v4
    let v5: [Double] = v2[0]
    let v22: Double = v5[0]
    let v35: Double = v22 * v22
    let v29: [Double] = v0[0]
    let v71: [[Double]] = f2(v7)
    v7[1] = v29
    let v30: [Double] = v71[0]
    let v37: Double = v30[0]
    v7[1] = v29
    let v66: [Double] = [v35, v35, v37, v37]
    var v78: [Double] = v66
    let v91: Double = v78[1]
    return v91
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0], [2.0]]
    let v1: [[Double]] = [[3.0], [4.0], [5.0]]
    let v2: [[Double]] = [[6.0], [7.0]]
    let v3: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
